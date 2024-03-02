package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AnagramTestCondition {

    @Test
    // pour la condition on a deux fois null :
    void ChaineNull(){
        //soit S1
        assertThrows( NullPointerException.class, () -> Anagram.isAnagram(null, "nana"));
        //soit S2
        assertThrows( NullPointerException.class, () -> Anagram.isAnagram("nana", null));
    }

    @Test
    //pour la condition de la longueur differente
    void LengthDifferent(){
        assertFalse(Anagram.isAnagram("chen", "niche"));
    }

}