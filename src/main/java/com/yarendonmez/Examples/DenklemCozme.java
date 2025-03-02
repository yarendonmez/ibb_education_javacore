package com.yarendonmez.Examples;

import java.util.Scanner;

public class DenklemCozme {
// Birinci Dereceden 1 Bilinmeyenli Denklemi Çözme (Scanner kullanalım.)
//      Soru:
//      Kullanıcıdan ax + b = 0 denklemindeki a ve b değerlerini alıp x'i hesaplayan programı yazınız.
//      Çözüm:
public static void main(String[] args) {

    double aValue,bValue = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("x in katsayısını giriniz: ");
    aValue = input.nextInt(); //x'in katsayısı
    System.out.println("sabit sayıyı giriniz: ");
    bValue = input.nextInt(); //sabit sayı

    double sonuc= (-bValue)/ aValue;
    System.out.println("işlemin sonucunda x="+sonuc+" bulunur.");

    input.close();
}
}
