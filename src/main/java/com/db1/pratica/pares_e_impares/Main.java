package com.db1.pratica.pares_e_impares;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    /*
        Este problema foi selecionado pois pode-se aplicar o conhecimento adiquirido nos exercícios anteriores como laços de
        repetição com uso do continue e uso das listas
     */

    /*
        Considerando a entrada de valores inteiros não negativos, ordene estes valores segundo o seguinte critério:

        Primeiro os Pares
        Depois os Ímpares

        Sendo que deverão ser apresentados os pares em ordem crescente e depois os ímpares em ordem decrescente.

        Entrada
            A primeira linha de entrada contém um único inteiro positivo N (1 < N < 105) Este é o número de linhas de entrada que vem logo a seguir. As próximas N linhas conterão, cada uma delas, um valor inteiro não negativo.

        Saída
            Apresente todos os valores lidos na entrada segundo a ordem apresentada acima. Cada número deve ser impresso em uma linha, conforme exemplo abaixo.

        Exemplo de Entrada
        10
        4
        32
        34
        543
        3456
        654
        567
        87
        6789
        98

        Exemplo de Saída
        4
        32
        34
        98
        654
        3456
        6789
        567
        543
        87
     */

    public static void main(String[] args) throws IOException {
        if (args.length <= 0) {
            System.out.println("Entrada vazia");
            return;
        }

        int arrayLenght = Integer.valueOf(args[0]);

        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        List<Integer> orderedList = new ArrayList<>();

        separateEvenAndOdds(args, arrayLenght, evenList, oddList);

        Collections.sort(evenList);
        Collections.sort(oddList, Collections.reverseOrder());

        orderedList.addAll(evenList);
        orderedList.addAll(oddList);

        printInMultipleLines(orderedList);
    }

    private static void printInMultipleLines(List<Integer> orderedList) {
        for (Integer value : orderedList) {
            System.out.println(value);
        }
    }

    static void separateEvenAndOdds(String[] args, int arrayLenght, List<Integer> evenList, List<Integer> oddList) {
        for (int i = 0; i <= arrayLenght; i++) {
            int value = Integer.valueOf(args[i]);

            if (value % 2 == 0) {
                evenList.add(value);
                continue;
            }

            oddList.add(value);
        }
    }

}
