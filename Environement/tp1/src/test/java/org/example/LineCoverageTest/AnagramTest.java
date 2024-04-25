package org.example.LineCoverageTest;

import org.example.Anagram;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void testEmptyString() { assertThrows( NullPointerException.class, () -> Anagram.isAnagram(null, null)); }

    @Test
    void isAnagram() {
        assertTrue(Anagram.isAnagram("chein", "niche"));
    }

    @Test
    void isNotAnagram() {
        assertFalse(Anagram.isAnagram("chent", "niche"));
    }

    @Test
    void isNotAnagramLength() {
        assertFalse(Anagram.isAnagram("chen", "niche"));
    }

}