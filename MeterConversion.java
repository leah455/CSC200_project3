package com.company;

// Program to convert user's measurement (meters) into miles, feet and inches

import java.util.Scanner;

public class MeterConversion {

    public static void main(String[] args) {

        System.out.println("Enter measurement in meters.");

        Scanner keyboard = new Scanner(System.in);
        double measuredMeters = keyboard.nextDouble();

        double metersToMiles = 0.000621371;
        double metersToFeet = 3.28084;
        double metersToInches = 39.37008;

        double miles = measuredMeters * metersToMiles;
        double feet = measuredMeters * metersToFeet;
        double inches = measuredMeters * metersToInches;

        System.out.println(measuredMeters + " meters is " + miles + " miles.");
        System.out.println(measuredMeters + " meters is " + feet + " feet.");
        System.out.println(measuredMeters + " meters is " + inches + " inches.");

        }
    }
