package com.db1.pratica.balanco_de_parenteses.service;

import com.db1.pratica.balanco_de_parenteses.domain.Expression;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExpressionService {

    private List<Expression> expressions = new ArrayList<>();

    public ExpressionService() {
    }

    public ExpressionService(String[] entries) {
        for (String entry : entries) {
            addExpression(entry);
        }
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    public void addExpression(String entry) {
        Expression expression = new Expression(entry);
        this.expressions.add(expression);
    }

    public void createFileWithValidations(String fileName) throws IOException {
        List<String> validations = validateParenthesesPositions();

        FileService fileService = getFileService(fileName);
        fileService.writeInFile(validations);
    }

    public FileService getFileService(String fileName) throws IOException {
        return new FileService(fileName);
    }

    public List<String> validateParenthesesPositions() {
        checkEmptyList();

        return expressions.stream()
                .map(Expression::hasValidParenthesesPositions)
                .map(this::booleanToText)
                .collect(Collectors.toList());
    }

    private String booleanToText(boolean value) {
        if (Boolean.TRUE.equals(value)) {
            return "correct";
        }
        return "incorrect";
    }

    private void checkEmptyList() {
        if (expressions.size() == 0) {
            System.out.println("A lista de expressões está vazia");
        }
    }

}
