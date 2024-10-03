package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator2 {

    public static void main(String[]  args){
        Scanner scan = new Scanner(System.in);

        System.out.println (" First & Last Name ");
        String name = scan.nextLine();

        System.out.println (" How many hours do you work weekly?  ");
        float hours = scan.nextFloat();

        System.out.println ( " What is your hourly pay rate?  ");
        float rate = scan.nextFloat();

        float GrossPay;

        if (hours<=40) {
         GrossPay = hours * rate;
        }else{
        float regularPay = 40 * rate;
        float overtimeHours = hours - 40;
        float overtimePay =  overtimeHours * rate * 1.5f;
        GrossPay = regularPay + overtimePay;

        }
        System.out.println(" Hello " + name  + " your gross pay is:  $" + GrossPay);



    }

}
