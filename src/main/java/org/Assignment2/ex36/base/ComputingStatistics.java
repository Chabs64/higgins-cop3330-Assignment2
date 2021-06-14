package org.Assignment2.ex36.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Chad Higgins
 */

/*
Statistics is important in our field. When measuring response times or rendering times,
it’s helpful to collect data so you can easily spot abnormalities.
For example, the standard deviation helps you determine which values are outliers and which values are within normal ranges.

Write a program that prompts for response times from a website in milliseconds.
It should keep asking for values until the user enters “done.”

The program should print the average time (mean), the minimum time, the maximum time, and the population standard deviation.

Example Output
Enter a number: 100
Enter a number: 200
Enter a number: 1000
Enter a number: 300
Enter a number: done

Numbers: 100, 200, 1000, 300
The average is 400.0
The minimum is 100
The maximum is 1000
The standard deviation is 353.55

Constraints
Use functions called average, max, min, and std, which take in a list of numbers and return the results.
Use loops and arrays to perform the input and mathematical operations.
Be sure to exclude the "done" entry from the inputs.
Be sure to properly ignore any invalid inputs.
Keep the input separate from the processing and the output.

Challenges
Have the program read in numbers from an external file instead of prompting for the values.
 */

//Note: TA, the example uses a weird std formula.

import java.util.ArrayList;
import java.util.Scanner;

public class ComputingStatistics {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Integer> DataList = new ArrayList<Integer>();
        getData(DataList);

        DisplayResult(DataList);

    }

    private static void DisplayResult(ArrayList<Integer> DataList) {
        System.out.printf("Numbers: ");
        for (Integer integer : DataList) {
            System.out.printf("%d, ", integer);
        }
        System.out.printf("\nThe average is %.1f", average(DataList));
        System.out.printf("\nThe minimum is %d", minimum(DataList));
        System.out.printf("\nThe maximum is %d", maximum(DataList));
        System.out.printf("\nThe standard deviation is %.2f", std(DataList));
    }

    public static int minimum(ArrayList<Integer> DataList)
    {
        int min = DataList.get(0);
        for (Integer Data : DataList) {

            if (min >= Data) {
                min = Data;
            }
        }
        return min;
    }

    public static int maximum(ArrayList<Integer> DataList)
    {
        int max = 0;
        for (Integer Data : DataList) {

            if (max <= Data) {
                max = Data;
            }
        }
        return max;
    }

    public static double average(ArrayList<Integer> DataList)
    {
        int total = 0;
        for (Integer Data : DataList) {
            total += Data;
        }

        return (double) total/DataList.size();
    }

    public static double std(ArrayList<Integer> DataList)
    {
        double total = 0;
        for (int i = 0; i < DataList.size(); i++) {
            total += Math.pow((double)DataList.get(i)-(average(DataList)), 2);
        }

        double StandardDeviation = Math.sqrt(total/(DataList.size()));

        return StandardDeviation;
    }


    public static void getData(ArrayList<Integer> DataList)
    {
        String UserInput;
        while(true) {

            System.out.println("Enter a number: ");
            UserInput = in.nextLine();

            if (UserInput.equals("done"))
            {
                break;
            }

            DataList.add(Integer.parseInt(UserInput));
        }
    }
}
