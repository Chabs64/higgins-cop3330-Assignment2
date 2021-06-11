package org.Assignment2.ex24.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsAnagramTest {

    @Test
    void isAnagram_returning_false_for_length() {
        //given
        //to strings of different lengths

        //when
        boolean actual = IsAnagram.isAnagram("short","longest");
        boolean expected = false;

        //then
        assertEquals(expected, actual);
    }

    @Test
    void is_hasSameLetters_returning_true_for_identical_string()
    {
        //given
        //two strings, does it return true if they are identical

        //when
        boolean actual = IsAnagram.hasSameLetters("short","short");
        boolean expected = true;

        //then
        assertEquals(expected, actual);

    }

    @Test
    void is_hasSameLetters_returning_ture_for_anagram()
    {
        //given
        //two strings, does it return true if they are consist of the same char make up

        //when
        boolean actual = IsAnagram.hasSameLetters("short","trohs");
        boolean expected = true;

        //then
        assertEquals(expected, actual);

    }
}