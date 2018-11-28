package com.ctrip.ferriswheel.core.action;

import com.ctrip.ferriswheel.core.intf.Action;

public abstract class TableAction extends SheetAction implements Action {
    private String tableName;

    TableAction() {
    }

    TableAction(String sheetName, String tableName) {
        super(sheetName);
        this.tableName = tableName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

}
