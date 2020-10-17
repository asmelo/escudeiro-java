package com.db1.pratica.balanco_de_parenteses;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

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
    public void should_throw_exception_in_create_file() {
        assertThrows(IOException.class, () -> Main.createFile(""));
    }

    @Test
    public void should_create_file() throws IOException {
        FileWriter fileWriter = Main.createFile("arquivoTeste.txt");
        assertNotNull(fileWriter);
    }

    @ParameterizedTest
    @ValueSource(strings = {"a+(b*c)-2-a", "(a+b*(2-c)-2+a)*2"})
    public void should_validate_parentheses_position_successfully(String expression) {
        boolean valid = Main.validateParenthesesPositions(expression);
        assertTrue(valid);
    }

    @ParameterizedTest
    @ValueSource(strings = {"(a*b-(2+c)", "2*(3-a))", ")3+b*(2-c)("})
    public void should_fail_in_validate_parentheses_position(String expression) {
        boolean valid = Main.validateParenthesesPositions(expression);
        assertFalse(valid);
    }

    @Test
    public void should_validate_parentheses_position_successfully_for_a_expression_array() throws IOException {
        String[] expressions = {"a+(b*c)-2-a", "(a+b*(2-c)-2+a)*2", "(a*b-(2+c)", "2*(3-a))", ")3+b*(2-c)("};
        Main.validateParenthesesPositions(expressions);

        String expected = "correct\n" +
                "correct\n" +
                "incorrect\n" +
                "incorrect\n" +
                "incorrect";
        assertEquals(expected, byteArrayOutputStream.toString().trim());
    }

    @Test
    public void should_validade_main_with_no_arguments() throws IOException {
        Main.main(new String[0]);

        String expected = "correct\n" +
                "correct\n" +
                "incorrect\n" +
                "incorrect\n" +
                "incorrect";
        assertEquals(expected, byteArrayOutputStream.toString().trim());
    }

    @Test
    public void should_validade_main_with_arguments() throws IOException {
        String[] expressions = {"a+(b*c)-2-a", "(a+b*(2-c)-2+a)*2", "(a*b-(2+c)", "2*(3-a))", ")3+b*(2-c)("};
        Main.main(expressions);

        String expected = "correct\n" +
                "correct\n" +
                "incorrect\n" +
                "incorrect\n" +
                "incorrect";
        assertEquals(expected, byteArrayOutputStream.toString().trim());
    }

}