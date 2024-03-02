package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralTest {

    @Test
    void toRoman() {
        assertEquals("I", RomanNumeral.toRoman(1));
        assertEquals("V", RomanNumeral.toRoman(5));
    }
}