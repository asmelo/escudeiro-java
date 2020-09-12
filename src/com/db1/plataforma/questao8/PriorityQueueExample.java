package com.db1.plataforma.questao8;

import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {

        /*
            A classe PriorityQueue implementa a interface Queue, contudo possui um comportamento diferente do FIFO.
            Quando um elemento é inserido na coleção este é ordenado automaticamente de acordo com sua ordenação
            natural (implementando a interface Comparable) ou pelo Comparator definido na sua construção.
            A Implementação da PriorityQueue não é sincronizada.
         */

        PriorityQueue<Integer> drawnNumber = new PriorityQueue<>();

        drawnNumber.add(5);
        drawnNumber.add(1);
        drawnNumber.add(8);
        drawnNumber.add(3);

        /*
            Ao listar os itens da coleção podemos verificar que os números foram ordenados de acordo com o método compareTo
            da classe Integer, a ordem que os elementos foram inseridos foi desconsiderada.,
         */
        System.out.println(drawnNumber);

        System.out.println("O primeiro elemento da fila também segue a ordenção natural: " + drawnNumber.peek());

    }

}
