package com.db1.plataforma.questao9;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {

        /*
            A classe TreeMap implementa a interface NavigableMap utilizando a árvore rubro-negra. Esta classe ordena automaticamente seus mapeamentos
            de acordo com a ordenação natural das chaves (implementando a interface Comparable) ou pelo Comparator definido
            na sua construção do TreeMap. Desta forma a TreeMap garante um custo de log(n) para as operações de containsKey,
            get, put e remove.

            A implementação do TreeMap não é sincronizada. Caso seja necessário utilizar esta classe em aplicações com múltiplas
            threads é preciso sincroniza-las externamente através de outras classes que a contenha ou então criando o TreeMap usando o
            Collections.synchronizedSortedMap:

            SortedMap m = Collections.synchronizedSortedMap(new TreeMap(...));

            Portanto o TreeMap deve ser utilizado quando os mapeamentos devem ser adicionados e removidos de forma consistente, quando
            manter a ordem das chaves for importante e quando o custo de O(log(n)) for suficiente para a manipulação dos elementos.

         */

        //Exemplo de uso do TreeMap

        Map<Integer, String> summary = new TreeMap<>();

        summary.put(22, "Bibliografia");
        summary.put(8, "Assumindo Responsabilidade");
        summary.put(1, "Introdução");
        summary.put(11, "Primeiro, não cause danos");
        summary.put(23, "Dizendo não");
        summary.put(16, "Ética de Trabalho");
        summary.put(7, "Profissionalismo");

        //Ao listar os mapeamentos podemos verificar que foram ordenados de acordo com a chave apesar de terem sido inseridos no map
        //de forma desordenada
        System.out.println("Sumário do Clean Coder: ");
        summary.entrySet().forEach(System.out::println);

    }

}
