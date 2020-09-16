package com.db1.plataforma.questao9;

import java.util.TreeMap;

public class NavigableMap {

    public static void main(String[] args) {

        //Exemplos de uso dos métodos definidos na interface NavigableMap

        TreeMap<String, String> stateCapitalsMap = new TreeMap<>();

        stateCapitalsMap.put("Pernambuco", "Recife");
        stateCapitalsMap.put("Espírito Santo", "Vitória");
        stateCapitalsMap.put("Paraná", "Curitiba");
        stateCapitalsMap.put("Tocantins", "Palmas");
        stateCapitalsMap.put("Bahia", "Salvador");

        System.out.println("Os mapeamentos existentes e ordenados são: ");
        stateCapitalsMap.entrySet().forEach(System.out::println);

        System.out.println("\nO primeiro mapeamento de acordo com a ordenação das chaves é: " + stateCapitalsMap.firstEntry());
        System.out.println("O último mapeamento de acordo com a ordenação das chaves é: " + stateCapitalsMap.lastEntry());
        System.out.println("O maior item do mapeamento abaixo da chave \"Paraná\": " + stateCapitalsMap.lowerEntry("Paraná"));
        System.out.println("O maior item do mapeamento abaixo ou igual ao item \"Pernambuco\": " + stateCapitalsMap.floorEntry("Pernambuco"));
        System.out.println("O menor item do mapeamento acima do estado \"Espírito Santo\": " + stateCapitalsMap.higherEntry("Espírito Santo"));
        System.out.println("O menor item do mapeamento acima ou igual ao item \"Minas Gerais\": " + stateCapitalsMap.ceilingEntry("Minas Gerais"));
        System.out.println("Itens mapeados em ordem alfabética decrescente das chaves: " + stateCapitalsMap.descendingMap());

        stateCapitalsMap.pollFirstEntry();
        System.out.println("\nPrimeiro mapeamento removido de acordo com a ordenação das chaves:");
        stateCapitalsMap.entrySet().forEach(System.out::println);

        stateCapitalsMap.pollLastEntry();
        System.out.println("\nÚltimo mapeamento removido de acordo com a ordenação das chaves: ");
        stateCapitalsMap.entrySet().forEach(System.out::println);

    }

}
