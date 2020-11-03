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
    public void should_get_special_order() throws IOException {
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
}
