package com.db1.plataforma.questao9;

import com.db1.plataforma.questao8.TreeSetExample;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortedMapExample {

    public static void main(String[] args) {
        /*
        O SortedMap provê uma ordenação das suas chaves. As chaves são ordenadas de acordo com a ordenação natural das chaves (implementando
        a interface Comparable) ou pelo Comparator definido na sua construção do map. Esta ordenação é refletida ao interagir com
        as visões de coleção do map retornadas pelos métodos entrySet, keySet e values.
    */

        TreeMap<String, String> stateCapitalsMap = new TreeMap<>();

        stateCapitalsMap.put("Pernambuco", "Recife");
        stateCapitalsMap.put("Espírito Santo", "Vitória");
        stateCapitalsMap.put("Paraná", "Curitiba");
        stateCapitalsMap.put("Tocantins", "Palmas");
        stateCapitalsMap.put("Bahia", "Salvador");

        //Ao converter o map em uma collection percebemos que as chaves foram ordenadas de acordo com o compareTo implementado na classe String
        System.out.println("Os mapeamentos existentes são: ");
        stateCapitalsMap.entrySet().forEach(System.out::println);

    }

}
