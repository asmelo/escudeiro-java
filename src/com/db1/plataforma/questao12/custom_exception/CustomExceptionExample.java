package com.db1.plataforma.questao12.custom_exception;

import java.util.List;
import java.util.Scanner;

public class CustomExceptionExample {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);

            System.out.println("Jogue uma carta do seu baralho: ");

            readSuit(input);
            readCardValue(input);

            System.out.println("A carta informada é válida");
        } catch (InvalidCardException e) {
            System.out.println("Lançada Exceção customizada: " + e.getMessage());
        }
    }

    public static void readSuit(Scanner input) throws InvalidCardException {
        List<String> validSuits = List.of("paus", "espada", "ouro", "copas");

        System.out.println("Naipe da carta: ");
        String suit = input.next();

        if (!validSuits.contains(suit.toLowerCase())) {
            throw new InvalidCardException("Naipe inválido");
        }
    }

    public static void readCardValue(Scanner input) throws InvalidCardException {
        List<String> validCardValues = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "j", "q", "k");

        System.out.println("Valor da carta: ");
        String value = input.next();

        if (!validCardValues.contains(value.toLowerCase())) {
            throw new InvalidCardException("Valor da carta inválido");
        }
    }

}
