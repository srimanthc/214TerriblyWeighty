package org.example;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter();

        System.out.println("Welcome to the Ounce Conversion Program!\n");

        System.out.print("How many ounces do you have? ");
        int ounces = scanner.nextInt();

        System.out.println("Thank you! Converting ounces to pounds.\n");

        System.out.println(ounces + " oz is equivalent to " + converter.toPoundsAndOunces(ounces) + ".");
        System.out.println(ounces + " oz is equivalent to " + converter.toPounds(ounces) + ".\n");

        System.out.println("\nThank you for using the OCP!");  }
}
