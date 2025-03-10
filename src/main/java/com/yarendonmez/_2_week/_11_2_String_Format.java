package com.yarendonmez._2_week;

import java.util.Formatter;

public class _11_2_String_Format {
    public static void formatter1() {
        Formatter formatter = new Formatter();
        formatter.format("Merhabalar adınız: %s, soyadınız: %s, yaşınız: %d, maaşınız: %f", "Yaren", "Dönmez", 23, 136.9);
        System.out.println(formatter);
        formatter.close(); //Belleği serbest bırakma
    }

    public static void main(String[] args) {
        formatter1();
    }
}
