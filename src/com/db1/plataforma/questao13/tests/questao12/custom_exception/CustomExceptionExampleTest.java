package com.db1.plataforma.questao13.tests.questao12.custom_exception;

import com.db1.plataforma.questao12.custom_exception.CustomExceptionExample;
import com.db1.plataforma.questao12.custom_exception.InvalidCardException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CustomExceptionExampleTest {

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

    @ParameterizedTest
    @ValueSource(strings = {"paus", "espada", "ouro", "copas", "PAUS", "ESPADA", "OURO", "COPAS", "Paus", "Espada", "Ouro", "Copas"})
    public void should_validate_suit_successfully(String suit) throws InvalidCardException {
        CustomExceptionExample.validateSuit(suit);
        assertEquals("O naipe informado é válido", byteArrayOutputStream.toString().trim());
    }

    @ParameterizedTest
    @ValueSource(strings = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "j", "q", "k", "J", "Q", "K"})
    public void should_validate_card_value_successfully(String value) throws InvalidCardException {
        CustomExceptionExample.validateCardValue(value);
        assertEquals("O valor informado é válido", byteArrayOutputStream.toString().trim());
    }

    @ParameterizedTest
    @ValueSource(strings = {"pals", "epada", "gold", "cops"})
    public void should_throw_exception_in_validate_suit(String suit) throws InvalidCardException {
        assertThrows(InvalidCardException.class, () -> CustomExceptionExample.validateSuit(suit));
    }

    @ParameterizedTest
    @ValueSource(strings = {"a", "b", "c", "11", "12", "13"})
    public void should_throw_exception_in_validate_card_value(String suit) throws InvalidCardException {
        assertThrows(InvalidCardException.class, () -> CustomExceptionExample.validateSuit(suit));
    }

}