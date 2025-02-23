package com.yarendonmez._1_part_javatypes;

public class _02_Variables {
    public static void main(String[] args) {
        // Veri değişken isimlerini yazarken;
        // veri isimlendirmeleri;
        // 1-) isim, veya sıfat, zamir kullanmamız lazım.
        // Anlamlı ve açıklayıcı isimler seçiniz
        // int studentCounter=11;
        // float totalSalary=14.5355f;

        int studentNumber = 12345678;
        System.out.println(studentNumber);

        //2-) _ veya $ ile başlayabilirsiniz
        int _studentNumber = 123455741;
        System.out.println(_studentNumber);

        //2-) _ veya $ ile başlayabilirsiniz
        int $studentNumber = 212454221;
        System.out.println($studentNumber);

        // 3-) sayı ile bitebilir.
        int studentNumber123 = 105;
        System.out.println(studentNumber123);

        /*
            4-) Sayı ile başlanmaz
            5-) _veya$ dışında özel simgelerle başlanmaz
            6-) değişken isimlerini camelCase kuralına göre yazılır
         */
        // yazamazsınız
        //int age=11; // aynı isimde yazamazsınız
        //int 44schoolNumber=11; // sayıyla başlayamazsınız.
        //int ~age=11;   // özel simgeyle başlayamazsınız.
        //int ``age=11;   // özel simgeyle başlayamazsınız.
        //int   school-number=99;    // kebab-case yazamazsınız.
        //System.out.println(school-number);
        //int school number=66;  // değişkenlerde boşluk kullanılamaz

        // yazmayalım
        float grade = 99.99f;
        System.out.println(grade);


        // SABIT
        final int MAX_STACK_SIZE = 100;
        System.out.println(MAX_STACK_SIZE);
    }
}
