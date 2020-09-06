package com.db1.plataforma.questao4;

import java.math.BigDecimal;

public class BigDecimalComparation {

    public static void main(String[] args) {
        BigDecimal firstValue = new BigDecimal("2.56");
        BigDecimal secondValue = new BigDecimal("3.43");

        if (firstValue.compareTo(secondValue) < 0) {
            System.out.println("O primeiro valor é menor que o segundo valor.");
        }

        if (firstValue.compareTo(secondValue) == 0) {
            System.out.println("O primeiro valor é igual ao segundo valor.");
        }

        if (firstValue.compareTo(secondValue) > 0) {
            System.out.println("O primeiro valor é maior que o segundo valor.");
        }
    }

}
