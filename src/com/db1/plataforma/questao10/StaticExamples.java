package com.db1.plataforma.questao10;

public class StaticExamples {

    public static void main(String[] args) {
        int a = 2;
        int b = 6;

        //O método estático addTwoValues é executado sem a necessidade de instanciar um objeto da classe SimpleMath
        int sum = SimpleMath.addTwoValues(a, b);

        System.out.println(String.format("A soma de %d e %d é %d", a, b, sum));

        //Por ser uma variável estática o PI_VALUE pode ser acessado sem a necessidade de instanciar um objeto da classe SimpleMath
        System.out.println("O valor de PI é " + SimpleMath.PI_VALUE);
    }

    public static class SimpleMath {

        //Por ser uma variável estática está é compartilhada com todas as instâncias de objetos desta classe otimizando assim
        //o uso da memória.
        final static double PI_VALUE = 3.14159265359;

        //O método addTwoValues está sendo declarado como estático e com isso é possível acessá-lo sem a necessidade de instanciar a classe que a contém.
        static int addTwoValues(int a, int b) {
            return a + b;
        }

    }

}
