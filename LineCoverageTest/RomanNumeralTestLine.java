package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralTestLine {

    @Test
    // pour les deux premiere ligne significatif du code
    void OutOfContext(){
        assertThrows(IllegalArgumentException.class, ()->RomanNumeral.toRoman(0));
    }
    @Test
    void toRoman() {
        assertEquals("I", RomanNumeral.toRoman(1));
        assertEquals("V", RomanNumeral.toRoman(5));
    }
}