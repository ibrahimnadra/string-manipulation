package com.knoldus;
import java.lang.String;
public class MyStringClass  {
    public String reverseString(final String inputString)
    {
        final StringBuilder mutableInputString = new StringBuilder(inputString);
        int lengthOfString = mutableInputString.length();
        for (int index = 0; index < lengthOfString / 2; index ++) {
            final char character = mutableInputString.charAt(index);
            final int newIndex = lengthOfString - index - 1;
            // swapping
            mutableInputString.setCharAt(index, mutableInputString.charAt(newIndex));
            mutableInputString.setCharAt(newIndex, character);
        }
        return mutableInputString.toString();
    }

//    public String reverseString(final String inputString)
//    {
//        StringBuilder newString = new StringBuilder("");
//        char character;
//
//        for (int index = 0; index < inputString.length(); index ++)
//        {
//            character = inputString.charAt(index); //extracts each character
//            newString = character + newString; //adds each character in front of the existing string
//        }
//        return newString;
//    }
    public int getStringLength(final String inputString)
    {
        int lengthOfString = 0;
        char ch[] = inputString.toCharArray();

        for(char c : ch)
        {
            lengthOfString++;
        }
        return lengthOfString;
    }
}