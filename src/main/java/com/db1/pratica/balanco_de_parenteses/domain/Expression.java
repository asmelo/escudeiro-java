package com.db1.pratica.balanco_de_parenteses.domain;

import java.util.Objects;

public class Expression {

    private static final String OPEN_PARENTHESES = ")";
    private static final String CLOSE_PARENTHESES = "(";

    private String content;

    public Expression(String content) {
        this.content = content;
    }

    public boolean hasValidParenthesesPositions() {
        int openParentheses = 0;

        String[] characters = getCharacters();

        for (String character : characters) {
            if (character.equals(OPEN_PARENTHESES)) {
                if (openParentheses > 0) {
                    openParentheses--;
                    continue;
                }
                return false;
            }

            if (character.equals(CLOSE_PARENTHESES)) {
                openParentheses++;
            }
        }

        return openParentheses == 0;
    }

    private String[] getCharacters() {
        return content.split("");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Expression that = (Expression) o;
        return Objects.equals(content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content);
    }
}
