package com.db1.plataforma.questao4;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalArithmeticOps {

    public static void main(String[] args) {

        BigDecimal productPrice = new BigDecimal("49.792");
        int productQuantity = 5;
        BigDecimal discountRate = new BigDecimal("0.112");
        BigDecimal taxRate = new BigDecimal("0.524");
        int paymentPortion = 3;

        //Calcula o total utilizando 16 casas de precisão e o método de arredondamento UP
        //Neste método o arredondamento do dígito menos signiticativo será sempre em direção oposta ao zero
        MathContext mathContext = new MathContext(16, RoundingMode.UP);
        calculateTotal(productPrice, productQuantity, discountRate, taxRate, paymentPortion, mathContext);

        //Calcula o total utilizando 16 casas de precisão e o método de arredondamento DOWN
        //Neste método o arredondamento do dígito menos signiticativo será sempre em direção ao zero
        mathContext = new MathContext(16, RoundingMode.DOWN);
        calculateTotal(productPrice, productQuantity, discountRate, taxRate, paymentPortion, mathContext);

        //Calcula o total utilizando 16 casas de precisão e o método de arredondamento CEILING
        //Neste método o arredondamento do dígito menos signiticativo será sempre em direção ao positivo
        mathContext = new MathContext(16, RoundingMode.CEILING);
        calculateTotal(productPrice, productQuantity, discountRate, taxRate, paymentPortion, mathContext);

        //Calcula o total utilizando 16 casas de precisão e o método de arredondamento FLOOR
        //Neste método o arredondamento do dígito menos signiticativo será sempre em direção ao negativo
        mathContext = new MathContext(16, RoundingMode.FLOOR);
        calculateTotal(productPrice, productQuantity, discountRate, taxRate, paymentPortion, mathContext);

        //Calcula o total utilizando 16 casas de precisão e o método de arredondamento HALF_UP
        //Neste método o arredondamento do dígito menos signiticativo será sempre em direção ao seu vizinho
        //mais próximo, caso a distância seja a mesma o arredondamento é feito para cima.
        mathContext = new MathContext(16, RoundingMode.HALF_UP);
        calculateTotal(productPrice, productQuantity, discountRate, taxRate, paymentPortion, mathContext);

        //Calcula o total utilizando 16 casas de precisão e o método de arredondamento HALF_DOWN
        //Neste método o arredondamento do dígito menos signiticativo será sempre em direção ao seu vizinho
        //mais próximo, caso a distância seja a mesma o arredondamento é feito para baixo.
        mathContext = new MathContext(16, RoundingMode.HALF_DOWN);
        calculateTotal(productPrice, productQuantity, discountRate, taxRate, paymentPortion, mathContext);

        //Calcula o total utilizando 34 casas de precisão e o método de arredondamento HALF_EVEN
        //Neste método o arredondamento do dígito menos signiticativo será sempre em direção ao seu vizinho
        //mais próximo, caso a distância seja a mesma o arredondamento é feito para o vizinho que seja par.
        //Este método é usado quando pretende-se minimizar as perdas com os processos de arredondamento, pois haverá
        //um balanceamento no caso em que o dígito a ser arredondado possua a mesma distância em relação aos vizinhos,
        //em alguns momentos será para mais e em outros para menos, ao contraŕio do HALF_UP, por exemplo, que sempre seria para mais.
        //No caso do HALF_EVEN podemos utilizar alguns contextos pre-definidos como o MathContext.DECIMAL128 que
        //utiliza 34 casas de precisão e o método de arredondamento HALF_EVEN.
        calculateTotal(productPrice, productQuantity, discountRate, taxRate, paymentPortion, MathContext.DECIMAL128);

        bigDecimalPowExample(productPrice);

    }

    public static void calculateTotal(BigDecimal productPrice, int productQuantity, BigDecimal discountRate, BigDecimal taxRate, int paymentPortion, MathContext mathContext) {
        BigDecimal amount = productPrice.multiply(BigDecimal.valueOf(productQuantity), mathContext);
        BigDecimal discountAmount = amount.multiply(discountRate, mathContext);
        BigDecimal amountDiscounted = amount.subtract(discountAmount, mathContext);
        BigDecimal taxAmount = amountDiscounted.multiply(taxRate, mathContext);
        BigDecimal total = amountDiscounted.add(taxAmount, mathContext);
        BigDecimal portionValue = total.divide(BigDecimal.valueOf(paymentPortion), mathContext);

        System.out.println("\nPrecision: " + mathContext.getPrecision() + " RoundingMode: " + mathContext.getRoundingMode());
        System.out.println("Total sem arredondamento: " + total);
        System.out.println("Total arredondando para duas casas decimais: " + total.setScale(2, mathContext.getRoundingMode()));
        System.out.println("Valor da parcela: " + portionValue.setScale(2, mathContext.getRoundingMode()));
    }

    public static void bigDecimalPowExample(BigDecimal decimalValue) {
        //Para calcular a potência de um BigDecimal basta executar o método pow passando como parâmetro o valor da potência
        //e a precisão e método de arredondamento atraves de um MathContext.
        BigDecimal powValue = decimalValue.pow(4, new MathContext(16, RoundingMode.HALF_UP));
        System.out.println("\nValor " + decimalValue + " elevado à potência de 4: " + powValue);
    }

}
