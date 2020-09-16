package com.db1.plataforma.questao4;

import java.math.BigDecimal;

public class BigDecimalFromString {

    public static void main(String[] args) {
        String ProductValueString = "49.99";
        BigDecimal productValue = new BigDecimal(ProductValueString);

        System.out.println("Valor do produto: " + productValue);
    }

}
