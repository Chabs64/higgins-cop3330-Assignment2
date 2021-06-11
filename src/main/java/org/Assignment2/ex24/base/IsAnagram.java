package org.Assignment2.ex24.base;

import static java.util.Arrays.sort;

public class IsAnagram {
    public static boolean isAnagram( String word1, String word2)
    {
        if (word1.length() == word2.length())
        {
            return hasSameLetters(word1, word2);
        }
        else
        {
            return false;
        }
    }

    public static boolean hasSameLetters(String word1, String word2)
    {
        char[] word1Array = word1.toUpperCase().toCharArray();
        char[] word2Array = word2.toUpperCase().toCharArray();

        sort(word1Array);
        sort(word2Array);

        for(int i = 0; i < word1.length(); i++)
        {
            if(word1Array[i] != word2Array[i])
            {
                return false;
            }
        }

        return true;

    }
}
