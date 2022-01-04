package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Check is Leap Year");
        int year;
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }

        }
        if(isLeapYear){
            System.out.println("Năm "+year+" là năm nhuận");
        } else {
            System.out.println("Năm "+year+" không phải là năm nhuận");
        }
    }
}
