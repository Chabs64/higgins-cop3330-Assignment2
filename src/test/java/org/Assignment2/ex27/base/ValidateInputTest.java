package org.Assignment2.ex27.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateInputTest {

    @Test
    void isID_does_return_true_for_goodIDS() {
        //given
        String IDArray = "AA-1234";

        //when
        boolean expected = true;
        boolean actual = ValidateInput.isID(IDArray);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void isID_does_return_bad_for_NumIDS() {
        //given
        String IDArray = "AA-1two";

        //when
        boolean expected = false;
        boolean actual = ValidateInput.isID(IDArray);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void isID_does_return_false_for_CharIDS() {
        //given
        String IDArray = "11-1234";

        //when
        boolean expected = false;
        boolean actual = ValidateInput.isID(IDArray);

        //then
        assertEquals(expected, actual);
    }
}