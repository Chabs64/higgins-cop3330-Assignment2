package org.Assignment2.ex25.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Chad Higgins
 */

/*
Functions help you abstract away complex operations, but they also help you build reusable components.

Create a program that determines the complexity of a given password based on these rules:

A very weak password contains only numbers and is fewer than eight characters.
A weak password contains only letters and is fewer than eight characters.
A strong password contains letters and at least one number and is at least eight characters.
A very strong password contains letters, numbers, and special characters and is at least eight characters.

Example Output
The password '12345' is a very weak password.
The password 'abcdef' is a weak password.
The password 'abc123xyz' is a strong password.
The password '1337h@xor!' is a very strong password.

Constraints
Create a passwordValidator function that takes in the password as its argument and
 returns a value you can evaluate to determine the password strength.
Do not have the function return a string—you may need to support multiple languages in the future.
Use a single output statement.

Challenge
Create a GUI application or web application that displays graphical feedback as well as text feedback in real time.
As someone enters a password, determine its strength and display the result
 */

import java.util.Scanner;

public class PasswordStrengthIndicator {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String print;
        String UserPassword;
        passwordValidator password = new passwordValidator();

        for(int i = 0; i < 4; i++)
        {
            System.out.println("Enter a password");
            UserPassword = in.nextLine();

            print = getStrength(password.passwordStrength(UserPassword), UserPassword);

            printing(print);
        }
    }

    private static void printing(String print)
    {
        System.out.println(print);
    }

    private static String getStrength(int Strength, String password)
    {
        switch (Strength)
        {
            case 1:
                return String.format("The password '%s' is a very weak password.\n", password);

            case 2:
                return String.format("The password '%s' is a weak password.\n", password);

            case 3:
                return String.format("The password '%s' is a strong password.\n", password);

            case 4:
                return String.format("The password '%s' is a very strong password.\n", password);

            default: return String.format("The password '%s' is either not long enough or does not contain at least 1 number and 1 letter.\n", password);
        }
    }
}
