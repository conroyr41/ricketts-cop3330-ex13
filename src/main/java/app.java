/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Conroy Ricketts
 */

import java.util.Scanner;
import java.lang.Math;

public class app
{
    public static void main(String[] args)
    {
        Scanner scan;
        String output;
        double principal, ratePercentage, time, xCompounds, amountAccrued;

        System.out.println("Enter the principal:");
        scan = new Scanner(System.in);
        principal = Double.parseDouble(scan.next());

        System.out.println("Enter the rate as a percentage:");
        scan = new Scanner(System.in);
        ratePercentage = Double.parseDouble(scan.next());

        System.out.println("Enter the time in years:");
        scan = new Scanner(System.in);
        time = Double.parseDouble(scan.next());

        System.out.println("Enter the number of times the interest is compounded per year:");
        scan = new Scanner(System.in);
        xCompounds = Double.parseDouble(scan.next());

        amountAccrued = principal * Math.pow(1 + ((ratePercentage/100) / xCompounds), xCompounds * time);

        output = String.format("After %.0f years at %.2f%% %.0f times per year, the investment will be worth $%.2f!", time, ratePercentage, xCompounds, amountAccrued);

        System.out.println(output);
    }
}