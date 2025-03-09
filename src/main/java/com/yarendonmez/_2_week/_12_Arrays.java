package com.yarendonmez._2_week;

public class _12_Arrays {
    public static void main(String[] args) {
        String[] city = new String[6];
        city[0] = "Ankara";
        city[1] = "Kırıkkale";
        city[2] = "İstanbul";
        city[3] = "İzmir";
        //city[4] = "Muğla";
        city[5] = "Antalya";

        System.out.println("Eleman sayısı: "+ city.length);
        System.out.println(city);
        System.out.println(city[3]);
        System.out.println("Son eleman: "+city[city.length-1]); //eleman sayısını bilmiyorsak son elemanı yazdırmak için dinamik yol budur.
        System.out.println("Son eleman: "+city[6-1]);

        //Java'da -1 diye bir index yoktur.
        // System.out.println("Son eleman: "+city[-1]);




    }
}
