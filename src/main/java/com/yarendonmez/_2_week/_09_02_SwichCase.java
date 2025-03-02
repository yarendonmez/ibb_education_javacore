package com.yarendonmez._2_week;

import java.util.Scanner;

public class _09_02_SwichCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int number = input.nextInt();

        switch (number) {
            case 1:
                System.out.println("Sayı 1");
                break;

            case 2:
                System.out.println("Sayı 2");
                break;

            case 3:
                System.out.println("Sayı 3");
                break;

            case 4:
                System.out.println("Sayı 4");
                break;

            case 5:
                System.out.println("Sayı 5");
                break;

            default:
                System.out.println(number+", 1 ile 5 dışındadır.");
                break;
        }
    }

}
