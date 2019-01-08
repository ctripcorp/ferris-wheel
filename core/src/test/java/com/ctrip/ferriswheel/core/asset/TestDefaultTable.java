package com.ctrip.ferriswheel.core.asset;

import com.ctrip.ferriswheel.common.Environment;
import com.ctrip.ferriswheel.common.chart.Chart;
import com.ctrip.ferriswheel.common.chart.DataSeries;
import com.ctrip.ferriswheel.common.query.DataProvider;
import com.ctrip.ferriswheel.common.query.DataQuery;
import com.ctrip.ferriswheel.common.query.DataSet;
import com.ctrip.ferriswheel.common.table.Table;
import com.ctrip.ferriswheel.common.variant.impl.DynamicVariantImpl;
import com.ctrip.ferriswheel.common.variant.impl.Value;
import com.ctrip.ferriswheel.common.variant.Variant;
import com.ctrip.ferriswheel.common.variant.VariantType;
import com.ctrip.ferriswheel.core.bean.*;
import com.ctrip.ferriswheel.core.loader.DataSetBuilder;
import com.ctrip.ferriswheel.core.loader.DefaultColumnMeta;
import com.ctrip.ferriswheel.core.loader.DefaultProviderManager;
import com.ctrip.ferriswheel.core.loader.DefaultRowMeta;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestDefaultTable extends DefaultTableTestSupport {
    private static final String FAKE_QUERY_SCHEME = "test-query";
    private Environment environment;

    @Override
    protected void setUp() throws Exception {
        DefaultProviderManager pm = new DefaultProviderManager();
        pm.register(new ProviderMock());
        environment = new DefaultEnvironment.Builder().setProviderManager(pm).build();
    }

    public void testSetAndGet() {
        DefaultWorkbook wb = new DefaultWorkbook(environment);
        DefaultTable table = (DefaultTable) wb.addSheet("s1").addAsset(Table.class, "t1");

        // empty
        assertEquals(0, table.getRowCount());
        assertEquals(0, table.getColumnCount());
        assertTrue(table.getCell(0, 0).isBlank());
        assertTrue(table.getCell(1, 1).isBlank());

        // set 0, 0
        Variant old = table.setCellValue(0, 0, createIntValue(11));
        assertTrue(old.isBlank());
        assertEquals(1, table.getRowCount());
        assertEquals(1, table.getColumnCount());

        // set 1, 1
        old = table.setCellValue(1, 1, createIntValue(2020));
        assertTrue(old.isBlank());
        assertEquals(2, table.getRowCount());
        assertEquals(2, table.getColumnCount());

        // set 0, 1
        old = table.setCellValue(0, 1, createIntValue(12));
        assertTrue(old.isBlank());
        assertEquals(2, table.getRowCount());
        assertEquals(2, table.getColumnCount());

        // set 1, 0
        old = table.setCellValue(1, 0, createIntValue(21));
        assertTrue(old.isBlank());
        assertEquals(2, table.getRowCount());
        assertEquals(2, table.getColumnCount());

        // set 1, 1 again
        old = table.setCellValue(1, 1, createIntValue(22));
        assertEquals(2020, old.intValue());
        assertEquals(2, table.getRowCount());
        assertEquals(2, table.getColumnCount());

        // set 1, 2
        old = table.setCellValue(1, 2, createIntValue(23));
        assertTrue(old.isBlank());
        assertEquals(2, table.getRowCount());
        assertEquals(3, table.getColumnCount());

        // set 2, 1
        old = table.setCellValue(2, 1, createIntValue(32));
        assertTrue(old.isBlank());
        assertEquals(3, table.getRowCount());
        assertEquals(3, table.getColumnCount());

        // set 2, 2
        old = table.setCellValue(2, 2, createIntValue(33));
        assertTrue(old.isBlank());
        assertEquals(3, table.getRowCount());
        assertEquals(3, table.getColumnCount());

        // check cells

        checkIntegerGrid(new Integer[][]{
                {11, 12, null, null},
                {21, 22, 23, null},
                {null, 32, 33, null},
                {null, null, null, null}
        }, table);
    }

    public void testFillUp() {
        DefaultTable sheet = createTable33();
        sheet.setCellFormula(2, 3, "SUM(A3:C3)");
        System.out.println(sheet);
        sheet.fillUp(2, 3, 2);
        System.out.println(sheet);

        assertEquals("SUM(A1:C1)", sheet.getCell(0, 3).getFormulaString());
        assertEquals("SUM(A2:C2)", sheet.getCell(1, 3).getFormulaString());
        assertEquals("SUM(A3:C3)", sheet.getCell(2, 3).getFormulaString());

        sheet.setCellFormula(2, 3, "SUM(A3:B3)");
        sheet.setCellFormula(2, 4, "SUM(B3:C3)");
        System.out.println(sheet);
        sheet.fillUp(2, 3, 4, 2);
        System.out.println(sheet);

        assertEquals("SUM(A1:B1)", sheet.getCell(0, 3).getFormulaString());
        assertEquals("SUM(B1:C1)", sheet.getCell(0, 4).getFormulaString());
        assertEquals("SUM(A2:B2)", sheet.getCell(1, 3).getFormulaString());
        assertEquals("SUM(B2:C2)", sheet.getCell(1, 4).getFormulaString());
        assertEquals("SUM(A3:B3)", sheet.getCell(2, 3).getFormulaString());
        assertEquals("SUM(B3:C3)", sheet.getCell(2, 4).getFormulaString());
    }

    public void testFillRight() {
        DefaultTable sheet = createTable33();
        sheet.setCellFormula(3, 0, "SUM(A1:A3)");
        System.out.println(sheet);
        sheet.fillRight(3, 0, 2);
        System.out.println(sheet);

        assertEquals("SUM(A1:A3)", sheet.getCell(3, 0).getFormulaString());
        assertEquals("SUM(B1:B3)", sheet.getCell(3, 1).getFormulaString());
        assertEquals("SUM(C1:C3)", sheet.getCell(3, 2).getFormulaString());

        sheet.setCellFormula(3, 0, "SUM(A1:A2)");
        sheet.setCellFormula(4, 0, "SUM(A2:A3)");
        System.out.println(sheet);
        sheet.fillRight(3, 4, 0, 2);
        System.out.println(sheet);

        assertEquals("SUM(A1:A2)", sheet.getCell(3, 0).getFormulaString());
        assertEquals("SUM(A2:A3)", sheet.getCell(4, 0).getFormulaString());
        assertEquals("SUM(B1:B2)", sheet.getCell(3, 1).getFormulaString());
        assertEquals("SUM(B2:B3)", sheet.getCell(4, 1).getFormulaString());
        assertEquals("SUM(C1:C2)", sheet.getCell(3, 2).getFormulaString());
        assertEquals("SUM(C2:C3)", sheet.getCell(4, 2).getFormulaString());
    }

    public void testFillDown() {
        DefaultTable sheet = createTable33();
        sheet.setCellFormula(0, 3, "SUM(A1:C1)");
        System.out.println(sheet);
        sheet.fillDown(0, 3, 2);
        System.out.println(sheet);

        assertEquals("SUM(A1:C1)", sheet.getCell(0, 3).getFormulaString());
        assertEquals("SUM(A2:C2)", sheet.getCell(1, 3).getFormulaString());
        assertEquals("SUM(A3:C3)", sheet.getCell(2, 3).getFormulaString());

        sheet.setCellFormula(0, 3, "SUM(A1:B1)");
        sheet.setCellFormula(0, 4, "SUM(B1:C1)");
        System.out.println(sheet);
        sheet.fillDown(0, 3, 4, 2);
        System.out.println(sheet);

        assertEquals("SUM(A1:B1)", sheet.getCell(0, 3).getFormulaString());
        assertEquals("SUM(B1:C1)", sheet.getCell(0, 4).getFormulaString());
        assertEquals("SUM(A2:B2)", sheet.getCell(1, 3).getFormulaString());
        assertEquals("SUM(B2:C2)", sheet.getCell(1, 4).getFormulaString());
        assertEquals("SUM(A3:B3)", sheet.getCell(2, 3).getFormulaString());
        assertEquals("SUM(B3:C3)", sheet.getCell(2, 4).getFormulaString());
    }

    public void testFillLeft() {
        DefaultTable sheet = createTable33();
        sheet.setCellFormula(3, 2, "SUM(C1:C3)");
        System.out.println(sheet);
        sheet.fillLeft(3, 2, 2);
        System.out.println(sheet);

        assertEquals("SUM(A1:A3)", sheet.getCell(3, 0).getFormulaString());
        assertEquals("SUM(B1:B3)", sheet.getCell(3, 1).getFormulaString());
        assertEquals("SUM(C1:C3)", sheet.getCell(3, 2).getFormulaString());

        sheet.setCellFormula(3, 2, "SUM(C1:C2)");
        sheet.setCellFormula(4, 2, "SUM(C2:C3)");
        System.out.println(sheet);
        sheet.fillLeft(3, 4, 2, 2);
        System.out.println(sheet);

        assertEquals("SUM(A1:A2)", sheet.getCell(3, 0).getFormulaString());
        assertEquals("SUM(A2:A3)", sheet.getCell(4, 0).getFormulaString());
        assertEquals("SUM(B1:B2)", sheet.getCell(3, 1).getFormulaString());
        assertEquals("SUM(B2:B3)", sheet.getCell(4, 1).getFormulaString());
        assertEquals("SUM(C1:C2)", sheet.getCell(3, 2).getFormulaString());
        assertEquals("SUM(C2:C3)", sheet.getCell(4, 2).getFormulaString());
    }

    public void testInsertRows() {
        DefaultTable sheet = createTable33();
        sheet.insertRows(1, 2);
        assertEquals(5, sheet.getRowCount());
        assertEquals(3, sheet.getColumnCount());
        sheet.setCellValue(1, 1, new Value.DecimalValue(10));
        sheet.setCellValue(2, 1, new Value.DecimalValue(24));
        assertEquals(11, sheet.getCell(0, 0).intValue());
        assertEquals(13, sheet.getCell(0, 2).intValue());
        assertEquals(10, sheet.getCell(1, 1).intValue());
        assertEquals(24, sheet.getCell(2, 1).intValue());
        assertEquals(21, sheet.getCell(3, 0).intValue());
        assertEquals(23, sheet.getCell(3, 2).intValue());
    }

    public void testEraseRows() {
        DefaultTable sheet = createTable33();
        sheet.eraseRows(1, 1);
        assertEquals(3, sheet.getRowCount());
        assertEquals(3, sheet.getColumnCount());
        assertEquals(11, sheet.getCell(0, 0).intValue());
        assertEquals(13, sheet.getCell(0, 2).intValue());
        assertTrue(sheet.getCell(1, 0).isBlank());
        assertTrue(sheet.getCell(1, 2).isBlank());
        assertEquals(31, sheet.getCell(2, 0).intValue());
        assertEquals(33, sheet.getCell(2, 2).intValue());

        sheet.setCellValue(2, 4, new Value.StrValue("test"));
        assertEquals(3, sheet.getRowCount());
        assertEquals(5, sheet.getColumnCount());

        sheet.eraseRows(1, 2);
        assertEquals(1, sheet.getRowCount());
        assertEquals(3, sheet.getColumnCount());
    }

    public void testRemoveRows() {
        DefaultTable sheet = createTable33();
        sheet.removeRows(0, 2);
        assertEquals(1, sheet.getRowCount());
        assertEquals(3, sheet.getColumnCount());
        assertEquals(31, sheet.getCell(0, 0).intValue());
        assertEquals(33, sheet.getCell(0, 2).intValue());

        sheet.setCellFormula(2, 4, "SUM(A3:C3)");
        assertEquals(3, sheet.getRowCount());
        assertEquals(5, sheet.getColumnCount());

        sheet.removeRows(2, 1);
        assertEquals(1, sheet.getRowCount());
        assertEquals(3, sheet.getColumnCount());
    }

    public void testInsertColumns() {
        DefaultTable sheet = createTable33();
        sheet.insertColumns(1, 2);
        sheet.setCellValue(0, 1, new Value.DecimalValue(10));
        sheet.setCellValue(2, 2, new Value.DecimalValue(24));
        assertEquals(3, sheet.getRowCount());
        assertEquals(5, sheet.getColumnCount());
        assertEquals(11, sheet.getCell(0, 0).intValue());
        assertEquals(10, sheet.getCell(0, 1).intValue());
        assertTrue(sheet.getCell(0, 2).isBlank());
        assertEquals(12, sheet.getCell(0, 3).intValue());
        assertEquals(13, sheet.getCell(0, 4).intValue());
        assertEquals(31, sheet.getCell(2, 0).intValue());
        assertTrue(sheet.getCell(2, 1).isBlank());
        assertEquals(24, sheet.getCell(2, 2).intValue());
        assertEquals(32, sheet.getCell(2, 3).intValue());
        assertEquals(33, sheet.getCell(2, 4).intValue());
    }

    public void testEraseColumns() {
        DefaultTable sheet = createTable33();
        sheet.eraseColumns(0, 2);
        assertEquals(3, sheet.getRowCount());
        assertEquals(3, sheet.getColumnCount());
        assertTrue(sheet.getCell(0, 0).isBlank());
        assertTrue(sheet.getCell(0, 1).isBlank());
        assertEquals(13, sheet.getCell(0, 2).intValue());
        assertTrue(sheet.getCell(1, 0).isBlank());
        assertTrue(sheet.getCell(1, 1).isBlank());
        assertEquals(23, sheet.getCell(1, 2).intValue());
        assertTrue(sheet.getCell(2, 0).isBlank());
        assertTrue(sheet.getCell(2, 1).isBlank());
        assertEquals(33, sheet.getCell(2, 2).intValue());

        sheet.setCellValue(1, 1, new Value.StrValue("test"));
        assertEquals(3, sheet.getRowCount());
        assertEquals(3, sheet.getColumnCount());

        sheet.eraseColumns(2, 1);
        assertEquals(2, sheet.getRowCount());
        assertEquals(2, sheet.getColumnCount());

        sheet.eraseColumns(1, 1);
        assertEquals(0, sheet.getRowCount());
        assertEquals(0, sheet.getColumnCount());
    }

    public void testRemoveColumns() {
        DefaultTable sheet = createTable33();
        sheet.removeColumns(0, 2);
        assertEquals(3, sheet.getRowCount());
        assertEquals(1, sheet.getColumnCount());
        assertEquals(13, sheet.getCell(0, 0).intValue());
        assertEquals(23, sheet.getCell(1, 0).intValue());
        assertEquals(33, sheet.getCell(2, 0).intValue());

        sheet.setCellFormula(1, 2, "SUM(A2:B2)");
        assertEquals(3, sheet.getColumnCount());
        sheet.removeColumns(2, 1);
        assertEquals(3, sheet.getRowCount());
        assertEquals(1, sheet.getColumnCount());
    }

    public void testEraseCell() {
        DefaultTable sheet = createTable33();
        sheet.setCellValue(5, 5, new Value.StrValue("test"));
        sheet.setCellValue(5, 6, new Value.StrValue("test"));
        sheet.setCellValue(6, 5, new Value.StrValue("test"));
        assertEquals(7, sheet.getRowCount());
        assertEquals(7, sheet.getColumnCount());

        sheet.eraseCell(5, 6);
        assertEquals(7, sheet.getRowCount());
        assertEquals(6, sheet.getColumnCount());

        sheet.eraseCell(6, 5);
        assertEquals(6, sheet.getRowCount());
        assertEquals(6, sheet.getColumnCount());

        sheet.eraseCell(5, 5);
        assertEquals(3, sheet.getRowCount());
        assertEquals(3, sheet.getColumnCount());
    }

    public void testAddChart() {
        DefaultTable table = createTable33();
        table.insertRows(0, 1);
        table.setCellValue(0, 0, new Value.StrValue("Q1"));
        table.setCellValue(0, 1, new Value.StrValue("Q2"));
        table.setCellValue(0, 2, new Value.StrValue("Q3"));
        table.insertColumns(0, 1);
        table.setCellValue(1, 0, new Value.StrValue("apple"));
        table.setCellValue(2, 0, new Value.StrValue("boy"));
        table.setCellValue(3, 0, new Value.StrValue("cat"));

        List<DataSeries> seriesList = new ArrayList<>(3);
        seriesList.add(new ChartData.SeriesImpl(
                new DynamicVariantImpl(table.getSheet().getName() + "!" + table.getName() + "!$A$2"),
                null,
                new DynamicVariantImpl(table.getSheet().getName() + "!" + table.getName() + "!$B$2:$D$2")));
        seriesList.add(new ChartData.SeriesImpl(
                new DynamicVariantImpl(table.getSheet().getName() + "!" + table.getName() + "!$A$3"),
                null,
                new DynamicVariantImpl(table.getSheet().getName() + "!" + table.getName() + "!$B$3:$D$3")));
        seriesList.add(new ChartData.SeriesImpl(
                new DynamicVariantImpl(table.getSheet().getName() + "!" + table.getName() + "!$A$4"),
                null,
                new DynamicVariantImpl(table.getSheet().getName() + "!" + table.getName() + "!$B$4:$D$4")));

        ChartData chartSettings = new ChartData("testChart", "Line",
                new DynamicVariantImpl("\"Hello Line Chart!\""),
                new DynamicVariantImpl(table.getSheet().getName() + "!" + table.getName() + "!$B$1:$D$1"),
                seriesList);

        DefaultChart chart = (DefaultChart) table.getSheet().addAsset(Chart.class, chartSettings);

        assertEquals("Line", chart.getType());
        assertEquals("testChart", chart.getName());
        assertEquals("Hello Line Chart!", chart.getTitle().strValue());
        assertEquals(table.getSheet().getName() + "!" + table.getName() + "!$B$1:$D$1", chart.getCategories().getFormulaString());
        assertEquals(3, chart.getCategories().itemCount());
        assertEquals("Q1", chart.getCategories().item(0).strValue());
        assertEquals("Q2", chart.getCategories().item(1).strValue());
        assertEquals("Q3", chart.getCategories().item(2).strValue());

        assertEquals(3, chart.getSeriesCount());

        DefaultDataSeries series = chart.getSeries(0);
        assertEquals(table.getSheet().getName() + "!" + table.getName() + "!$A$2", series.getName().getFormulaString());
        assertEquals("apple", series.getName().strValue());
        assertNull(series.getxValues());
        assertEquals(table.getSheet().getName() + "!" + table.getName() + "!$B$2:$D$2", series.getyValues().getFormulaString());
        assertEquals(3, series.getyValues().itemCount());
        assertEquals(11, series.getyValues().item(0).intValue());
        assertEquals(12, series.getyValues().item(1).intValue());
        assertEquals(13, series.getyValues().item(2).intValue());

        series = chart.getSeries(1);
        assertEquals(table.getSheet().getName() + "!" + table.getName() + "!$A$3", series.getName().getFormulaString());
        assertEquals("boy", series.getName().strValue());
        assertNull(series.getxValues());
        assertEquals(table.getSheet().getName() + "!" + table.getName() + "!$B$3:$D$3", series.getyValues().getFormulaString());
        assertEquals(3, series.getyValues().itemCount());
        assertEquals(21, series.getyValues().item(0).intValue());
        assertEquals(22, series.getyValues().item(1).intValue());
        assertEquals(23, series.getyValues().item(2).intValue());

        series = chart.getSeries(2);
        assertEquals(table.getSheet().getName() + "!" + table.getName() + "!$A$4", series.getName().getFormulaString());
        assertEquals("cat", series.getName().strValue());
        assertNull(series.getxValues());
        assertEquals(table.getSheet().getName() + "!" + table.getName() + "!$B$4:$D$4", series.getyValues().getFormulaString());
        assertEquals(3, series.getyValues().itemCount());
        assertEquals(31, series.getyValues().item(0).intValue());
        assertEquals(32, series.getyValues().item(1).intValue());
        assertEquals(33, series.getyValues().item(2).intValue());

        // let's do something
        table.setCellValue(1, 1, new Value.DecimalValue("1024"));
        table.setCellValue(3, 3, new Value.DecimalValue("3072"));
        table.insertRows(2, 1);
        table.insertColumns(3, 1);

        chart = table.getSheet().getAsset("testChart");

        assertEquals("Line", chart.getType());
        assertEquals("testChart", chart.getName());
        assertEquals("Hello Line Chart!", chart.getTitle().strValue());
        assertEquals(table.getSheet().getName() + "!" + table.getName() + "!$B$1:$E$1", chart.getCategories().getFormulaString());
        assertEquals(4, chart.getCategories().itemCount());
        assertEquals("Q1", chart.getCategories().item(0).strValue());
        assertEquals("Q2", chart.getCategories().item(1).strValue());
        assertTrue(chart.getCategories().item(2).isBlank());
        assertEquals("Q3", chart.getCategories().item(3).strValue());

        assertEquals(3, chart.getSeriesCount());

        series = chart.getSeries(0);
        assertEquals(table.getSheet().getName() + "!" + table.getName() + "!$A$2", series.getName().getFormulaString());
        assertEquals("apple", series.getName().strValue());
        assertNull(series.getxValues());
        assertEquals(table.getSheet().getName() + "!" + table.getName() + "!$B$2:$E$2", series.getyValues().getFormulaString());
        assertEquals(4, series.getyValues().itemCount());
        assertEquals(1024, series.getyValues().item(0).intValue());
        assertEquals(12, series.getyValues().item(1).intValue());
        assertTrue(series.getyValues().item(2).isBlank());
        assertEquals(13, series.getyValues().item(3).intValue());

        series = chart.getSeries(1);
        assertEquals(table.getSheet().getName() + "!" + table.getName() + "!$A$4", series.getName().getFormulaString());
        assertEquals("boy", series.getName().strValue());
        assertNull(series.getxValues());
        assertEquals(table.getSheet().getName() + "!" + table.getName() + "!$B$4:$E$4", series.getyValues().getFormulaString());
        assertEquals(4, series.getyValues().itemCount());
        assertEquals(21, series.getyValues().item(0).intValue());
        assertEquals(22, series.getyValues().item(1).intValue());
        assertTrue(series.getyValues().item(2).isBlank());
        assertEquals(23, series.getyValues().item(3).intValue());

        series = chart.getSeries(2);
        assertEquals(table.getSheet().getName() + "!" + table.getName() + "!$A$5", series.getName().getFormulaString());
        assertEquals("cat", series.getName().strValue());
        assertNull(series.getxValues());
        assertEquals(table.getSheet().getName() + "!" + table.getName() + "!$B$5:$E$5", series.getyValues().getFormulaString());
        assertEquals(4, series.getyValues().itemCount());
        assertEquals(31, series.getyValues().item(0).intValue());
        assertEquals(32, series.getyValues().item(1).intValue());
        assertTrue(series.getyValues().item(2).isBlank());
        assertEquals(3072, series.getyValues().item(3).intValue());
    }

    public void testUpdateChart() {
        DefaultTable table = createTable33();
        table.insertRows(0, 1);
        table.setCellValue(0, 0, new Value.StrValue("Q1"));
        table.setCellValue(0, 1, new Value.StrValue("Q2"));
        table.setCellValue(0, 2, new Value.StrValue("Q3"));
        table.insertColumns(0, 1);
        table.setCellValue(1, 0, new Value.StrValue("apple"));
        table.setCellValue(2, 0, new Value.StrValue("boy"));
        table.setCellValue(3, 0, new Value.StrValue("cat"));

        List<DataSeries> seriesList = new ArrayList<>(3);
        seriesList.add(new ChartData.SeriesImpl(
                new DynamicVariantImpl(table.getSheet().getName() + "!" + table.getName() + "!$A$2"),
                null,
                new DynamicVariantImpl(table.getSheet().getName() + "!" + table.getName() + "!$B$2:$D$2")));
        seriesList.add(new ChartData.SeriesImpl(
                new DynamicVariantImpl(table.getSheet().getName() + "!" + table.getName() + "!$A$3"),
                null,
                new DynamicVariantImpl(table.getSheet().getName() + "!" + table.getName() + "!$B$3:$D$3")));
        seriesList.add(new ChartData.SeriesImpl(
                new DynamicVariantImpl(table.getSheet().getName() + "!" + table.getName() + "!$A$4"),
                null,
                new DynamicVariantImpl(table.getSheet().getName() + "!" + table.getName() + "!$B$4:$D$4")));

        ChartData chartSettings = new ChartData("testChart", "Line",
                new DynamicVariantImpl("\"Hello Line Chart!\""),
                new DynamicVariantImpl(table.getSheet().getName() + "!" + table.getName() + "!$B$1:$D$1"),
                seriesList);

        DefaultChart chart = (DefaultChart) table.getSheet().addAsset(Chart.class, chartSettings);

        // update
        ((ChartData.SeriesImpl) seriesList.get(0)).setyValues(new DynamicVariantImpl(table.getSheet().getName() + "!" + table.getName() + "!$B$2:$C$2"));
        ((ChartData.SeriesImpl) seriesList.get(1)).setyValues(new DynamicVariantImpl(table.getSheet().getName() + "!" + table.getName() + "!$B$3:$C$3"));
        seriesList.remove(2);
        seriesList.add(new ChartData.SeriesImpl(new DynamicVariantImpl(table.getSheet().getName() + "!" + table.getName() + "!$A$4"),
                null,
                new DynamicVariantImpl(table.getSheet().getName() + "!" + table.getName() + "!$B$4:$C$4")));
        table.getSheet().updateChart("testChart", new ChartData("testChart", "Line",
                new DynamicVariantImpl("\"Hello New Line Chart!\""),
                new DynamicVariantImpl(table.getSheet().getName() + "!" + table.getName() + "!$B$1:$C$1"),
                seriesList
        ));

        System.out.println(chart);
        assertEquals("Line", chart.getType());
        assertEquals("testChart", chart.getName());
        assertEquals("Hello New Line Chart!", chart.getTitle().strValue());
        assertEquals(table.getSheet().getName() + "!" + table.getName() + "!$B$1:$C$1", chart.getCategories().getFormulaString());
        assertEquals(2, chart.getCategories().itemCount());
        assertEquals("Q1", chart.getCategories().item(0).strValue());
        assertEquals("Q2", chart.getCategories().item(1).strValue());

        assertEquals(3, chart.getSeriesCount());

        DefaultDataSeries series = chart.getSeries(0);
        assertEquals(table.getSheet().getName() + "!" + table.getName() + "!$A$2", series.getName().getFormulaString());
        assertEquals("apple", series.getName().strValue());
        assertNull(series.getxValues());
        assertEquals(table.getSheet().getName() + "!" + table.getName() + "!$B$2:$C$2", series.getyValues().getFormulaString());
        assertEquals(2, series.getyValues().itemCount());
        assertEquals(11, series.getyValues().item(0).intValue());
        assertEquals(12, series.getyValues().item(1).intValue());

        series = chart.getSeries(1);
        assertEquals(table.getSheet().getName() + "!" + table.getName() + "!$A$3", series.getName().getFormulaString());
        assertEquals("boy", series.getName().strValue());
        assertNull(series.getxValues());
        assertEquals(table.getSheet().getName() + "!" + table.getName() + "!$B$3:$C$3", series.getyValues().getFormulaString());
        assertEquals(2, series.getyValues().itemCount());
        assertEquals(21, series.getyValues().item(0).intValue());
        assertEquals(22, series.getyValues().item(1).intValue());

        series = chart.getSeries(2);
        assertEquals(table.getSheet().getName() + "!" + table.getName() + "!$A$4", series.getName().getFormulaString());
        assertEquals("cat", series.getName().strValue());
        assertNull(series.getxValues());
        assertEquals(table.getSheet().getName() + "!" + table.getName() + "!$B$4:$C$4", series.getyValues().getFormulaString());
        assertEquals(2, series.getyValues().itemCount());
        assertEquals(31, series.getyValues().item(0).intValue());
        assertEquals(32, series.getyValues().item(1).intValue());
    }

    public void testRemoveChart() {
    }

    Value createIntValue(int n) {
        return new Value.DecimalValue(n);
    }

    public void testAutomateWithQuery() {
        DefaultWorkbook workbook = new FilingClerk(environment).createWorkbook("test-workbook");
        DefaultSheet sheet = workbook.addSheet("sheet1");
        DefaultTable table = (DefaultTable) sheet.addAsset(Table.class, "table1");

        TableAutomatonInfo.QueryTemplateInfo template = new TableAutomatonInfo.QueryTemplateInfo();
        template.setScheme(FAKE_QUERY_SCHEME);
        table.automate(new TableAutomatonInfo.QueryAutomatonInfo(template));

        assertEquals("table1", table.getName());
        assertEquals(4, table.getRowCount());
        assertEquals(4, table.getColumnCount());

        assertSame(Value.BLANK, table.getCell(0, 0).getData().getVariant());
        assertEquals("foo", table.getCell(0, 1).strValue());
        assertEquals("bar", table.getCell(0, 2).strValue());
        assertEquals("foobar", table.getCell(0, 3).strValue());

        assertEquals("apple", table.getCell(1, 0).strValue());
        assertEquals(11, table.getCell(1, 1).intValue());
        assertEquals(12, table.getCell(1, 2).intValue());
        assertEquals(13, table.getCell(1, 3).intValue());

        assertEquals("boy", table.getCell(2, 0).strValue());
        assertEquals(21, table.getCell(2, 1).intValue());
        assertEquals(22, table.getCell(2, 2).intValue());
        assertEquals(23, table.getCell(2, 3).intValue());

        assertEquals("cat", table.getCell(3, 0).strValue());
        assertEquals(31, table.getCell(3, 1).intValue());
        assertEquals(32, table.getCell(3, 2).intValue());
        assertEquals(33, table.getCell(3, 3).intValue());
    }

    class ProviderMock implements DataProvider {
        @Override
        public boolean acceptsQuery(DataQuery query) {
            if ("test-query".equals(query.getScheme())) {
                return true;
            }
            return false;
        }

        @Override
        public DataSet execute(DataQuery query) throws IOException {
            DataSetBuilder dataSetBuilder = new DataSetBuilder()
                    .addColumnMeta(new DefaultColumnMeta("foo", VariantType.DECIMAL))
                    .addColumnMeta(new DefaultColumnMeta("bar", VariantType.DECIMAL))
                    .addColumnMeta(new DefaultColumnMeta("foobar", VariantType.DECIMAL))
                    .setHasRowMeta(true);

            dataSetBuilder.newRecord()
                    .setMeta(new DefaultRowMeta("apple"))
                    .set(0, Value.dec(11))
                    .set(1, Value.dec(12))
                    .set(2, Value.dec(13))
                    .commit();

            dataSetBuilder.newRecord()
                    .setMeta(new DefaultRowMeta("boy"))
                    .set(0, Value.dec(21))
                    .set(1, Value.dec(22))
                    .set(2, Value.dec(23))
                    .commit();

            dataSetBuilder.newRecord()
                    .setMeta(new DefaultRowMeta("cat"))
                    .set(0, Value.dec(31))
                    .set(1, Value.dec(32))
                    .set(2, Value.dec(33))
                    .commit();

            return dataSetBuilder.build();
        }
    }
}
