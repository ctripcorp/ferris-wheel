package com.ctrip.ferriswheel.core.formula.func.text;

import com.ctrip.ferriswheel.core.bean.Value;
import com.ctrip.ferriswheel.core.formula.ErrorCode;
import com.ctrip.ferriswheel.core.formula.FakeEvalContext;
import junit.framework.TestCase;

public class TestStringFunction extends TestCase {
    private FakeEvalContext context = new FakeEvalContext();

    public void testMid() {
        StringFunctions.Mid mid = new StringFunctions.Mid();
        assertEquals("MID", mid.getName());
        assertTrue(mid.checkArgc(3));
        assertFalse(mid.checkArgc(2));
        assertFalse(mid.checkArgc(4));

        context.pushOperand(Value.str("hello world"));
        context.pushOperand(Value.dec(2));
        context.pushOperand(Value.dec(3));
        mid.evaluate(null, context);
        assertEquals(1, context.getOperands().size());
        assertEquals("ell", context.popOperand().strValue());

        context.getOperands().clear();
        context.pushOperand(Value.str("hello world"));
        context.pushOperand(Value.dec(0));
        context.pushOperand(Value.dec(3));
        mid.evaluate(null, context);
        assertEquals(1, context.getOperands().size());
        assertEquals(ErrorCode.ILLEGAL_VALUE, context.popOperand().errorValue());

        context.getOperands().clear();
        context.pushOperand(Value.str("hello world"));
        context.pushOperand(Value.dec(2));
        context.pushOperand(Value.dec(-3));
        mid.evaluate(null, context);
        assertEquals(1, context.getOperands().size());
        assertEquals(ErrorCode.ILLEGAL_VALUE, context.popOperand().errorValue());

        context.getOperands().clear();
        context.pushOperand(Value.str("hello world"));
        context.pushOperand(Value.dec(2));
        context.pushOperand(Value.dec(0));
        mid.evaluate(null, context);
        assertEquals(1, context.getOperands().size());
        assertEquals("", context.popOperand().strValue());

        context.getOperands().clear();
        context.pushOperand(Value.str("hello world"));
        context.pushOperand(Value.dec(2));
        context.pushOperand(Value.dec(100));
        mid.evaluate(null, context);
        assertEquals(1, context.getOperands().size());
        assertEquals("ello world", context.popOperand().strValue());
    }
}