package com.yarendonmez._2_week;
/*
 Garbarage Collectors:
 Yalnızca ama yalnızca kapalı olmayan dosya, scanner, formatter vb yapılarda otomatik kapanmaz1
 eğer biz bunu manuel olarak kapatmazsak bu kapatılmayan nesneyi temizleyebilir
 ancak açık olan dosyayı kapatmazsak cache belleği kullanmaya devam eder.
*/
import java.util.Formatter;

public class _11_2_String_Format {
    public static void formatter1() {
        Formatter formatter = new Formatter();
        formatter.format("Merhabalar adınız: %s, soyadınız: %s, yaşınız: %d, maaşınız: %.2f", "Yaren", "Dönmez", 23, 136.9);
        System.out.println(formatter);
        formatter.close(); //Belleği serbest bırakma
    }

    public static void formatter2() {
        String formatter= String.format("Merhabalar adınız: %s, soyadınız: %s, yaşınız: %d, maaşınız: %f", "Yaren", "Dönmez", 23, 136.9);
        System.out.println(formatter);

    }

    public static void main(String[] args) {
        formatter1();
        formatter2();
    }
}
