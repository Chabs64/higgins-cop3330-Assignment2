package org.Assignment2.ex25.base;

public class passwordValidator {

/*
    A very weak password contains only numbers and is fewer than eight characters.
    A weak password contains only letters and is fewer than eight characters.
    A strong password contains letters and at least one number and is at least eight characters.
    A very strong password contains letters, numbers, and special characters and is at least eight characters.
 */
    //return a 1 threw 4 based on password strength
    public int passwordStrength(String userPassword)
    {
        char[] password = userPassword.toCharArray();

        if(userPassword.length()>8)
        {
            if (isItStrong(password))
            {
                if (howStrong(password)) {
                    return 4;
                } else return 3;
            }
        }
        else if(userPassword.length()<8)
        {
            if (password.length == hasHowManyNumbers(password))
            {
                return 1;
            }

            if (password.length == hasHowManyChar(password))
            {
                return 2;
            }
        }

        return 5; // the password is greater then 8 character but is not strong or very strong
    }

    public static boolean howStrong(char[] password)
    {
        if (hasHowManyChar(password)+hasHowManyNumbers(password) < password.length)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static int hasHowManyChar(char[] password)
    {
        int charCount = 0;

        for (int i = 0; i<password.length; i++)
        {
            if ((password[i] >= 'a' && password[i] <= 'z') || (password[i] >= 'A' && password[i] <= 'Z'))
                charCount++;
        }

        return charCount;
    }

    public static int hasHowManyNumbers(char[] password)
    {
        int numberCount = 0;

        for (int i = 0; i<password.length; i++)
        {
            if (password[i] >= '0' && password[i] <= '9')
                numberCount++;
        }

        return numberCount;
    }

    public static boolean isItStrong(char[] password)
    {
        if (hasHowManyNumbers(password) >= 1 && hasHowManyChar(password) >= 1)
            return true;

        return false;
    }


}
