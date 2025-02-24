package com.yarendonmez._1_week;

public class _04_01_JavaWrapperTypes {

    public static void main(String[] args) {

        //Primitive Types
        byte primitiveByteType = 2;
        short primitiveShortType = 1453;
        int primitiveIntType = 14534245;
        long primitiveLongType = 2131418432121132L;

        float primitiveFloatType = 15.24f;
        double primitiveDoubleType = 543.45;

        boolean primitiveBooleanType = true;
        char primitiveCharType = 'y';

        System.out.println(primitiveByteType);
        System.out.println(primitiveShortType);
        System.out.println(primitiveIntType);
        System.out.println(primitiveLongType);
        System.out.println(primitiveFloatType);
        System.out.println(primitiveDoubleType);
        System.out.println(primitiveBooleanType);
        System.out.println(primitiveCharType);

        //Wrapper Types
        Byte WrapperByteType = 2;
        Short WrapperShortType = 1453;
        Integer WrapperIntegerType = 14534245;
        Long WrapperLongType = 2131418432121132L;

        Float WrapperFloatType = 15.24f;
        Double WrapperDoubleType = 543.45;

        Boolean WrapperBooleanType = true;
        Character WrapperCharacterType = 'y';

        System.out.println("\n-------------------\n");
        System.out.println(WrapperByteType);
        System.out.println(WrapperShortType);
        System.out.println(WrapperIntegerType);
        System.out.println(WrapperLongType);
        System.out.println(WrapperFloatType);
        System.out.println(WrapperDoubleType);
        System.out.println(WrapperBooleanType);
        System.out.println(WrapperCharacterType);
    }
}
