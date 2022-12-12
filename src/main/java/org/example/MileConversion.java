package org.example;

import java.util.Scanner;

public class MileConversion {
    public static void main(String[] args)
    {

        final int feet = 4280;
        final int yards = 1760;
        final int inches = 63360;
        double miles;
        int feetConversion;
        int yardsConversion;
        int inchesConversion;
        Scanner inputMiles = new Scanner(System.in);

        System.out.println("In a mile there are " + inches + " inches, " + feet + " feet and " + yards + " yards");
        System.out.println("input the number of miles for the miles to inches, feet and yards conversions >> ");
        miles = inputMiles.nextDouble();
        System.out.println("You inputted " + miles + " miles");
        feetConversion = (int) Math.round(feet * miles);
        yardsConversion = (int) Math.round(yards * miles);
        inchesConversion = (int) Math.round(inches * miles);
        System.out.println(miles + " miles converts into " + inchesConversion + " inches, " + feetConversion + " feet and " + yardsConversion + " yards");


    }
}