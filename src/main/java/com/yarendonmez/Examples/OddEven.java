package com.yarendonmez.Examples;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Lütfen pozitif bir sayı giriniz\n");

        Scanner input = new Scanner(System.in);
        long number = input.nextLong();
        if (number <0){
            System.out.println(number+", negatif bir sayıdır\n");
            number = number * (-1);
            System.out.println("Sayı, "+number+" olarak güncellendi!\n");
        }
        if (number % 2 == 0)
            System.out.println(number + ", bir çift sayıdır.");
        else
            System.out.println(number + ", bir tek sayıdır.");


    }
}
