package com.ctrip.ferriswheel.core.util;

import com.ctrip.ferriswheel.core.intf.VariantNode;
import com.ctrip.ferriswheel.core.ref.RangeRef;
import junit.framework.TestCase;

public class TestAreaPatternAnalyzer extends TestCase {
    private final long UNSPECIFIED_RUNTIME_ID = VariantNode.UNSPECIFIED_ASSET_ID;

    public void testSimpleHorizontalPattern() {
        AreaPatternAnalyzer apa = new AreaPatternAnalyzer();
        assertEquals(-1, apa.getRepeated());

        assertEquals(0, apa.feed(new RangeRef(null, null, 0, 0, 0, 0,
                UNSPECIFIED_RUNTIME_ID, UNSPECIFIED_RUNTIME_ID)));
        checkArea(0, 0, 0, 0, apa.getStartArea());
        checkArea(0, 0, 0, 0, apa.getEndArea());

        assertEquals(1, apa.feed(new RangeRef(null, null, 1, 0, 1, 0,
                UNSPECIFIED_RUNTIME_ID, UNSPECIFIED_RUNTIME_ID)));
        assertEquals(0, apa.getRowDelta());
        assertEquals(1, apa.getColumnDelta());
        checkArea(0, 0, 0, 0, apa.getStartArea());
        checkArea(1, 0, 1, 0, apa.getEndArea());

        assertEquals(2, apa.feed(new RangeRef(null, null, 2, 0, 2, 0,
                UNSPECIFIED_RUNTIME_ID, UNSPECIFIED_RUNTIME_ID)));
        assertEquals(0, apa.getRowDelta());
        assertEquals(1, apa.getColumnDelta());
        checkArea(0, 0, 0, 0, apa.getStartArea());
        checkArea(2, 0, 2, 0, apa.getEndArea());
    }

    public void testSimpleVerticalPattern() {
        AreaPatternAnalyzer apa = new AreaPatternAnalyzer();
        assertEquals(-1, apa.getRepeated());

        assertEquals(0, apa.feed(new RangeRef(null, null, 0, 0, 0, 0,
                UNSPECIFIED_RUNTIME_ID, UNSPECIFIED_RUNTIME_ID)));
        checkArea(0, 0, 0, 0, apa.getStartArea());
        checkArea(0, 0, 0, 0, apa.getEndArea());

        assertEquals(1, apa.feed(new RangeRef(null, null, 0, 1, 0, 1,
                UNSPECIFIED_RUNTIME_ID, UNSPECIFIED_RUNTIME_ID)));
        assertEquals(1, apa.getRowDelta());
        assertEquals(0, apa.getColumnDelta());
        checkArea(0, 0, 0, 0, apa.getStartArea());
        checkArea(0, 1, 0, 1, apa.getEndArea());

        assertEquals(2, apa.feed(new RangeRef(null, null, 0, 2, 0, 2,
                UNSPECIFIED_RUNTIME_ID, UNSPECIFIED_RUNTIME_ID)));
        assertEquals(1, apa.getRowDelta());
        assertEquals(0, apa.getColumnDelta());
        checkArea(0, 0, 0, 0, apa.getStartArea());
        checkArea(0, 2, 0, 2, apa.getEndArea());
    }

    public void testFailByDifferentSize() {
        AreaPatternAnalyzer apa = new AreaPatternAnalyzer();
        assertEquals(0, apa.feed(new RangeRef(null, null, 0, 0, 0, 0,
                UNSPECIFIED_RUNTIME_ID, UNSPECIFIED_RUNTIME_ID)));
        assertEquals(0, apa.feed(new RangeRef(null, null, 0, 1, 1, 1,
                UNSPECIFIED_RUNTIME_ID, UNSPECIFIED_RUNTIME_ID)));
        checkArea(0, 1, 1, 1, apa.getStartArea());
        checkArea(0, 1, 1, 1, apa.getEndArea());

        assertEquals(0, apa.feed(new RangeRef(null, null, 0, 2, 5, 2,
                UNSPECIFIED_RUNTIME_ID, UNSPECIFIED_RUNTIME_ID)));
        checkArea(0, 2, 5, 2, apa.getStartArea());
        checkArea(0, 2, 5, 2, apa.getEndArea());

        // normal patterns
        assertEquals(1, apa.feed(new RangeRef(null, null, 0, 3, 5, 3,
                UNSPECIFIED_RUNTIME_ID, UNSPECIFIED_RUNTIME_ID)));
        assertEquals(1, apa.getRowDelta());
        assertEquals(0, apa.getColumnDelta());
        checkArea(0, 2, 5, 2, apa.getStartArea());
        checkArea(0, 3, 5, 3, apa.getEndArea());
        assertEquals(2, apa.feed(new RangeRef(null, null, 0, 4, 5, 4,
                UNSPECIFIED_RUNTIME_ID, UNSPECIFIED_RUNTIME_ID)));
        assertEquals(1, apa.getRowDelta());
        assertEquals(0, apa.getColumnDelta());
        checkArea(0, 2, 5, 2, apa.getStartArea());
        checkArea(0, 4, 5, 4, apa.getEndArea());

        // ruin again
        assertEquals(0, apa.feed(new RangeRef(null, null, 0, 5, 3, 5,
                UNSPECIFIED_RUNTIME_ID, UNSPECIFIED_RUNTIME_ID)));
        checkArea(0, 5, 3, 5, apa.getStartArea());
        checkArea(0, 5, 3, 5, apa.getEndArea());
    }

    public void testFailedByDifferentDelta() {
        AreaPatternAnalyzer apa = new AreaPatternAnalyzer();
        assertEquals(0, apa.feed(new RangeRef(null, null, 0, 0, 0, 0,
                UNSPECIFIED_RUNTIME_ID, UNSPECIFIED_RUNTIME_ID)));
        assertEquals(1, apa.feed(new RangeRef(null, null, 1, 1, 1, 1,
                UNSPECIFIED_RUNTIME_ID, UNSPECIFIED_RUNTIME_ID)));
        assertEquals(1, apa.getRowDelta());
        assertEquals(1, apa.getColumnDelta());
        checkArea(0, 0, 0, 0, apa.getStartArea());
        checkArea(1, 1, 1, 1, apa.getEndArea());
        // so far so good
        assertEquals(2, apa.feed(new RangeRef(null, null, 2, 2, 2, 2,
                UNSPECIFIED_RUNTIME_ID, UNSPECIFIED_RUNTIME_ID)));
        assertEquals(1, apa.getRowDelta());
        assertEquals(1, apa.getColumnDelta());
        checkArea(0, 0, 0, 0, apa.getStartArea());
        checkArea(2, 2, 2, 2, apa.getEndArea());

        // bad guy shows up
        assertEquals(1, apa.feed(new RangeRef(null, null, 2, 3, 2, 3,
                UNSPECIFIED_RUNTIME_ID, UNSPECIFIED_RUNTIME_ID)));
        assertEquals(1, apa.getRowDelta());
        assertEquals(0, apa.getColumnDelta());
        checkArea(2, 2, 2, 2, apa.getStartArea());
        checkArea(2, 3, 2, 3, apa.getEndArea());
    }

    void checkArea(int expectedLeft, int expectedTop, int expectedRight, int expectedBottom, RangeRef realArea) {
        assertEquals(expectedLeft, realArea.getLeft());
        assertEquals(expectedTop, realArea.getTop());
        assertEquals(expectedRight, realArea.getRight());
        assertEquals(expectedBottom, realArea.getBottom());
    }
}
