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
