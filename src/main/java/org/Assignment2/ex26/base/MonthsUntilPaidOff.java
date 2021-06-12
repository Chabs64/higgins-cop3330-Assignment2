package org.Assignment2.ex26.base;

/*
The formula for this is

n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
where

n is the number of months.
i is the daily rate (APR divided by 365).
b is the balance.
p is the monthly payment.
 */

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.lang.Math.ceil;

public class MonthsUntilPaidOff {

    public static int calculateMonthsUntilPaidOff(double balance, double APR, double payment)
    {
        double dailyRate = (double) APR/100/365;

        BigDecimal bigBalance = new BigDecimal(String.valueOf(balance));

        BigDecimal bigPayment = new BigDecimal(String.valueOf(payment));

        // Step 1
        // -(1/30)

        double Step1 =  (double) -1/30;

        //Step 2
        //(bigBalance.divide(bigPayment)

        BigDecimal Step2 = getBigValue(bigBalance, bigPayment);

        //Step 3
        //log(1 + step2*(1 - (1+dailyRate).pow(30))

        double Step3 = getLog(dailyRate, Step2);

        //Step 4
        //Step1 * (Step3(step2)) / log(1 + dailyRate)

        return NumberOfMonths(dailyRate, Step1, Step3);

    }

    public static int NumberOfMonths(double dailyRate, double Step1, double Step3) {
        double months = (Step1 * Step3) / Math.log(1 + dailyRate);
        return (int) Math.ceil(months);
    }

    public static double getLog(double dailyRate, BigDecimal Step2) {
        return Math.log(1 + Step2.doubleValue() * (1 - Math.pow((1 + dailyRate), 30)));
    }

    public static BigDecimal getBigValue(BigDecimal bigBalance, BigDecimal bigPayment) {
        return bigBalance.divide(bigPayment).setScale(2, RoundingMode.HALF_UP);
    }

}
