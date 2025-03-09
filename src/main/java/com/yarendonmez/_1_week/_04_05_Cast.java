package com.yarendonmez._1_week;

public class _04_05_Cast {
    public static void main(String[] args) {
        // 1-) Widening Cast - Implicit Cast(Kapalı) Daha küçük bir türü daha büyük bir veriye dönüştürmek için
        byte cast1Byte = 100; //Küçük veri
        int cast1Int = cast1Byte; // Büyük olan verinin içine ekledim (Veri kaybı yoktur)
        System.out.println(cast1Int);

        // 2-) Narrowing Cast- Explicit Cast(Açık) Daha büyük bir türü daha küçük bir veriye dönüştürmek için
        int cast2Int = 99999999;
        byte cast2Byte = (byte) cast2Int;
        System.out.println(cast2Byte); //Çıktı: -1 --veri kaybı oldu

        // 3-) char  => Int
        char cast3Char = '&';
        int cast3Int = cast3Char;
        System.out.println(cast3Char+"'ın ascii karşılığı: "+cast3Int);

        //4-) Int => char
        int cast4Int = 38;
        char cast4Char = (char) cast4Int;
        System.out.println(cast4Int+" ascii kodunun değeri: "+cast4Char);

    }

}
