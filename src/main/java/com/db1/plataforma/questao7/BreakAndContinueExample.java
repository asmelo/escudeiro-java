package com.db1.plataforma.questao7;

import java.util.Scanner;

public class BreakAndContinueExample {

    public static void main(String[] args) {

        //Exemplo de uso do break
        //Neste exemplo temos um laço cuja expressão lógica é sempre verdadeira, para finalizar o laço é utilizando
        //o comando break que força a interrupção do laço, independente da expressão lógica.
        Double number, sum = 0.0;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Digite um número para ser somado. Para finalizar digite 0.: ");
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
