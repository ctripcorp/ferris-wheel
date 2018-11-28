package com.ctrip.ferriswheel.core.formula.func.date;

import com.ctrip.ferriswheel.core.formula.FakeEvalContext;
import com.ctrip.ferriswheel.core.formula.FakeEvalContext;
import com.ctrip.ferriswheel.core.formula.eval.FormulaEvaluationContext;
import com.ctrip.ferriswheel.core.intf.Variant;
import com.ctrip.ferriswheel.core.intf.VariantType;
import junit.framework.TestCase;

import java.util.Calendar;

public class TestToday extends TestCase {
    public void testGetName() {
        assertEquals("TODAY", new Today().getName());
    }

    public void testEval() {
        FakeEvalContext context = new FakeEvalContext();
        new Today().evaluate(null, context);
        assertEquals(1, context.getOperands().size());
        Variant date = context.popOperand();
        assertEquals(VariantType.DATE, date.valueType());
        assertEquals(System.currentTimeMillis(), date.dateValue().getTime(), 24 * 60 * 60 * 1000 + 1000);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date.dateValue());
        assertEquals(0, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, cal.get(Calendar.MINUTE));
        assertEquals(0, cal.get(Calendar.SECOND));
        assertEquals(0, cal.get(Calendar.MINUTE));
        assertEquals(0, date.dateValue().getTime() % 1000);
    }
}
