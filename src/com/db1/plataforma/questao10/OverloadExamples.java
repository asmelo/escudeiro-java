package com.db1.plataforma.questao10;

public class OverloadExamples {

    public static void main(String[] args) {
        SimpleMath simpleMath = new SimpleMath();

        int a = 2;
        int b = 6;
        int c = 7;
        int d = 9;
        int e = 1;

        int sum = simpleMath.addValues(a, b);
        System.out.println(String.format("A soma de %d e %d é %d", a, b, sum));

        sum = simpleMath.addValues(a, b, c);
        System.out.println(String.format("A soma de %d, %d e %d é %d", a, b, c, sum));

        sum = simpleMath.addValues(a, b, c, d);
        System.out.println(String.format("A soma de %d, %d, %d e %d é %d", a, b, c, d, sum));

        sum = simpleMath.addValues(a, b, c, d, e);
        System.out.println(String.format("A soma de %d, %d, %d, %d e %d é %d", a, b, c, d, e, sum));

    }

    public static class SimpleMath {

        /*
            Nesta classe são implementadas diversas sobrecargas do método addValues possibilitando assim que este seja executado com diferentes argumentos
         */


        int addValues(int a, int b) {
            return a + b;
        }

        int addValues(int a, int b, int c) {
            return a + b + c;
        }

        int addValues(int a, int b, int c, int d) {
            return a + b + c + d;
        }

        int addValues(int a, int b, int c, int d, int e) {
            return a + b + c + d + e;
        }

    }

}
