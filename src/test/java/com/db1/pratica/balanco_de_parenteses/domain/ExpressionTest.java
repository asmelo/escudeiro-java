package com.db1.pratica.balanco_de_parenteses.domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ExpressionTest {

    public static final String ENTRY = "(a+a)8(b+b)";
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
    @ValueSource(strings = {"a+(b*c)-2-a", "(a+b*(2-c)-2+a)*2"})
    public void should_validate_parentheses_position_successfully(String entry) {
        Expression expression = new Expression(entry);
        boolean valid = expression.hasValidParenthesesPositions();
        assertTrue(valid);
    }

    @ParameterizedTest
    @ValueSource(strings = {"(a*b-(2+c)", "2*(3-a))", ")3+b*(2-c)("})
    public void should_fail_in_validate_parentheses_position(String entry) {
        Expression expression = new Expression(entry);
        boolean valid = expression.hasValidParenthesesPositions();
        assertFalse(valid);
    }

    @Test
    public void should_check_equals_expressions() {
        Expression expressionOne = new Expression(ENTRY);
        Expression expressionTwo = new Expression(ENTRY);

        assertTrue(expressionOne.equals(expressionTwo));
    }

    @Test
    public void should_equals_expressions_has_same_hashCode() {
        Expression expressionOne = new Expression(ENTRY);
        Expression expressionTwo = new Expression(ENTRY);

        assertTrue(expressionOne.hashCode() == expressionTwo.hashCode());
    }

}