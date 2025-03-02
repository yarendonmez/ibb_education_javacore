package com.yarendonmez.Examples;

import java.util.Scanner;

public class SumUntil100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1 den x e kadar olan sayıların toplamı için x değerini giriniz: ");

        int number = input.nextInt(); //Kullanıcıdan sayı alma
        int sum = 0;
        int i = 0;

        if (number > 100)
            System.out.println("100'den küçük bir sayı giriniz");

        else {
            while (i <= number) {
                if (i == 47) {
                    continue;
                }
                sum = sum + i;
                i++;
            }
        }
        System.out.println("Sonuç: " + sum);

    }
}
