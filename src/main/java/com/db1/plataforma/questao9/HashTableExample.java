package com.db1.plataforma.questao9;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

    public static void main(String[] args) {

        /*
            O HashTable é uma implementação da interface Map e portanto realiza o mapeamento entre uma chave e um valor, não pode possuir
            chaves duplicadas e cada chave faz o mapeamento de apenas um valor.
            O HashTable é sincronizado e não aceita o uso de objetos nulos como chave ou valor.
+
            Para armazenar e recuperar mapeamentos de forma eficiente é necessário que seja implementado adequadamento o hashCode
            e o equals dos objetos utilizados como chave. Objetos que sejam iguais segundo o equals devem obrigatoriamente
            possuir o mesmo hash. Principalmente em grandes HashTables o ideal é que os hashcodes agrupem as chaves em bucktes da forma mais
            balanceada possível e com o maior número de buckets possível, assim ao consultar por uma chave o hashcode do objeto é
            verificado e o espaço de busca é reduzido.

            Portanto o HashTable deve ser utilizado em aplicações com mútiplas threads a fim de garantir a sincronização dos acessos
            das threads. Caso contrário é indicado o uso da classe HashMap que não é sincronizado e portanto possui melhor performance.
         */

        Map<String, String> stateCapitalsMap = new Hashtable<>();

        stateCapitalsMap.put("Espírito Santo", "Vitória");
        stateCapitalsMap.put("Paraná", "Curitiba");
        stateCapitalsMap.put("Tocantins", "Palmas");
        stateCapitalsMap.put("Bahia", "Salvador");
        stateCapitalsMap.put("Pernambuco", "Recife");

        System.out.println("A capital da Tocantins é " + stateCapitalsMap.get("Tocantins"));

    }

}
