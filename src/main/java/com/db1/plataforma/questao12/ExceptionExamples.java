package com.db1.plataforma.questao12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExceptionExamples {

    public static void main(String[] args) {

        //Exemplo de ArithmeticException
        //Lançada quando o erro aritmético ocorre
        try {
            int a = 5;
            int b = 0;
            double division = a/b;
        } catch (ArithmeticException e) {
            System.out.println("Exceção ArithmeticException lançada: " + e.getMessage());
        }


        //Exemplo de ArrayIndexOutOfBoundsException
        //Lançado quando um array foi acessado com um índice inválido
        try {
            String[] names = new String[3];
            names[5] = "Carlos";
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exceção ArrayIndexOutOfBoundsException lançada: " + e.getMessage());
        }


        //Exemplo de ClassNotFoundException
        //Lançada quando a aplicação tenta acessar uma classe que não pode ser localizada
        try {
            Class.forName("ClasseDesconhecida");
        } catch (ClassNotFoundException e) {
            System.out.println("Exceção ClassNotFoundException lançada: " + e.getMessage());
        }


        //Exemplo de IOException
        //Exceção lançada quando ocorrem problemas de I/O. Esta é uma classe genérica para exceções produzidas por falhas ou interrupções de operações de I/O.
        FileWriter filewriter;
        try {
            File file = new File("teste.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (IOException e) {
            //Irá capturar qualquer exceção produzida por falhas de I/O
            System.out.println("Exceção IOException lançada: " + e.getMessage());
        }


        //Exemplo de IllegalArgumentException
        //Lançado quando um argumento incorreto foi passado para um método
        try {
            String numberInString = numberInString(4);
        } catch (IllegalArgumentException e) {
            System.out.println("Exceção IllegalArgumentException lançada: " + e.getMessage());
        }


        //Exemplo de NullPointerException
        //Lançado quando um objeto é acessado mas seu valor é nulo
        try {
            Map<String, String> map = new HashMap<>();
            map.get("MyKey").length();
        } catch (NullPointerException e) {
            System.out.println("Exceção NullPointerException lançada: " + e.getMessage());
        }


        //Exemplo de InterruptedException
        //Lançada quando uma thread ainda em execução é interrompida
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.interrupt();

    }

    public static String numberInString(int number) throws IllegalArgumentException {
        int maxNumber = 3;
        if (number > maxNumber) {
            throw new IllegalArgumentException(String.format("O número [%d] ultrapssa o limite permitido [%d].", number, maxNumber));
        }

        switch (number) {
            case 1:
                return "Um";
            case 2:
                return "Dois";
            case 3:
                return "Três";
        }

        return null;
    }

}
