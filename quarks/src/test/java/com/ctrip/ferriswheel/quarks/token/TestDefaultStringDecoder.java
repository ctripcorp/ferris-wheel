package com.ctrip.ferriswheel.quarks.token;

import junit.framework.TestCase;

import java.io.IOException;

public class TestDefaultStringDecoder extends TestCase {
    private DefaultStringDecoder decoder = new DefaultStringDecoder();

    public void testIsQuoteStart() {
        String s = "'\"";

        for (int i = 0; i < s.length(); i++) {
            assertTrue("'" + s.charAt(i)
                            + "' is supposed to be a legal string quote.",
                    decoder.isStartChar(s.charAt(i)));
        }

        s = "$abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_0123456789~`!@#$%^&*()-_=+[{]}\\|;:,<.>/?";
        for (int i = 0; i < s.length(); i++) {
            assertFalse("'" + s.charAt(i)
                            + "' is supposed to be an illegal string quote.",
                    decoder.isStartChar(s.charAt(i)));
        }
    }

    public void testIsQuoteEnd() {
        assertTrue(decoder.isQuoteEnd('"', '"'));
        assertTrue(decoder.isQuoteEnd('\'', '\''));
        assertFalse(decoder.isQuoteEnd('"', '\''));
        assertFalse(decoder.isQuoteEnd('\'', '"'));
        assertFalse(decoder.isQuoteEnd('a', '"'));
        assertFalse(decoder.isQuoteEnd('0', '\''));
    }

    public void testEncodeAndDecode() {
        assertEncodeAndDecode("a", "a");
        assertEncodeAndDecode("Z", "Z");
        assertEncodeAndDecode("9", "9");
        assertEncodeAndDecode("_", "_");
        assertEncodeAndDecode("$", "$");
        assertEncodeAndDecode("中", "中");
        assertEncodeAndDecode("aZ9_$中", "aZ9_$中");

        assertEncodeAndDecode("'", "\\\'");
        assertEncodeAndDecode("\"", "\\\"");
        assertEncodeAndDecode("\r", "\\r");
        assertEncodeAndDecode("\n", "\\n");
        assertEncodeAndDecode("\\", "\\\\");

    }

    private void assertEncodeAndDecode(String plain, String encoded) {
        DefaultStringDecoder codec = new DefaultStringDecoder();
        StringBuilder sb = new StringBuilder();
        try {
            codec.encode(plain, 0, plain.length(), sb);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        assertEquals(encoded, sb.toString());
        assertEquals(encoded, codec.encode(plain)); // test the wrapped API
        codec.start('"');
        for (int pos = 0; pos < encoded.length(); pos++) {
            assertTrue(codec.feed(encoded.charAt(pos)));
        }
        assertTrue(codec.feed('"'));
        assertTrue(codec.isTerminable());
        assertEquals(plain, codec.finish());
        assertFalse(codec.feed('a'));
    }

}
