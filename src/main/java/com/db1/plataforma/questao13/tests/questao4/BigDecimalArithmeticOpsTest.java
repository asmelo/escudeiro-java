package com.db1.plataforma.questao13.tests.questao4;

import com.db1.plataforma.questao4.BigDecimalArithmeticOps;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.math.MathContext;

import static org.junit.jupiter.api.Assertions.*;

class BigDecimalArithmeticOpsTest {

    private final PrintStream printStream = System.out;
    private final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(byteArrayOutputStream));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(printStream);
    }

    @Test
    public void should_calculate_total() {
        BigDecimal productPrice = new BigDecimal("49.792");
        int productQuantity = 5;
        BigDecimal discountRate = new BigDecimal("0.112");
        BigDecimal taxRate = new BigDecimal("0.524");
        int paymentPortion = 3;

        BigDecimalArithmeticOps.calculateTotal(productPrice, productQuantity, discountRate, taxRate, paymentPortion, MathContext.DECIMAL32);

        String expected = "Precision: 7 RoundingMode: HALF_EVEN\n" +
                "Total sem arredondamento: 336.9206\n" +
                "Total arredondando para duas casas decimais: 336.92\n" +
                "Valor da parcela: 112.31"
;
        assertEquals(expected, byteArrayOutputStream.toString().trim());
    }

    @Test
    public void should_calculate_pow() {
        BigDecimalArithmeticOps.bigDecimalPowExample(new BigDecimal(0.5d));

        String expected = "Valor 0.5 elevado à potência de 4: 0.0625";
        assertEquals(expected, byteArrayOutputStream.toString().trim());
    }

}