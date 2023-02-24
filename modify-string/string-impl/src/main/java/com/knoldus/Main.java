package com.knoldus;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the String : ");
        Scanner stringScanner = new Scanner(System.in);
        String inputString = stringScanner.next();
        MyStringClass myStringObject = new MyStringClass();
        System.out.println("Length of the string is " + myStringObject.getStringLength(inputString));
        System.out.println("Reversed String is " + myStringObject.reverseString(inputString));
    }
}