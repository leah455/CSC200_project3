package com.company;

/*
    Program to convert an integer (up to 5 digits and not negative) into sequence of individual digits
    and displaying each digit on a separate line.
 */

import java.util.Scanner;

public class IntegerDigits {

    public static void main(String[] args) {

        System.out.println("Enter a positive integer up to 5 digits.");

        Scanner keyboard = new Scanner(System.in);
        int integer = keyboard.nextInt();

        String integerString = String.valueOf(integer);

        int length = integerString.length();

        for (int i = 0; i < length; i++) {
            System.out.println(integerString.charAt(i));
        }

    }

}
