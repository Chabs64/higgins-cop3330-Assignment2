package org.Assignment2.ex34.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Chad Higgins
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Sometimes you have to locate and remove an entry from a list based on some criteria.
You may have a deck of cards and need to discard one so it’s no longer in play,
or you may need to remove values from a list of valid inputs once they’ve been used.
Storing the values in an array makes this process easier. Depending on your language,
you may find it safer and more efficient to create a new array instead of modifying the existing one.

Create a small program that contains a list of employee names.
Print out the list of names when the program runs the first time.
Prompt for an employee name and remove that specific name from the list of names.
Display the remaining employees, each on its own line.

Example Output
There are 5 employees:
John Smith
Jackie Jackson
Chris Jones
Amanda Cullen
Jeremy Goodwin

Enter an employee name to remove: Chris Jones

There are 4 employees:
John Smith
Jackie Jackson
Amanda Cullen
Jeremy Goodwin

Constraint
Use an array or list to store the names.

Challenges
If the user enters a name that’s not found, print out an error message stating that the name does not exist.
Read in the list of employees from a file, with each employee on its own line.
Write the output to the same file you read in.
 */
public class EmployeeListRemoval {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<String> ListEmployees = new ArrayList<String>();
        ListEmployees.add("John Smith");
        ListEmployees.add("Jackie Jackson");
        ListEmployees.add("Chris Jones");
        ListEmployees.add("Amanda Cullen");
        ListEmployees.add("Jeremy Goodwin");

        PrintList(ListEmployees);

        System.out.println("\nEnter an employee name to remove: ");
        String RemoveName = in.nextLine();

        DeleteEmployee(ListEmployees, RemoveName);

        PrintList(ListEmployees);
    }

    public static void PrintList(ArrayList<String> List)
    {
        System.out.println("There are "+List.size()+" employees:");
        for (String s : List) {
            System.out.println(s);
        }
    }

    public static void DeleteEmployee(ArrayList<String> List, String Name)
    {
        for (int i = 0; i < List.size(); i++) {
            if (Name.equals(List.get(i)))
            {
                List.remove(i);
            }
        }
    }

}
