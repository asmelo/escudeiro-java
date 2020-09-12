package com.db1.plataforma.questao8;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortedSetExample {

    public static void main(String[] args) {

        //Exemplos de uso dos métodos definidos na interface SortedSet

        TreeSet<String> brazilianStates = new TreeSet<>();

        brazilianStates.add("Paraná");
        brazilianStates.add("Alagoas");
        brazilianStates.add("Sergipe");
        brazilianStates.add("Amazonas");

        System.out.println("Estados brasileiros ordenados alfabeticamente: " + brazilianStates);
        System.out.println("O primeiro estado considerando a ordem alfabética dos itens é: " + brazilianStates.first());
        System.out.println("O último estado considerando a ordem alfabética dos itens é: " + brazilianStates.last());
        System.out.println("O subconjunto a partir do estado \"Amazonas\" até o estado \"Sergipe\" é: " + brazilianStates.subSet("Amazonas", "Sergipe"));
        
    }

}
