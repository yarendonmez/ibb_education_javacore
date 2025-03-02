package com.yarendonmez._1_week;

import java.util.Scanner;

public class _08_01_Scanner {

    public static void main(String[] args) {
        String name,surname;

        //Kullanıcıdan veri almak istiyorsak
        Scanner klavye= new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz:");
        name= klavye.nextLine();

        System.out.println("Lütfen soyadınızı giriniz:");
        surname= klavye.nextLine();

        System.out.println("Hoşgeldiniz "+name+" "+surname+"!");

        //Int ve Double
        System.out.println("Lütfen yaşınızı giriniz:");
        int yas= klavye.nextInt();
        System.out.println("Lütfen boyunuzu giriniz:");
        double boy= klavye.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz:");
        float kilo= klavye.nextFloat();

        System.out.println("Yaşınız: "+yas);
        System.out.println("Boyunuz: "+boy);
        System.out.println("Kilonuz: "+kilo);

        klavye.close();


    }
}
