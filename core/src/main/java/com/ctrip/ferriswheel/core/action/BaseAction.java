package com.ctrip.ferriswheel.core.action;

import com.ctrip.ferriswheel.common.Workbook;
import com.ctrip.ferriswheel.common.action.Action;

public abstract class BaseAction implements Action {
    BaseAction() {
    }

    @Override
    public void apply(Workbook workbook) {
        if (this instanceof SheetAction) {
            if (this instanceof TableAction) {
                // TODO
            } else if (this instanceof ChartAction) {
                // TODO
            }
        } else {
            // TODO
        }
    }
}
