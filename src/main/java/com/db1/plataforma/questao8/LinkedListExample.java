package com.db1.plataforma.questao8;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        /*
            LinkedList implementa a interface List através de uma lista duplamente "linkada", cada elemento possui uma referência para
            o elemento anterior e outra referência para o elemento seguinte.
            Esta forma de implementação diferenciada em relação ao ArrayList resulta em performances distintas nas operações de
            inserção, exclusão e consulta. As operações de inserção e exclusão de um item são mais rápidas no LinkedList porque
            não há necessidade de redimensionar um array ou atualizar o todos os índices quando um elemento é adicionando em uma posição
            arbitrária dentro da coleção, apenas as referências dos dois elementos vizinhos serão modificados. Já na operação de consulta
            o LinkedList é mais lento pois oferece um custo de O(n) enquanto o ArrayList custa apenas O(1).

            Sendo assim o uso do LinkedList deve ser considerado quando a performance é muito importante e existem muitos operações
            de inserção e exclusão e poucas operações de consulta.
         */

        //Exemplo de uso da classe LinkedList

        LinkedList<String> carRaceResults = new LinkedList<>();

        carRaceResults.add("Michael Schumacher");
        carRaceResults.add("Lewis Hamilton");
        carRaceResults.add("Alain Prost");
        carRaceResults.add("Fernando Alonso");

        carRaceResults.addFirst("Ayrton Senna");
        carRaceResults.addLast("Rubens Barrichello");

        System.out.println("Resultado da corrida de Formula 1");
        printCarRaceResult(carRaceResults);

        carRaceResults.removeFirst();
        carRaceResults.removeLast();
        System.out.println("\nResultado da corrida sem Brasileiros");
        printCarRaceResult(carRaceResults);

    }

    private static void printCarRaceResult(LinkedList<String> carRaceResults) {
        for (int i = 0; i < carRaceResults.size(); i++) {
            int position = i + 1;
            System.out.println(position + " - " + carRaceResults.get(i));
        }
    }

}
