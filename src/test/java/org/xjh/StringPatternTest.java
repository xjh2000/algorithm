package org.xjh;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringPatternTest {

    @Test
    void bruteForceMatch() {
        String pattern = "ab";
        String text = "aaccbsscccssssssabsssssss";
        assertEquals(text.lastIndexOf(pattern), StringPattern.bruteForceMatch(pattern, text));
    }
}