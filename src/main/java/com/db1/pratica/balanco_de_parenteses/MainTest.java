package com.db1.pratica.balanco_de_parenteses;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

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


    private static final String[] ENTRIES = {"a+(b*c)-2-a", "(a+b*(2-c)-2+a)*2", "(a*b-(2+c) 2*(3-a))", ")3+b*(2-c)("};

    @Test
    public void should_get_special_order() throws IOException {
        Main.main(ENTRIES);
        String expected = "correct\n" +
                "correct\n" +
                "correct\n" +
                "incorrect";
        assertEquals(expected, byteArrayOutputStream.toString().trim());
    }

}
