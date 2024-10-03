package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator1 {
    public static void main (String[]  args)  {

          // Establish Scanner Class
           Scanner scanner = new Scanner(System.in);

           System.out.println(" What's your name?  ");
           String name = scanner.nextLine();

           System.out.println(" How many hours have you worked? ");
           float hours = scanner.nextFloat();

           System.out.println(" What is your pay rate? ");
           float rate = scanner.nextFloat();


           float grossPay;


           if (hours<=40){
            grossPay = hours * rate;
           } else {
                  float regularPay = 40 * rate;
                  float overtimeHours = hours - 40;
                  float overtimePay = overtimeHours * rate * 1.5f;
                  grossPay = regularPay + overtimePay;
           }

           System.out.println("Hello " + name + ", your gross pay is: $" + grossPay);
      }
    }
