package com.company;

//Program takes inputted word and shifts it right 2 and left 2.

import java.util.Scanner;

public class LetterShift {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter in a word.");

        String word = keyboard.nextLine();

        int length = word.length();

        String rightShift = word.substring(0, length - 2);
        String leftShift = word.substring(2, length);

        System.out.println("Original word is " + word + ".");
        System.out.println(word + " shifted right by 2 is " + rightShift + ".");
        System.out.println(word + " shifted left by 2 is " + leftShift + ".");

    }
    
}
