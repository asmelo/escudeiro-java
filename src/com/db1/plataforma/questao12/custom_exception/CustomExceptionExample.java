package com.db1.plataforma.questao12.custom_exception;

import java.util.List;
import java.util.Scanner;

public class CustomExceptionExample {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);

            System.out.println("Jogue uma carta do seu baralho: ");

            System.out.println("\nNaipe da carta: ");
            String suit = input.next();
            validateSuit(suit);

            System.out.println("\nValor da carta: ");
            String value = input.next();
            validateCardValue(value);

            System.out.println("\nA carta informada é válida");
        } catch (InvalidCardException e) {
            System.out.println("Lançada Exceção customizada: " + e.getMessage());
        }
    }

    public static void validateSuit(String suit) throws InvalidCardException {
        List<String> validSuits = List.of("paus", "espada", "ouro", "copas");

        if (!validSuits.contains(suit.toLowerCase())) {
            throw new InvalidCardException("Naipe inválido");
        }

        System.out.println("O naipe informado é válido");
    }

    public static void validateCardValue(String value) throws InvalidCardException {
        List<String> validCardValues = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "j", "q", "k");

        if (!validCardValues.contains(value.toLowerCase())) {
            throw new InvalidCardException("Valor da carta inválido");
        }

        System.out.println("O valor informado é válido");
    }

}
