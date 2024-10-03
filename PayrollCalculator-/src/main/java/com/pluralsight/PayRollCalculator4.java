package com.pluralsight;
import java.util.Scanner;

public class PayRollCalculator4 {


    public static void main(String[]  args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Whats your name? ");
    String name = scanner.nextLine();

    System.out.println(" How many hours worked? ");
    float hoursWorked= scanner.nextFloat();

    System.out.println(" What is your pay rate? ");
    float payRate = scanner.nextFloat();

    float grossPay = (hoursWorked * payRate);

    System.out.println(" Hello, " + name +  (" Your Gross Pay is " + grossPay));




}



}
