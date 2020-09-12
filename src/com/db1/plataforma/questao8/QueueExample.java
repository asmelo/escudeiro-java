package com.db1.plataforma.questao8;

import java.util.LinkedList;
import java.util.Objects;

public class QueueExample {

    public static void main(String[] args) {

        /*
            Em geral as implementações da interface Queue funcionam como filas, nós apenas podemos adicionar novos elementos no
            final da fila e apenas podemos remover o primeiro elemento da fila, seria o padrão FIFO. Contudo nem todas as implementações
            seguem esse padrão como é o caso da PriorityQueue.
         */

        //Exemplo de uso dos métodos declarados na interface Queue

        LinkedList<String> supermarketQueue = new LinkedList<>();

        supermarketQueue.offer("Paulo");
        supermarketQueue.offer("Carla");
        supermarketQueue.offer("João");
        supermarketQueue.offer("Fernando");
        supermarketQueue.offer("Cristina");

        System.out.println("\nFila do supermecado: ");
        printQueue(supermarketQueue);

        supermarketQueue.poll();
        System.out.println("\nFila do supermercado após a saída da primeira pessoa: ");
        printQueue(supermarketQueue);

        System.out.println("\nO primeiro da fila agora é " + supermarketQueue.peek());

        supermarketQueue.poll();
        supermarketQueue.poll();
        supermarketQueue.poll();
        supermarketQueue.poll();

        if (Objects.isNull(supermarketQueue.peek())) {
            System.out.println("\nA fila está vazia");
        }

    }

    private static void printQueue(LinkedList<String> queue) {
        for (int i = 0; i < queue.size(); i++) {
            int position = i + 1;
            System.out.println(position + " - " + queue.get(i));
        }
    }

}
