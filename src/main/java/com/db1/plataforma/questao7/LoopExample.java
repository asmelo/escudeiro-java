package com.db1.plataforma.questao7;

import javax.swing.plaf.IconUIResource;
import java.lang.reflect.Array;
import java.util.*;

public class LoopExample {

    public static void main(String[] args) {
        //Exemplo do for
        String[] names = {"Arnaldo", "Priscila", "Jonas", "Marta"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(String.format("Na posição %d está o nome %s", i, names[i]));
        }

        //Exemplo do enhanced for
        String[] mainTeams = {"Flamento", "São Paulo", "Vasco", "Palmeiras", "Corinthians"};
        StringJoiner stringJoiner = new StringJoiner(", ", "[", "]");
        for (String team : mainTeams) {
            stringJoiner.add(String.valueOf(team));
        }
        System.out.println("\nO principais times são: " + stringJoiner.toString());


        //Exemplo do while
        List<Integer> numbers = new ArrayList<>();

        numbers.add(4);
        numbers.add(1);
        numbers.add(7);
        numbers.add(2);
        numbers.add(9);
        numbers.add(1);
        numbers.add(5);

        Collections.sort(numbers);

        int count = 0;
        Integer value = numbers.get(count);
        System.out.println();
        while (value < 5 && count < numbers.size()) {
            System.out.println("Valor menor que 5 encontrado: " + numbers.get(count));
            value = numbers.get(++count);
        }

        //Exemplo do do/while
        Random random = new Random();
        int randomInt = random.nextInt(20);
        System.out.println();
        do {
            System.out.println("Número sorteado: " + randomInt);
            randomInt = random.nextInt(20);
        } while (randomInt < 15);

        //Exemplo do forEach do Interable
        stringJoiner = new StringJoiner(", ", "[", "]");
        List<String> cars = Arrays.asList("Gol", "Ka", "Sentra", "Siena", "Golf");
        cars.forEach(stringJoiner::add);
        System.out.println("\nLista de carros: " + stringJoiner.toString());

    }

}
