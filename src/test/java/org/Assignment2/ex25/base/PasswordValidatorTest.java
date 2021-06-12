package org.Assignment2.ex25.base;

import org.Assignment2.ex24.base.IsAnagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

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
        int actual = PasswordValidator.hasHowManyNumbers(password);
        int expected = 3;

        //then
        assertEquals(expected, actual);
    }

    @Test
    void hasHowManyChar() {

        //given
        char[] password = "1two34".toCharArray();

        //when
        int actual = PasswordValidator.hasHowManyChar(password);
        int expected = 3;

        //then
        assertEquals(expected, actual);
    }

    @Test
    void isItStrong() {
        //given
        char[] password = "thisIsaBadPassWord".toCharArray();

        //when
        boolean actual = PasswordValidator.isItStrong(password);
        boolean expected = false;

        //then
        assertEquals(expected, actual);
    }

    @Test
    void howStrong() {
        //given
        char[] password = "ThisIs1GoodPa$$word".toCharArray();

        //when
        boolean actual = PasswordValidator.howStrong(password);
        boolean expected = true;

        //then
        assertEquals(expected, actual);

    }
}