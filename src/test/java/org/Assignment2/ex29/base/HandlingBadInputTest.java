package org.Assignment2.ex29.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HandlingBadInputTest {

    @Test
    void getValidInput_denying_zero() {

        //given
        //User enters a string
        //String Input = "0";

        //When
        //String expected = "0";
        //String actual = HandlingBadInput.getValidInput();

        //Then
        //assertEquals(expected, actual);

        //Yah, I could not figure out how to mess with system streams

    }

    @Test
    void getValidInput_only_allowing_char() {

        //Yah, I don't know how to test this... the program only stops when an input is right.

    }

    @Test
    void yearsToDouble() {
        //given
        double RateOfReturn = 6;

        //When
        int expected = 12;
        int actual = HandlingBadInput.YearsToDouble(RateOfReturn);

        //Then
        assertEquals(expected, actual);
    }
}