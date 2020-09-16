package com.db1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Teste {

    private final static String PREFIX = "[";
    private final static String SUFFIX = "]";

    public static void main(String[] args) {
        System.out.println("Hello World 3!!");
        Character char1 = Character.valueOf('a');
        Character char2 = Character.valueOf('b');
        if (char1.compareTo(char2) == -1) {
            System.out.println(String.format("O caractere %s precede %s", char1, char2));
        }

        Short num1 = Short.valueOf("10");
        Short num2 = Short.valueOf("25");
        System.out.println("A soma dos dois número é: " + (num1 + num2));

        Integer int1 = 1;
        Integer int2 = 2;
        Integer int3 = 3;
        List<Integer> list = new ArrayList();
        list.add(int1);
        list.add(int2);
        if (!list.contains(int3)) {
            System.out.println("A lista não possui o inteiro " + int3);
        }

        Service service = new Service();

        System.out.println("UserCode: " + Service.USER_CODE);
        System.out.println("Brand: " + Service.BRAND);
        service.variableTest();

        StringJoiner joiner = new StringJoiner(", ", PREFIX, SUFFIX);
        joiner.add("Maçã")
                .add("Pera")
                .add("Uva");

        System.out.println(joiner.toString()); //Irá imprimir "[Maça, Pera, Uva]"

        String instrumento = "Violão";
        System.out.println(instrumento.charAt(2));

        StringBuffer stringBuffer = new StringBuffer("Violão");
        stringBuffer.insert(2, "ooo");
        System.out.println(stringBuffer);

        StringBuilder stringBuilder = new StringBuilder("Violão");
        stringBuilder.insert(2, "ooo");
        System.out.println(stringBuilder);

        service.stringTest();

        Integer valInt = 3;
        //String valString = valInt.toString();

        Boolean valBoolean = true;
        String valString = valBoolean.toString();

        BigDecimal bdFromDouble = new BigDecimal(0.1d);
        System.out.println(bdFromDouble);

        BigDecimal bdFromDouble2 = BigDecimal.valueOf(0.1d);
        System.out.println(bdFromDouble2);

        Long valLong = 2l;




    }



}
