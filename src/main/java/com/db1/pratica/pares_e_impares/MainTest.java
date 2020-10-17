package com.db1.pratica.pares_e_impares;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

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


    private String[] args = {"10", "6", "9", "2", "1", "0", "17", "44", "65", "79", "11"};

    @Test
    public void should_separate_even_values() {
        List<Long> evenList = new ArrayList<>();
        List<Long> oddList = new ArrayList<>();

        Main.separateEvenAndOdds(args, 10, evenList, oddList);

        List<Long> expectedEvenList = Arrays.asList(10l, 6l, 2l, 0l, 44l);
        assertEquals(expectedEvenList, evenList);
    }

    @Test
    public void should_separate_odd_values() {
        List<Long> evenList = new ArrayList<>();
        List<Long> oddList = new ArrayList<>();

        Main.separateEvenAndOdds(args, 10, evenList, oddList);

        List<Long> expectedOddList = Arrays.asList(9l, 1l, 17l, 65l, 79l, 11l);
        assertEquals(expectedOddList, oddList);
    }

    @Test
    public void should_validade_main_with_arguments() throws IOException {
        Main.main(args);

        String expected = "0\n" +
                "2\n" +
                "6\n" +
                "10\n" +
                "44\n" +
                "79\n" +
                "65\n" +
                "17\n" +
                "11\n" +
                "9\n" +
                "1";
        assertEquals(expected, byteArrayOutputStream.toString().trim());
    }

    @Test
    public void should_validade_main_with_no_arguments() throws IOException {
        Main.main(new String[0]);

        String expected = "Entrada vazia";
        assertEquals(expected, byteArrayOutputStream.toString().trim());
    }

}
