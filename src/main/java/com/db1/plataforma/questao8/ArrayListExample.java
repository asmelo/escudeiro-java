package com.db1.plataforma.questao8;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class ArrayListExample {

    public static void main(String[] args) {
        //Por implementar a interface List o ArrayList permite a duplicação de elementos e provê um controle preciso
        //da posição em que os elementos são inseridos, alterados e consultados. O ArrayList possui ótima performance (O(1))
        //para consulta dos elementos através do método get().

        //O ArrayList é muito similar ao Vector pois ambos implementam a interface List a diferença entre eles é que
        //o ArrayList não é sincronizado, portanto em aplicações com uma única thread é preferível o uso do ArrayList
        //uma vez que é mais eficiente que o Vector que por sua vez necessita de mais processamento a fim de sincronizar
        //seus objetos.
        //Outra diferença entre o ArrayList e o Vector é a forma como são dinamicamente aumentados ou diminuidos de tamanho
        //a fim de otimizar o uso de espaço de memória. No caso do ArrayList é feito um acréscimo de 50% em relação ao seu
        //tamanho atual, enquanto que o Vector realiza um acréscimo de 100%. A depender da circunstância o Vector poderá
        //ser mais eficiente uma vez que o ArrayList poderá gastar mais processamento com as operações de ajuste dinâmico
        //do seu tamanho.

        //Exemplos de uso do ArrayList.

        List<String> walletBanknotes = new ArrayList<>();

        walletBanknotes.add("2 reais");
        walletBanknotes.add("2  reais");
        walletBanknotes.add("10  reais");
        walletBanknotes.add("20  reais");
        walletBanknotes.add("50  reais");
        walletBanknotes.add("50  reais");

        StringJoiner stringJoiner = new StringJoiner(", ", "[", "]");

        walletBanknotes.forEach(stringJoiner::add);

        //Ao listar os elementos do ArrayList podemos verificar a duplicação dos elementos é permitida.
        System.out.println("Notas presentes na carteira: " + stringJoiner.toString());

    }

}
