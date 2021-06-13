package org.Assignment2.ex30.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Chad Higgins
 */

import java.util.Scanner;

/*
Create a program that generates a multiplication table for the numbers 1 through 12 (inclusive).

Example Output

    1    2    3    4    5    6    7    8    9   10   11   12
    2    4    6    8   10   12   14   16   18   20   22   24
    3    6    9   12   15   18   21   24   27   30   33   36
    4    8   12   16   20   24   28   32   36   40   44   48
    5   10   15   20   25   30   35   40   45   50   55   60
    6   12   18   24   30   36   42   48   54   60   66   72
    7   14   21   28   35   42   49   56   63   70   77   84
    8   16   24   32   40   48   56   64   72   80   88   96
    9   18   27   36   45   54   63   72   81   90   99  108
   10   20   30   40   50   60   70   80   90  100  110  120
   11   22   33   44   55   66   77   88   99  110  121  132
   12   24   36   48   60   72   84   96  108  120  132  144

Constraint
Use a nested loop to complete this program.
Align each column within the table without using the tab character.

Challenges
Create a graphical program. Use a drop-down list to change the base number.
Generate or update the table when the number is selected.
 */
public class MultiplicationTable {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a number between 1 and 12 (inclusive)");
        int Size = in.nextInt();

        //getArray[][]

        int[][] CalcTable = new int[Size+1][Size+1];

        //enter in values
        FillTable(CalcTable, Size);

        //print values
        Printing(CalcTable, Size);

    }

    private static void Printing(int[][] CalcTable, int Size) {

        System.out.println("Your table is: \n");

        for (int i = 1; i < Size+1; i++) {

            for (int j = 1; j < Size+1; j++) {

                System.out.printf("%5d", CalcTable[i][j]);
            }
            System.out.printf("\n");
        }
    }

    public static void FillTable(int[][] CalcTable, int Size)
    {

        for (int i = 1; i < Size+1; i++) {

            for (int j = 1; j < Size+1; j++) {

                CalcTable[i][j] = NeededSomethingToTest(i, j);
            }
        }
    }

    public static int NeededSomethingToTest(int i, int j)
    {
        return i*j;
    }

}
