package com.company;

/*
    Program has user enter city name. Finds number of characters in name, gives name in all uppercase letters,
    name in all lowercase letters and the first character in the name.
 */

import java.util.Locale;
import java.util.Scanner;

public class CityInfo {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your favorite city.");

        String cityName = keyboard.nextLine();

        int length = cityName.length();
        String upper = cityName.toUpperCase();
        String lower = cityName.toLowerCase();
        char firstChar = cityName.charAt(0);

        System.out.println(cityName + " has " + length + " characters.");
        System.out.println(cityName + " in all upper case letters is " + upper + ".");
        System.out.println(cityName + " in all lower case letters is " + lower + ".");
        System.out.println("The first character in " + cityName + " is " + firstChar + ".");

    }

}
