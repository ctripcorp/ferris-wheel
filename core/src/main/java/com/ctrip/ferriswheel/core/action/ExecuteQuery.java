package com.ctrip.ferriswheel.core.action;

import com.ctrip.ferriswheel.core.intf.Variant;

import java.util.Map;

public class ExecuteQuery extends TableAction {
    private Map<String, Variant> params;

    public ExecuteQuery() {
    }

    public ExecuteQuery(String sheetName, String tableName, Map<String, Variant> params) {
        super(sheetName, tableName);
        this.params = params;
    }

    public Map<String, Variant> getParams() {
        return params;
    }

    public void setParams(Map<String, Variant> params) {
        this.params = params;
    }
}
