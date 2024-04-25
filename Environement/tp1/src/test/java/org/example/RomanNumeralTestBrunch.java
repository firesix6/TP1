package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralTestBrunch {
    @Test
    void OutOfContext1(){
        assertThrows(IllegalArgumentException.class, ()->RomanNumeral.toRoman(0));
    }

    @Test
    void OutOfContext2(){
        assertThrows(IllegalArgumentException.class, ()->RomanNumeral.toRoman(4000));
    }
    @Test
    void toRoman() {
        assertEquals("VIII", RomanNumeral.toRoman(8));
    }
}