package com.yarendonmez._2_week;

import java.io.IOException;
import java.util.Scanner;

public class _14_1_Exception {
    public static void main(String[] args) throws ArithmeticException, IOException, NullPointerException {
        Scanner input = new Scanner(System.in);
        System.out.println("Number 1'i giriniz: ");
        int number1 = input.nextInt(); //Kullanıcıdan number1 alma
        System.out.println("Number 2'yi giriniz: ");
        int number2 = input.nextInt(); //Kullanıcıdan number2 alma

        try{
            int result = number1 / number2;
            System.out.println(result);
        } catch (ArithmeticException ai){
            ai.printStackTrace(); //hatanın nedenini ve hangi satırda oluştuğunu ayrıntılı olarak konsola yazdırır.
            //ai.getMessage(); //hata mesajını döndürür
        }finally {
            System.out.println("İstisna olsa da olmasa da çalışacak");
            input.close(); //scannerı kapatır
        }
        System.out.println("Son 10000. satır");
    }
}
