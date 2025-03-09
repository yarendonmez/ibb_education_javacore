package com.yarendonmez._2_week;

public class _13_2_MethodIsReturn {
    //3- Methotlar returnlü parametresiz
    public String methotReturnluParametresiz() {
        return "Methot returnlü parametresiz";
    }

    //4- Methotlar returnlü parametreli
    public Integer methotReturnluParametreli(int number){
        return number;
    }

    //PSVM
    public static void main(String[] args) {
        _13_2_MethodIsReturn isReturn = new _13_2_MethodIsReturn();

        String result1 = isReturn.methotReturnluParametresiz();
        Integer result2 = isReturn.methotReturnluParametreli(5);

        System.out.println(result1);
        System.out.println(result2);



    }
}