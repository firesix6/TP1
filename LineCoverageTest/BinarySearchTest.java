package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    //line 5 et 6
    void binarySearchTabNull() {
        assertThrows( NullPointerException.class, () -> BinarySearch.binarySearch(null, 1));
    }

    @Test
    //pour le reste du code:
    void binaryserchtests(){
        int[] array1 = {1, 2, 3, 4, 5};
        //line 12 et 13 array[mid] == element
        assertEquals(2, BinarySearch.binarySearch(array1, 3));
        //line 14 15 array[mid] <= element
        assertEquals(3, BinarySearch.binarySearch(array1, 4));
        //line 16 17 else de array[mid] <= element
        assertEquals(0, BinarySearch.binarySearch(array1, 1));
        //line 20 sortie du while
        assertEquals(-1, BinarySearch.binarySearch(array1, 6));
    }
}