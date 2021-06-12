package org.Assignment2.ex25.base;

import org.Assignment2.ex24.base.IsAnagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passwordValidatorTest {

    @Test
    void does_passwordStrength_reject_long_bad_passwords() {

        //given
        char[] password = "thisIsaBadPassWord".toCharArray();

        //when
        boolean actual = IsAnagram.hasSameLetters("short","short");
        boolean expected = true;

        //then
        assertEquals(expected, actual);

    }

    @Test
    void hasHowManyNumbers() {
        //given
        char[] password = "123four".toCharArray();

        //when
        int actual = passwordValidator.hasHowManyNumbers(password);
        int expected = 3;

        //then
        assertEquals(expected, actual);
    }

    @Test
    void hasHowManyChar() {

        //given
        char[] password = "1two34".toCharArray();

        //when
        int actual = passwordValidator.hasHowManyChar(password);
        int expected = 3;

        //then
        assertEquals(expected, actual);
    }

    @Test
    void isItStrong() {
        //given
        char[] password = "thisIsaBadPassWord".toCharArray();

        //when
        boolean actual = passwordValidator.isItStrong(password);
        boolean expected = false;

        //then
        assertEquals(expected, actual);
    }

    @Test
    void howStrong() {
        //given
        char[] password = "ThisIs1GoodPa$$word".toCharArray();

        //when
        boolean actual = passwordValidator.howStrong(password);
        boolean expected = true;

        //then
        assertEquals(expected, actual);

    }
}