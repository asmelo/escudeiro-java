package com.db1.plataforma.questao8;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        //Por implementar a interface List o Vector permite a duplicação de elementos e provê um controle preciso
        //da posição em que os elementos são inseridos, alterados e consultados.

        //O Vector é muito similar ao ArrayList pois ambos implementam a interface List a diferença entre eles é que
        //Vector é sincronizado, portanto em aplicações com múltiplas threads é indicado o uso do Vector.
        //Outra diferença entre o Vector e o ArrayList é a forma como são dinamicamente aumentados ou diminuidos de tamanho
        //a fim de otimizar o uso de espaço de memória. No caso do ArrayList é feito um acréscimo de 50% em relação ao seu
        //tamanho atual, enquanto que o Vector realiza um acréscimo de 100%. A depender da circunstância o Vector poderá
        //ser mais eficiente uma vez que o ArrayList poderá gastar mais processamento com as operações de ajuste dinâmico
        //do seu tamanho.

        //Exemplos de uso do Vector.

        List<String> walletBanknotes = new Vector<>();

        walletBanknotes.add("2 reais");
        walletBanknotes.add("2  reais");
        walletBanknotes.add("10  reais");
        walletBanknotes.add("20  reais");
        walletBanknotes.add("50  reais");
        walletBanknotes.add("50  reais");

        StringJoiner stringJoiner = new StringJoiner(", ", "[", "]");
        walletBanknotes.forEach(stringJoiner::add);

        //Ao listar os elementos do Vector podemos verificar que a duplicação dos elementos é permitida.
        System.out.println("Notas presentes na carteira: " + stringJoiner.toString());

    }

}
