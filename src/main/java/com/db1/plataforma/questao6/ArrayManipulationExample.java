package com.db1.plataforma.questao6;

import java.util.Arrays;
import java.util.StringJoiner;

public class ArrayManipulationExample {

    public static void main(String[] args) {
        //Declarando um array
         double[] doubleArray;

         //Alocando memória para 5 doubles
        doubleArray = new double[5];

        //Declarando e alocando memória para 10 Booleans
        Boolean[] booleanArray = new Boolean[10];

        //Inicializando o primeiro e segundo elemento de um array
        doubleArray[0] = 5.8d;
        doubleArray[1] = 3.2;
        booleanArray[0] = Boolean.FALSE;
        booleanArray[1] = Boolean.TRUE;

        //Inicializando através de um array literal
        String[] stringArray = {"Carlos", "Maria", "Pedro", "Joana"};
        int[] intArray = {1,3,5,7,8};

        //Acessando posições de um array
        System.out.println("A quarta posição do array de Strings é: " + stringArray[3]);
        System.out.println("A terceira posição do array de inteiros é: " + intArray[2]);

        //Percorrendo um array
        System.out.println("\nPercorrendo arrays:");
        for (int i = 0; i < booleanArray.length; i++) {
            System.out.println(String.format("A posição %d do array de booleans é %s", i, booleanArray[i]));
        }

        StringJoiner stringJoiner = new StringJoiner(", ", "[", "]");
        for (double doubleValue : doubleArray) {
            stringJoiner.add(String.valueOf(doubleValue));
        }
        System.out.println("\ndoubleArray: " + stringJoiner.toString());

        System.out.println("\nValores do array de Strings: ");
        Arrays.stream(stringArray).forEach(System.out::println);

    }

}
