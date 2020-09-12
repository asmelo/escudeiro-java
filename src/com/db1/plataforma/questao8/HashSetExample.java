package com.db1.plataforma.questao8;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {

        //O HashSet implementa a interface Set que é uma coleção que não possui elementos duplicados. A verificação de igualdade neste caso é feita com o método equals.
        //O HashSet implementa o Set utilizando uma tabela hash portanto não garante a ordenação dos elementos mas com isso oferece uma performance constante (O(1)) na execução dos
        // métodos add, remove, contains e size.
        //O hashSet não garante a sincronização dos acessos portanto caso seja utilizado com multi threads os acessos devem ser sincronizados externamente através de outro objeto.

        //Portanto devemos usar o HashSet quando não puder existir elementos duplicados, quando a ordenação dos elementos não importar e quando uma alta performace na manipulação
        //dos elementos seja importante.

        Set<String> soccerTeams = new HashSet<>();

        //Times inseridos em ordem alfabética
        soccerTeams.add("Flamengo");
        soccerTeams.add("Palmeiras");
        soccerTeams.add("São Paulo");
        soccerTeams.add("Vasco");

        //Elementos sendo inseridos pela segunda vez
        soccerTeams.add("Flamengo");
        soccerTeams.add("Vasco");

        //Ao listar os elementos do "Set" percebemos que eles não foram duplicados
        //Percebemos também que NÃO foi preservada a ordem que os elementos foram inseridos
        System.out.println("Elementos do conjuto de times de futebol: " + soccerTeams);

    }

}
