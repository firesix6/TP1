package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void ExceptionPb() {
        assertThrows(IllegalArgumentException.class, ()->FizzBuzz.fizzBuzz(1));
    }

    @Test
    void TestLesLine(){
        assertEquals("2", FizzBuzz.fizzBuzz(2));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(50625));
    }
}