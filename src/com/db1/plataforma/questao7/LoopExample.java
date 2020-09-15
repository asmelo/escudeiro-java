package com.db1.plataforma.questao7;

import javax.swing.plaf.IconUIResource;
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
        List<String> cars = List.of("Gol", "Ka", "Sentra", "Siena", "Golf");
        cars.forEach(stringJoiner::add);
        System.out.println("\nLista de carros: " + stringJoiner.toString());


        //Exemplo de uso do break
        //Neste exemplo temos um laço cuja expressão lógica é sempre verdadeira, para finalizar o laço é utilizando
        //o comando break que força a interrupção do laço, independente da expressão lógica.
        Double number, sum = 0.0;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Digite um número paraa ser somado. Para finalizar digite 0.: ");
            number = input.nextDouble();
            if (number == 0) {
                break;
            }
            sum += number;
        }
        System.out.println("O resultado da soma é: " + sum);

        //Exemplo de uso do continue
        //No exemplo abaixo é feita uma contagem regressiva a partir de 10 onde são impressos apenas os números pares.
        //Para isso foi utilizado o comando "continue" que não finaliza a execução do laço mas interrompe a interação
        //no momento em que é executado. No exemplo caso seja um número ímpar a interação é interrompida impedindo
        //assim que o número seja impresso.
        System.out.println("\nContagem regressiva par: ");
        int counter=10;
        while (counter >=0)
        {
            if (counter % 2 != 0)
            {
                counter--;
                continue;
            }
            System.out.print(counter+" ");
            counter--;
        }

    }

}
