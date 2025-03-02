package com.yarendonmez.Examples;
//Santigrat (Celsius) - Fahrenheit Dönüştürücü (Scanner kullanlalım)
//        Soru:
//        Kullanıcıdan Santigrat (Celsius) cinsinden sıcaklık alıp Fahrenheit'e çeviren programı yazınız.
//        Formül: F = (C * 9/5) + 32
//        Çözüm:

import java.util.Scanner;

public class FahrenheitDonusturme {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Havanın Santigrat cinsinden değerini giriniz: ");
        float celcius = input.nextFloat();
        float fahrenheit = (celcius * 9/5) + 32;

        System.out.println("Hava sıcaklığı: "+fahrenheit+" Fahrenheit'dır.");

        input.close();

    }
}

