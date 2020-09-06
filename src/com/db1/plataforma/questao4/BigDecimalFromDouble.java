package com.db1.plataforma.questao4;

import java.math.BigDecimal;

public class BigDecimalFromDouble {

    public static void main(String[] args) {
        Double productValueDouble = 49.99d;

        //Convertendo um double para um BigDecimal através do seu construtor é feita uma conversão exata e ṕortanto
        //o valor 49.99000000000000198951966012828052043914794921875 é obtido.
        //Isso ocorre pois o double não possui uma representação precisa do 49.99d
        BigDecimal productValue = new BigDecimal(productValueDouble);
        System.out.println("Valor do produto: " + productValue); // Imprime "Valor do produto: 49.99000000000000198951966012828052043914794921875"

        //Portanto é recomendável fazer a conversão utilizando o construtor do BigDecimal passando uma string como parâmetro.
        //Outra alternativa é utilizar o método valueOf da classe BigDecimal que internamente converte o valor double em
        //String antes de converter em BigDecimal.
        BigDecimal productValueTwo = BigDecimal.valueOf(productValueDouble);
        System.out.println("Valor do produto: " + productValueTwo); // Imprime "Valor do produto: 49.99"
    }

}
