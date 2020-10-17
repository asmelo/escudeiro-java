package com.db1.pratica.balanco_de_parenteses;

import com.db1.pratica.balanco_de_parenteses.service.ExpressionService;

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
        //Exemplo de parâmetros de entrada: a+(b*c)-2-a (a+b*(2-c)-2+a)*2 (a*b-(2+c) 2*(3-a)) )3+b*(2-c)(

        ExpressionService expressionService = new ExpressionService(args);
        expressionService.createFileWithValidations("resultado.txt");
    }

}
