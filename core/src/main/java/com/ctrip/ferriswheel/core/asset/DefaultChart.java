package com.ctrip.ferriswheel.core.asset;

import com.ctrip.ferriswheel.core.action.UpdateChart;
import com.ctrip.ferriswheel.core.bean.DynamicValue;
import com.ctrip.ferriswheel.core.formula.CellReferenceElement;
import com.ctrip.ferriswheel.core.formula.FormulaElement;
import com.ctrip.ferriswheel.core.formula.RangeReferenceElement;
import com.ctrip.ferriswheel.core.formula.ReferenceElement;
import com.ctrip.ferriswheel.core.ref.CellRef;
import com.ctrip.ferriswheel.core.ref.RangeRef;
import com.ctrip.ferriswheel.core.view.Layout;
import com.ctrip.ferriswheel.core.action.UpdateChart;
import com.ctrip.ferriswheel.core.bean.Axis;
import com.ctrip.ferriswheel.core.bean.ChartData;
import com.ctrip.ferriswheel.core.bean.DynamicValue;
import com.ctrip.ferriswheel.core.bean.Value;
import com.ctrip.ferriswheel.core.formula.CellReferenceElement;
import com.ctrip.ferriswheel.core.formula.FormulaElement;
import com.ctrip.ferriswheel.core.formula.RangeReferenceElement;
import com.ctrip.ferriswheel.core.formula.ReferenceElement;
import com.ctrip.ferriswheel.core.intf.*;
import com.ctrip.ferriswheel.core.ref.CellRef;
import com.ctrip.ferriswheel.core.ref.RangeRef;
import com.ctrip.ferriswheel.core.view.ChartLayout;
import com.ctrip.ferriswheel.core.view.Layout;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class DefaultChart extends NamedAssetNode implements Chart {
    private String type;
    private final ValueNode title;
    private final ValueNode categories;
    private final AssetList<DefaultDataSeries> seriesList;
    private Axis xAxis;
    private Axis yAxis;
    private Axis zAxis;
    private final ChartLayout layout = new ChartLayout();
    private DefaultChartBinder binder;

    DefaultChart(String name, String type, DefaultSheet sheet) {
        super(name, sheet.getWorkbook().getAssetManager());
        setSheet(sheet);
        this.type = type;
        this.title = new ValueNode(getAssetManager(), Value.BLANK, null);
        this.categories = new ValueNode(getAssetManager(), Value.BLANK, null);
        this.seriesList = new AssetList<>(this);

        bindChild(title);
        bindChild(categories);
    }

    @Override
    public String toString() {
        return "DefaultChart{" +
                "type='" + type + '\'' +
                ", title=" + title +
                ", categories=" + categories +
                ", seriesList=" + seriesList +
                '}';
    }

    public void toString(StringBuilder sb) {
        sb.append(toString());
    }

    @Override
    public int getSeriesCount() {
        return seriesList == null ? 0 : seriesList.size();
    }

    @Override
    public DefaultDataSeries getSeries(int i) {
        return seriesList.get(i);
    }

    public DefaultSheet getSheet() {
        return (DefaultSheet) getParentAsset();
    }

    void setSheet(DefaultSheet sheet) {
        setParentAsset(sheet);
    }

    @Override
    public String getType() {
        return type;
    }

    void setType(String type) {
        this.type = type;
    }

    public ValueNode getTitle() {
        return title;
    }

    public void setTitle(DynamicVariant title) {
        this.title.setDynamicVariant(title);
    }

    public ValueNode getCategories() {
        return categories;
    }

    public void setCategories(DynamicVariant categories) {
        this.categories.setDynamicVariant(categories);
    }

    public List<DefaultDataSeries> getSeriesList() {
        return Collections.unmodifiableList(seriesList); // internal list is not allowed to modify directly.
    }

    public void addSeries(DynamicVariant name, DynamicVariant xValues, DynamicVariant yValues) {
        DefaultDataSeries series = new DefaultDataSeries(getAssetManager());
        if (name != null) {
            series.setName(new ValueNode(getAssetManager(), name));
        }
        if (xValues != null) {
            series.setxValues(new ValueNode(getAssetManager(), xValues));
        }
        if (yValues != null) {
            series.setyValues(new ValueNode(getAssetManager(), yValues));
        }
        seriesList.add(series);
    }

    void clearSeries() {
        seriesList.clear();
    }

    public Axis getxAxis() {
        return xAxis;
    }

    public void setxAxis(Axis xAxis) {
        this.xAxis = xAxis;
    }

    public Axis getyAxis() {
        return yAxis;
    }

    public void setyAxis(Axis yAxis) {
        this.yAxis = yAxis;
    }

    public Axis getzAxis() {
        return zAxis;
    }

    public void setzAxis(Axis zAxis) {
        this.zAxis = zAxis;
    }

    @Override
    public Layout getLayout() {
        return layout;
    }

    @Override
    public DefaultChartBinder getBinder() {
        return binder;
    }

    void setBinder(DefaultChartBinder binder) {
        if (this.binder != null) {
            unbindChild(this.binder);
            if (getDependencies() != null) {
                getDependencies().remove(this.binder.getData().getAssetId());
            }
        }
        this.binder = binder;
        if (this.binder != null) {
            bindChild(this.binder);
            addDependencies(this.binder.getData().getAssetId());
        }
    }

    void rebind() {
        if (binder == null) {
            throw new IllegalStateException("Binder is null.");
        }

        ValueNode data = binder.getData();
        if (!data.isFormula() || data.getFormulaElements().length != 1
                || !(data.getFormulaElements()[0] instanceof ReferenceElement)) {
            throw new RuntimeException("Data area must be a formula with single reference element.");
        }

        RangeRef rangeRef = null;
        FormulaElement elem = data.getFormulaElements()[0];
        if (elem instanceof CellReferenceElement) {
            CellRef cellRef = ((CellReferenceElement) elem).getCellRef();
            rangeRef = new RangeRef(cellRef, cellRef);
        } else if (elem instanceof RangeReferenceElement) {
            rangeRef = ((RangeReferenceElement) elem).getRangeRef();
        }
        DefaultSheet sheet = getSheet();
        if (rangeRef.sheetName() != null) {
            sheet = sheet.getWorkbook().getSheet(rangeRef.sheetName());
        }
        if (sheet == null) {
            throw new RuntimeException("Failed to get referred sheet.");
        }
        DefaultTable table = sheet.getTable(rangeRef.tableName());
        if (table == null) {
            clearData();
            getSheet().publicly(new UpdateChart(getSheet().getName(),
                    getName(), new ChartData(this)), () -> {
                // just publish the action
            });
            // throw new RuntimeException("Failed to get referred table.");
            return;
        }

        int left = rangeRef.getLeft();
        int top = rangeRef.getTop();
        int right = rangeRef.getRight();
        int bottom = rangeRef.getBottom();

        if (left == -1) {
            left = 0;
        }
        if (top == -1) {
            top = 0;
        }
        if (right == -1) {
            right = table.getColumnCount() - 1;
        }
        if (bottom == -1) {
            bottom = table.getRowCount() - 1;
        }

        if (left > right || top > bottom) {
            clearData();
        } else if (binder.getOrientation() == Orientation.HORIZONTAL) {
            bindHorizontally(table, left, top, right, bottom);
        } else if (binder.getOrientation() == Orientation.VERTICAL) {
            bindVertically(table, left, top, right, bottom);
        }

        getSheet().publicly(new UpdateChart(getSheet().getName(),
                getName(), new ChartData(this)), () -> {
            // just publish the action
        });
    }

    private void clearData() {
        setCategories(new DynamicValue(Value.BLANK));
        clearSeries();
    }

    private void bindHorizontally(DefaultTable table, int left, int top, int right, int bottom) {
        boolean hasCategories = binder.getCategoriesPlacement() != null;
        boolean hasSeriesName = binder.getSeriesNamePlacement() != null;

        int dataStartRow = top;
        int dataEndRow = bottom;
        int dataStartColumn = left;
        int dataEndColumn = right;

        if (binder.getSeriesNamePlacement() == Placement.LEFT) {
            dataStartColumn++;
        } else if (binder.getSeriesNamePlacement() == Placement.RIGHT) {
            dataEndColumn--;
        } else if (hasSeriesName) {
            throw new RuntimeException("Illegal series name placement.");
        }

        if (binder.getCategoriesPlacement() == Placement.TOP) {
            dataStartRow++;
        } else if (binder.getCategoriesPlacement() == Placement.BOTTOM) {
            dataEndRow--;
        } else if (hasCategories) {
            throw new RuntimeException("Illegal categories placement.");
        }

        if (dataStartColumn > dataEndColumn || dataStartRow > dataEndRow) {
            clearData();
            return;
        }

        int rowIdx = -1, columnIdx;
        DynamicValue categories = null;

        if (binder.getCategoriesPlacement() == Placement.TOP) {
            rowIdx = top;
        } else if (binder.getCategoriesPlacement() == Placement.BOTTOM) {
            rowIdx = bottom;
        } else if (hasCategories) {
            throw new RuntimeException("Illegal categories placement.");
        }

        if (rowIdx != -1) {
            List<Variant> ls = new ArrayList<>(dataEndColumn - dataStartColumn + 1);
            for (int i = dataStartColumn; i <= dataEndColumn; i++) {
                ls.add(table.getCell(rowIdx, i).getValue());
            }
            categories = new DynamicValue(Value.list(ls));
        }

        setCategories(categories);
        clearSeries();

        for (rowIdx = dataStartRow; rowIdx <= dataEndRow; rowIdx++) {
            columnIdx = -1;
            DynamicValue name = null;
            DynamicValue xValues = null;
            DynamicValue yValues = null;
            DynamicValue zValues = null;

            if (binder.getSeriesNamePlacement() == Placement.LEFT) {
                columnIdx = left;
            } else if (binder.getSeriesNamePlacement() == Placement.RIGHT) {
                columnIdx = right;
            }

            if (columnIdx != -1) {
                name = new DynamicValue(Value.from(table.getCell(rowIdx, columnIdx).getValue()));
            }

            List<Variant> ls = new ArrayList<>(dataEndColumn - dataStartColumn + 1);
            for (int i = dataStartColumn; i <= dataEndColumn; i++) {
                ls.add(table.getCell(rowIdx, i).getValue());
            }
            yValues = new DynamicValue(Value.list(ls));

            addSeries(name, xValues, yValues);
        }
    }

    private void bindVertically(DefaultTable table, int left, int top, int right, int bottom) {
        boolean hasCategories = binder.getCategoriesPlacement() != null;
        boolean hasSeriesName = binder.getSeriesNamePlacement() != null;

        int dataStartRow = top;
        int dataEndRow = bottom;
        int dataStartColumn = left;
        int dataEndColumn = right;

        if (binder.getSeriesNamePlacement() == Placement.TOP) {
            dataStartRow++;
        } else if (binder.getSeriesNamePlacement() == Placement.BOTTOM) {
            dataEndRow--;
        } else if (hasSeriesName) {
            throw new RuntimeException("Illegal series name placement.");
        }

        if (binder.getCategoriesPlacement() == Placement.LEFT) {
            dataStartColumn++;
        } else if (binder.getCategoriesPlacement() == Placement.RIGHT) {
            dataEndColumn--;
        } else if (hasCategories) {
            throw new RuntimeException("Illegal categories placement.");
        }

        if (dataStartColumn > dataEndColumn || dataStartRow > dataEndRow) {
            clearData();
            return;
        }

        int rowIdx, columnIdx = -1;
        DynamicValue categories = null;

        if (binder.getCategoriesPlacement() == Placement.LEFT) {
            columnIdx = left;
        } else if (binder.getCategoriesPlacement() == Placement.RIGHT) {
            columnIdx = right;
        } else if (hasCategories) {
            throw new RuntimeException("Illegal categories placement.");
        }

        if (columnIdx != -1) {
            List<Variant> ls = new ArrayList<>(dataEndRow - dataStartRow + 1);
            for (int i = dataStartRow; i <= dataEndRow; i++) {
                ls.add(table.getCell(i, columnIdx).getValue());
            }
            categories = new DynamicValue(Value.list(ls));
        }

        setCategories(categories);
        clearSeries();

        for (columnIdx = dataStartColumn; columnIdx <= dataEndColumn; columnIdx++) {
            rowIdx = -1;
            DynamicValue name = null;
            DynamicValue xValues = null;
            DynamicValue yValues = null;
            DynamicValue zValues = null;

            if (binder.getSeriesNamePlacement() == Placement.TOP) {
                rowIdx = top;
            } else if (binder.getSeriesNamePlacement() == Placement.BOTTOM) {
                rowIdx = bottom;
            }

            if (rowIdx != -1) {
                name = new DynamicValue(Value.from(table.getCell(rowIdx, columnIdx).getValue()));
            }

            List<Variant> ls = new ArrayList<>(dataEndRow - dataStartRow + 1);
            for (int i = dataStartRow; i <= dataEndRow; i++) {
                ls.add(table.getCell(i, columnIdx).getValue());
            }
            yValues = new DynamicValue(Value.list(ls));

            addSeries(name, xValues, yValues);
        }
    }

    void rebindIfPossible() {
        if (binder == null) {
            return;
        }
        if (getSheet() == null
                || getSheet().getWorkbook() == null
                || !getSheet().getWorkbook().isSkipWelding()) {
            rebind();
        }
    }

}