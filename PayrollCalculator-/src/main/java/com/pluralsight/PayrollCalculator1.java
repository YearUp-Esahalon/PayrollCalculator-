package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator1 {
    public static void main (String[]  args)  {

          // Establish Scanner Class
           Scanner scanner = new Scanner(System.in);

           System.out.println(" What's your name?  ");
           String name = scanner.nextLine();

           System.out.println(" How many hours have you worked? ");
           Float hours = scanner.nextFloat();

           System.out.println(" What is your pay rate? ");
           Float rate = scanner.nextFloat();

           Float grossPay = hours * rate;
           System.out.println(" Hello, " + name + "! Your Gross Pay is: $" + grossPay);
    }
}