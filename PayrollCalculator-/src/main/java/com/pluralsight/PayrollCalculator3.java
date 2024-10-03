package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator3 {
    public static void main(String[]  args){

        //Establish Scanner Class
        Scanner scan = new Scanner(System.in);

        System.out.println(" Whats your name? ");
        String name = scan.nextLine();

        System.out.println(" How many hours worked? ");
        float hoursWorked = scan.nextFloat();

        System.out.println(" What is your pay rate");
        float payRate = scan.nextFloat();

        float grossPay;

        if (hoursWorked <=40) {
            grossPay = hoursWorked * payRate;
        } else {
            float regularPay = 40 * payRate;
            float overtimePay = hoursWorked - 40;
            grossPay = overtimePay + regularPay;

        }
        System.out.println(" Hi " + name +" your gross pay is: $" + grossPay);

    }
}
