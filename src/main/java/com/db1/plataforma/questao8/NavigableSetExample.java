package com.db1.plataforma.questao8;

import java.util.TreeSet;

public class NavigableSetExample {

    public static void main(String[] args) {

        //Exemplos de uso dos métodos definidos na interface NavigableSet

        TreeSet<String> brazilianStates = new TreeSet<>();

        brazilianStates.add("Paraná");
        brazilianStates.add("Alagoas");
        brazilianStates.add("Sergipe");
        brazilianStates.add("Amazonas");

        System.out.println("Estados brasileiros ordenados alfabeticamente: " + brazilianStates);
        System.out.println("O maior elemento da coleção abaixo do estado \"Paraná\": " + brazilianStates.lower("Paraná"));
        System.out.println("O maior elemento da coleção abaixo ou igual ao item \"Pernambuco\": " + brazilianStates.floor("Pernambuco"));
        System.out.println("O menor elemento da coleção acima do estado \"Alagoas\": " + brazilianStates.higher("Alagoas"));
        System.out.println("O menor elemento da coleção acima ou igual ao item \"Paraná\": " + brazilianStates.ceiling("Paraná"));
        System.out.println("Estados brasileiros em ordem alfabética decrescente: " + brazilianStates.descendingSet());

        brazilianStates.pollFirst();
        System.out.println("Primeiro item da coleção removido: " + brazilianStates);
        brazilianStates.pollLast();
        System.out.println("Útimo item da coleção removido: " + brazilianStates);
        
    }

}
