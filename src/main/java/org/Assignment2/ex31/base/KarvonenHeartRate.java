package org.Assignment2.ex31.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Chad Higgins
 */

import java.util.Scanner;

/*
When you loop, you can control how much you increment the counter; you don’t always have to increment by one.

When getting into a fitness program, you may want to figure out your target heart rate so you don’t overexert yourself.
The Karvonen heart rate formula is one method you can use to determine your rate.
Create a program that prompts for your age and your resting heart rate.
Use the Karvonen formula to determine the target heart rate based on a range of intensities from 55% to 95%.
Generate a table with the results as shown in the example output. The formula is

TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR

Example Output
Resting Pulse: 65        Age: 22

Intensity    | Rate
-------------|--------
55%          | 138 bpm
60%          | 145 bpm
65%          | 151 bpm
:               :        (extra lines omitted)
85%          | 178 bpm
90%          | 185 bpm
95%          | 191 bpm


Constraints
Don’t hard-code the percentages. Use a loop to increment the percentages from 55 to 95.
Ensure that the heart rate and age are entered as numbers.
Don’t allow the user to continue without entering valid inputs.
Display the results in a tabular format.

Challenge
Implement this as a GUI program that allows the user to use a slider control for the intensity,
and update the interface in real time as the slider moves.
 */
public class KarvonenHeartRate {
    private static final Scanner in = new Scanner(System.in);

    private static int Age;
    private static int RestingHR;

    public static void main(String[] args) {

        System.out.print("Resting Pulse: ");

        RestingHR = Integer.parseInt(GetNumber());

        System.out.print("Age: ");

        Age = Integer.parseInt(GetNumber());

        PrintChart();
    }

    public static String GetNumber()
    {
        String Number = "0";
        char[] NumberArray;
        boolean flag = true;

        while(flag) {
            Number = in.nextLine();
            NumberArray = Number.toCharArray();
            for (int i = 0; i < Number.length(); i++) {
                if ((NumberArray[i] >= '0') && (NumberArray[i] <= '9')) ;
                {
                    flag = false;
                }
            }
        }
        return Number;
    }

    public static void PrintChart()
    {
        System.out.println("\nIntensity    | Rate\n" +
                "-------------|--------\n");
        for (int i = 55; i < 96; i++) {
            PrintChartEntry(i);
        }
    }

    public static void PrintChartEntry(int percent)
    {
        String percentage = Integer.toString(percent);
        percentage.concat("%");
        System.out.printf("%-12s | %-3d BPM\n" ,percentage ,GetHeartRate.BPM(percent, Age, RestingHR));
    }
}
