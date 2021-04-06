package com.company;

/*
    Program to determine cost per 100 miles and how far a car can go with gas in the car.
    User inputs number of gallons of gas in tank, fuel efficiency in miles per gallon and price of gas per gallon.
 */

import java.util.Scanner;

public class CarTravel {

    public static void main (String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many gallons of gas is in the car (integer).");
        int gallonsInCar = keyboard.nextInt();

        System.out.println("What is the fuel efficiency of the car in miles per gallon (integer).");
        int fuelEfficiency = keyboard.nextInt();

        System.out.println("What is the price of gas per gallon.");
        double gasPrice = keyboard.nextDouble();

        int distance = gallonsInCar * fuelEfficiency;
        double cost = gasPrice / fuelEfficiency * 100;

        System.out.println("The car will drive " + distance + " miles with " + gallonsInCar + " gallons in the car.");
        System.out.printf("It will cost $%5.2f to drive 100 miles.", cost);

    }

}
