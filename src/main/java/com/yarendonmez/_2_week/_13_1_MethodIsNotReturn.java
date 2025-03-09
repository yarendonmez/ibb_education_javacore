package com.yarendonmez._2_week;

public class _13_1_MethodIsNotReturn {

    // 2- Metotlar (ReturnsuzParametreli)
    public static void metotReturnsuzParametreli(String name) {
        System.out.println("Methot returnsüz parametreli. " + name);
    }

    // 1- Metotlar (Returnsuz Parametresiz)
    public void metotReturnsuzParametresiz() {
        System.out.println("Methot returnsüz parametresiz.");
    }

    //Overloading (Aşırı Yükleme)
    public static void metotReturnsuzParametreli(String name, String surname) {
        System.out.println("metot Returnsuz Parametreli "+name+" "+surname);

    }

    public static void main(String[] args) {
        _13_1_MethodIsNotReturn data1 = new _13_1_MethodIsNotReturn();
        data1.metotReturnsuzParametresiz();

        // instance(new) olmadan static ile çağırdım
        _13_1_MethodIsNotReturn.metotReturnsuzParametreli("Yaren");
        _13_1_MethodIsNotReturn.metotReturnsuzParametreli("Yaren","Dönmez");


    }




}
