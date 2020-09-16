package com.db1;

import java.util.StringJoiner;

public class Service {
    static int USER_CODE;
    static String BRAND;

    public Service() {

    }

    public void variableTest() {
        String gear;
        gear = "Love";
        System.out.println("Gear: " + gear);
    }

    public void stringTest() {
        Pessoa joao = new Pessoa("João", "Rua a", 12);

        String nome = joao.getNome();
        nome = "Cristian";
        System.out.println("Nome: " + nome);
        System.out.println("Pessoa: " + joao);
    }

    public class Pessoa {
        String nome;
        String endereco;
        int idade;

        public Pessoa(String nome, String endereco, int idade) {
            this.nome = nome;
            this.endereco = endereco;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public String getEndereco() {
            return endereco;
        }

        public int getIdade() {
            return idade;
        }

        @Override
        public String toString() {
            StringJoiner stringJoiner = new StringJoiner(" ", "Pessoa {", "}");
            stringJoiner.add("nome=");
            stringJoiner.add(nome);
            stringJoiner.add("endereco=");
            stringJoiner.add(endereco);
            stringJoiner.add("idade=");
            stringJoiner.add(String.valueOf(idade));

            return stringJoiner.toString();
        }
    }

}
