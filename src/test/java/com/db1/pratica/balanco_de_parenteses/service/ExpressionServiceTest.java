package com.db1.pratica.balanco_de_parenteses.service;

import com.db1.pratica.balanco_de_parenteses.domain.Expression;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExpressionServiceTest {
    private static final String[] ENTRIES = {"a+(b*c)-2-a", "(a+b*(2-c)-2+a)*2", "(a*b-(2+c) 2*(3-a))", ")3+b*(2-c)("};
    public static final String ENTRY = "(a+a)8(b+b)";

    ExpressionService expressionService = new ExpressionService(ENTRIES);

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
    public void should_add_expression() {
        expressionService.addExpression(ENTRY);
        List<Expression> expressions = expressionService.getExpressions();
        assertTrue(expressions.contains(new Expression(ENTRY)));
    }

    @Test
    public void should_validate_parentheses_positions() {
        List<String> validations = expressionService.validateParenthesesPositions();
        List<String> expected = Arrays.asList("correct", "correct", "correct", "incorrect");
        assertEquals(expected, validations);
    }

    @Test
    public void should_create_file_with_validations() throws IOException {
        expressionService.createFileWithValidations("resultado.txt");
        String expected = "correct\n" +
                "correct\n" +
                "correct\n" +
                "incorrect";
        assertEquals(expected, byteArrayOutputStream.toString().trim());
    }

    @Test
    public void should_throw_exception_in_create_file() {
        assertThrows(IOException.class,
                () -> expressionService.createFileWithValidations(""));
    }

    @Test
    public void should_check_empty_list() throws IOException {
        ExpressionService expressionService = new ExpressionService();
        expressionService.createFileWithValidations("resultado.txt");
        String expected = "A lista de expressões está vazia";
        assertEquals(expected, byteArrayOutputStream.toString().trim());
    }
}