package com.db1.plataforma.questao9;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        /*
            O HashMap é uma implementação da interface Map e portanto realiza o mapeamento entre uma chave e um valor, não pode possuir
            chaves duplicadas e cada chave faz o mapeamento de apenas um valor.
            O HashMap não é sincronizado e aceita o uso de objetos nulos como chave ou valor.
+
            Para armazenar e recuperar mapeamentos de forma eficiente é necessário que seja implementado adequadamento o hashCode
            e o equals dos objetos utilizados como chave. Objetos que sejam iguais segundo o equals devem obrigatoriamente
            possuir o mesmo hash. Principalmente em grandes HashTables o ideal é que os hashcodes agrupem as chaves em bucktes da forma mais
            balanceada possível e com o maior número de buckets possível, assim ao consultar por uma chave o hashcode do objeto é
            verificado e o espaço de busca é reduzido.

            Portanto o HashMap deve ser utilizado quando for necessário o uso de objetos nulos e em aplicações com apenas uma thread,
            uma vez que o HashMap é não é sincronizado.
         */

        Map<String, String> stateCapitalsMap = new HashMap<>();

        stateCapitalsMap.put("Espírito Santo", "Vitória");
        stateCapitalsMap.put("Paraná", null);
        stateCapitalsMap.put("Tocantins", null);
        stateCapitalsMap.put("Bahia", "Salvador");
        stateCapitalsMap.put("Pernambuco", "Recife");
        stateCapitalsMap.put(null, "Distrito Federal");

        System.out.println("\nOs mapeamentos existentes são: ");
        stateCapitalsMap.entrySet().forEach(System.out::println);

        System.out.println("\nA chave nula aponta para " + stateCapitalsMap.get(null));
        System.out.println("O valor da chave \"Paraná\" é " + stateCapitalsMap.get("Paraná"));

    }

}
