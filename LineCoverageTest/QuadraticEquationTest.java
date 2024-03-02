package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationTest {

    @Test
    void aIsNull() {
        assertThrows(IllegalArgumentException.class, ()-> QuadraticEquation.solve(0, 1, 2));
    }

    @Test
    void solve() {
        //pour delta < 0 line: 9 10
        assertEquals(null, QuadraticEquation.solve(1, 1, 1));
        // pour delta = 0 line 12 13
        assertArrayEquals(new double[]{1} ,QuadraticEquation.solve(1, -2, 1));
        // pour delta > 0 line 15 16 17
        assertArrayEquals(new double[]{2, 1}, QuadraticEquation.solve(1, -3, 2));
    }
}