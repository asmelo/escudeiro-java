package com.db1.pratica.balanco_de_parenteses;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    /*
        Este problema foi selecionado pois pode-se aplicar o conhecimento adiquirido nos exercícios anteriores como laços de
        repetição com uso do continue e sobrecarga de métodos
     */

    /*
        Dada uma expressão qualquer com parênteses, indique se a quantidade de parênteses está correta ou não, sem levar em conta o restante da expressão. Por exemplo:

        a+(b*c)-2-a        está correto
        (a+b*(2-c)-2+a)*2  está correto

        enquanto

        (a*b-(2+c)         está incorreto
        2*(3-a))           está incorreto
        )3+b*(2-c)(        está incorreto

        Ou seja, tod o parênteses que fecha deve ter um outro parênteses que abre correspondente e não pode haver parênteses que fecha sem um prévio parenteses que abre e a quantidade total de parenteses que abre e fecha deve ser igual.

        Entrada
        Como entrada, haverá N expressões (1 <= N <= 10000), cada uma delas com até 1000 caracteres.

        Saída
        O arquivo de saída deverá ter a quantidade de linhas correspondente ao arquivo de entrada, cada uma delas contendo as palavras correct ou incorrect de acordo com as regras acima fornecidas.

        Exemplo de Entrada
        a+(b*c)-2-a
        (a+b*(2-c)-2+a)*2
        (a*b-(2+c)
        2*(3-a))
        )3+b*(2-c)(

        Exemplo de Saída
        correct
        correct
        incorrect
        incorrect
        incorrect
     */

    public static void main(String[] args) throws IOException {
        /*
        A judge solicita que a aplicação receba como parâmetro N expressões, contudo a fim de facilitar para banca de avaliação
        do Mestre dos Códigos a condicional abaixo cria exemplos de parâmetros de entrada caso estes não existam. Bastando apenas
        executar a aplicação para poder visualizar os resultados.
        */
        if (args.length == 0) {
            String[] expressions = {"a+(b*c)-2-a", "(a+b*(2-c)-2+a)*2", "(a*b-(2+c)", "2*(3-a))", ")3+b*(2-c)("};
            validateParenthesesPositions(expressions);
            return;
        }

        validateParenthesesPositions(args);
    }

    static void validateParenthesesPositions(String[] expressions) throws IOException {
        FileWriter fileWriter = createFile("resultado.txt");

        for (String expression : expressions) {
            boolean validExpression = validateParenthesesPositions(expression);

            if (validExpression) {
                printAndWriteInFile(fileWriter, "correct");
                continue;
            }

            printAndWriteInFile(fileWriter, "incorrect");
        }

        fileWriter.close();
    }

    private static void printAndWriteInFile(FileWriter fileWriter, String value) throws IOException {
        fileWriter.write(value);
        System.out.println(value);
    }

    static FileWriter createFile(String fileName) throws IOException {
        File file = new File(fileName);
        file.createNewFile();
        return new FileWriter(file);
    }

    static boolean validateParenthesesPositions(String expression) {
        int openParentheses = 0;

        String[] characters = expression.split("");

        for (String character : characters) {
            if (character.equals(")")) {
                if (openParentheses > 0) {
                    openParentheses--;
                    continue;
                }
                return false;
            }

            if (character.equals("(")) {
                openParentheses++;
            }
        }

        return openParentheses == 0;
    }

}
