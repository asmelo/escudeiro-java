package com.db1.plataforma.questao10;

public class MethodWithArgumentsAndReturnValueExample {

    public static void main(String[] args) {
        SimpleMath simpleMath = new SimpleMath();

        int a = 2;
        int b = 6;
        int sum = simpleMath.addTwoValues(a, b);

        System.out.println(String.format("A soma de %d e %d é %d", a, b, sum));

    }

    public static class SimpleMath {

        //O método addTwoValues possui dois argumentos e retorna um inteiro que corresponde à soma dos dois argumentos passados.
        int addTwoValues(int a, int b) {
            return a + b;
        }

    }


}
