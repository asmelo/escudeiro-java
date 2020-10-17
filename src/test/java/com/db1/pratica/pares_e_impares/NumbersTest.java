package com.db1.pratica.pares_e_impares;

import com.db1.pratica.pares_e_impares.domain.Numbers;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    private static String[] NUMBERS = {"10", "6", "9", "2", "1", "0", "17", "44", "65", "79", "11"};
    private static long NUMBER = 51l;

    private Numbers numbers = new Numbers(NUMBERS);

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
    public void should_check_existent_number() {
        assertTrue(numbers.hasNumber(10l));
    }

    @Test
    public void should_check_no_existent_number() {
        assertFalse(numbers.hasNumber(144l));
    }

    @Test
    public void should_add_number() {
        numbers.addNumber(NUMBER);
        assertTrue(numbers.hasNumber(NUMBER));
    }

    @Test
    public void should_get_special_order() {
        List<Long> specialOrderedNumbers = numbers.getSpecialOrder();
        List<Long> expected = Arrays.asList(0l, 2l, 6l, 10l, 44l, 79l, 65l, 17l, 11l, 9l, 1l);
        assertEquals(expected, specialOrderedNumbers);
    }

    @Test
    public void should_check_empty_list() {
        Numbers numbers = new Numbers();
        numbers.getSpecialOrder();
        String expected = "A lista de números está vazia";
        assertEquals(expected, byteArrayOutputStream.toString().trim());
    }

}