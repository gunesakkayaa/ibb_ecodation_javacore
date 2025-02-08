package com.gunesakkaya._1_week;

import java.util.Scanner;

// single comment
/* Multiple */
public class week1_examples_1 {
    // psvm => tab
    public static void main(String[] args) {

        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Variable
        double aValue, bValue = 0, result;

        System.out.println("lütfen a giriniz:");
        aValue = scanner.nextDouble();

        System.out.println("lütfen b giriniz");
        bValue = scanner.nextDouble();

        // ax+b=0 x=-b/a
        result = (-bValue/aValue);
        System.out.println(result);

        scanner.close();
    } // end psvm
} //end class