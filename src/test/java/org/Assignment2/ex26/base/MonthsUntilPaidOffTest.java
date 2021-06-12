package org.Assignment2.ex26.base;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class MonthsUntilPaidOffTest {

    @Test
    void calculateMonthsUntilPaidOff() {
    }

    @Test
    void Is_getBigValue_doing_math_right() {

        //Given
        /*
        What is your balance? 5000
        What is the APR on the card (as a percent)? 12
        What is the monthly payment you can make? 100
         */
        BigDecimal balance = new BigDecimal("5000");
        BigDecimal payment = new BigDecimal("100");

        //When
        BigDecimal expected = new BigDecimal("50.00");
        BigDecimal actual = MonthsUntilPaidOff.getBigValue(balance, payment);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    void does_getLog_do_math_right_in_my_base_case() {

        //Given
        /*
        What is your balance? 5000
        What is the APR on the card (as a percent)? 12
        What is the monthly payment you can make? 100
         */
        BigDecimal balance = new BigDecimal("5000");
        BigDecimal payment = new BigDecimal("100");
        double dailyRate = (double) 12/100/365;


        //When
        double expected = -0.6842049315784456;
        double actual = MonthsUntilPaidOff.getLog(dailyRate, MonthsUntilPaidOff.getBigValue(balance, payment));

        //Then
        assertEquals(expected, actual);
    }

    @Test
    void numberOfMonths() {

        //Given
        /*
        What is your balance? 5000
        What is the APR on the card (as a percent)? 12
        What is the monthly payment you can make? 100
         */
        BigDecimal balance = new BigDecimal("5000");
        BigDecimal payment = new BigDecimal("100");
        double dailyRate = (double) 12/100/365;

        BigDecimal Step2 = MonthsUntilPaidOff.getBigValue(balance, payment);
        double Step3 = MonthsUntilPaidOff.getLog(dailyRate, Step2);


        //When
        int expected = 70;
        int actual = MonthsUntilPaidOff.NumberOfMonths(dailyRate,(double) -1/30, Step3);

        //Then
        assertEquals(expected, actual);
    }
}