package com.db1.plataforma.questao8;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        //Exemplo do uso da interface Set
        //Set é uma coleção que não possui elementos duplicados. A verificação de igualdade neste caso é feita com o método equals

        Set<String> soccerTeams = new HashSet<>();

        soccerTeams.add("Flamengo");
        soccerTeams.add("Vasco");
        soccerTeams.add("São Paulo");
        soccerTeams.add("Palmeiras");

        //Elementos sendo inseridos pela segunda vez
        soccerTeams.add("Flamengo");
        soccerTeams.add("Vasco");

        //Ao listar os elementos do "Set" percebemos que eles não foram duplicados
        System.out.println("Elementos do conjuto de times de futebol: " + soccerTeams);

    }

}
