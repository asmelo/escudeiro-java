package com.db1.plataforma.questao10;

import java.util.List;

public class MethodWithoutArgumentsAndReturnValueExample {

    public static void main(String[] args) {
        OutSystem outSystem = new OutSystem();

        List<String> names = List.of("Carlos", "Maria", "Pedro", "Cristina");
        List<Integer> numbers = List.of(2, 4, 7, 10);

        outSystem.printList(names);
        outSystem.printLine();
        outSystem.printList(numbers);

    }

    public static class OutSystem {

        //Exemplo de método que não possui argumentos e também não retorna valor algum.
        public void printLine() {
            System.out.println("===========================================");
        }

        public void printList(List list) {
            System.out.println(list);
        }

    }

}
