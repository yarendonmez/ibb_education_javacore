package com.yarendonmez.Examples;

import java.util.Scanner;

public class SumUntil100 {
    /* 1.  Kullanıcının Verdiği pozitif bir sayıya kadar toplamını yapan hesaplayan Algoritma ?
     Şartlar - 1 : Kullanıcı eğer sayı olarak  100  fazla sayı girerse 100 kadar toplasın. (break)
     Şartlar - 2 : Kullanıcı verdiği sayılar içinde eğer 47 varsa bunu toplamaya dahil etmesin.(continue)
     Soru:
     Çözüm:
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pozitif bir sayı giriniz ");
        int number = Math.abs(input.nextInt());//Kullanıcıdan sayı alma
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            if (i == 47) {
                System.out.println("47 sayısı toplama dışında tutulacaktır");
                continue;//47 yi atla
            }


            //100 den fazla veri olursa
            if (i > 100) {
                System.out.println("Sayı üst sınırı olan 100'ü aştınız!");
                break;
            }
            sum += i;
        }
        System.out.println("Sonuç: "+sum); //Sonucu ekrana yazdırır
        input.close(); //Scannerı kapatır
    }
}


