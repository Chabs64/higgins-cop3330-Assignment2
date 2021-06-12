package org.Assignment2.ex27.base;

public class ValidateInput {

    public void validateInput(String fName, String lName, String zipCode, String employeeID)
    {
        String OutputPrint = "";

        if(!isName(fName))
        {
            if(isEmpty(fName))
            {
                OutputPrint += String.format("The First name must be filled in.\n");
            }
            else
            {
                OutputPrint += String.format("\"%s\" is not a valid first name. It is too short.\n", fName);
            }
        }

        if(!isName(lName))
        {

            if(isEmpty(lName))
            {
                OutputPrint += String.format("The Last name must be filled in.\n");
            }
            else
            {
                OutputPrint += String.format("\"%s\" is not a valid Last name. It is too short.\n", lName);
            }
        }

        if(!isNumber(zipCode))
        {
            OutputPrint += String.format("The ZIP code must be numeric.\n");
        }

        if(!isID(employeeID))
        {
            OutputPrint += String.format("%s is not a valid ID.", employeeID);
        }

        printValidation(OutputPrint);
    }

    public boolean isName(String name)
    {
        if(name.length() >= 2)
            return true;

        return false;
    }

    public static boolean isEmpty(String name)
    {
        if(name.length() == 0)
            return true;

        return false;
    }

    public boolean isNumber(String zipCode)
    {
        char[] zip = zipCode.toCharArray();

        for(int i = 0; i<zipCode.length(); i++)
        {
            if(!(zip[i] >= '0' && zip[i] <= '9'))
            {
                return false;
            }
        }
        return true;
    }

    public boolean isID(String ID)
    {
        char[] IDArray = ID.toCharArray();

        if (ID.length()!= 7)
        {
            return false;
        }

        for(int i = 0; i<ID.length(); i++)
        {
            if(i<2)
            {
                if(!(IDArray[i] >= 'a' && IDArray[i] <= 'z') && !(IDArray[i] >= 'A' && IDArray[i] <= 'Z'))
                {
                    return false;
                }
            }

            if (i==2)
            {
                if (IDArray[i] != '-')
                    return false;
            }

            if((i>2) && (i<6))
            {
                if(!(IDArray[i] >= '0') && !(IDArray[i] <= '9'))
                {
                    return false;
                }
            }
        }
        return true;
    }

    public void printValidation(String print)
    {
        System.out.println(print);
    }
}
