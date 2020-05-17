package com.antaladrien;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("The sum of the digits");
        System.out.println("Enter positive number:");
        int num = myObj.nextInt();

        System.out.println("The sum of the digits in number "
                + num + " is "
                + sumDigits(num));
    }

    private static int sumDigits(int number) {
        if (number < 0) {
            System.out.println("Enter positive number");
        }

        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
}
