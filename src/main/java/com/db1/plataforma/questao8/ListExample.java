package com.db1.plataforma.questao8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        //Ao contrário da interface Set a interface List permite a duplicação de elementos.
        //A List é utilizada para coleções ordenadas. O uso dessa interface provê um controle preciso da posição em
        //que os elementos são inseridos, alterados e consultados.

        //Exemplos de uso dos métodos declarados na interface List

        List<String> everydayVisitedNeighborhood = Arrays.asList("Bairro onde almoça", "Bairro onde janta");
        List<String> visitedNeighborhood = new ArrayList<>();
        visitedNeighborhood.add("Bairro onde mora");

        visitedNeighborhood.addAll(1, everydayVisitedNeighborhood);

        //Atendimentos do taxista antes do almoço
        visitedNeighborhood.add(1,"Bairro A");
        visitedNeighborhood.add(2,"Bairro B");
        visitedNeighborhood.add(3,"Bairro C");

        //Atendimentos do taxista depois do almoço
        visitedNeighborhood.add(5,"Bairro A");
        visitedNeighborhood.add(6,"Bairro D");

        //Atendimentos do taxista depois da janta
        visitedNeighborhood.add(8,"Bairro C");

        //Ao listar os elementos da "List" podemos verificar a duplicação dos elementos é permitida.
        //Verificamos também está de acordo com os índices definidos no momento da inserção
        System.out.println("Bairros visitados pelo taxista: " + visitedNeighborhood);

        visitedNeighborhood.set(2, "Bairro corrigido");
        System.out.println("Lista corrigida dos bairros visitados pelo taxista: " + visitedNeighborhood);

        System.out.println("O terceiro bairro visitado pelo taxista foi: " + visitedNeighborhood.get(2));
        System.out.println("O \"Bairro onde almoça\" possui índice " + visitedNeighborhood.indexOf("Bairro onde almoça") + " na lista de bairros visitados");
        System.out.println("A última visita ao \"Bairro C\" possui índice " + visitedNeighborhood.lastIndexOf("Bairro C") + " na lista de bairros visitados");

    }

}
