package com.db1.plataforma.questao10;

import com.db1.plataforma.questao10.modifiier_examples.service.SimpleMathFour;

public class ConstructorExamples {

    public static void main(String[] args) {

        //Uso do construtor padrão
        SimpleMathOne simpleMathOne = new SimpleMathOne();
        int sum = simpleMathOne.addTwoValues(2, 5);
        System.out.println("A soma de 2 e 5 é " + sum);

        //Uso do contrutor com argumento
        SimpleMathTwo simpleMathTwo = new SimpleMathTwo(8,9);
        sum = simpleMathTwo.addValues();
        System.out.println("A soma de 8 e 9 é " + sum);

        //Uso das sobrecargas dos contrutores
        SimpleMathThree twoValuesInstance = new SimpleMathThree(3, 5);
        sum = twoValuesInstance.addValues();
        System.out.println("A soma de 3 e 5 é " + sum);

        SimpleMathThree threeValuesInstance = new SimpleMathThree(3, 5, 7);
        sum = threeValuesInstance.addValues();
        System.out.println("A soma de 3, 5 e 7 é " + sum);

        SimpleMathThree fourValuesInstance = new SimpleMathThree(3, 5, 7, 2);
        sum = fourValuesInstance.addValues();
        System.out.println("A soma de 3, 5, 7 e 2 é " + sum);

        //A classe SimpleMathFour possui o construtor privado portanto não pode ser instanciada
        //"SimpleMathFour simpleMathFour = new SimpleMathFour();" irá gerar um erro de compilação.
    }

    public static class SimpleMathOne {
        //Construtor padrão
        //Não é necessária a declaração explicita do construtor padrão pois o java já o cria por padrão para todas as
        //classes caso não exista um construtor declarado.
        public SimpleMathOne() {
        }

        int addTwoValues(int a, int b) {
            return a + b;
        }
    }

    public static class SimpleMathTwo {

        private int portionOne;
        private int portionTwo;

        //Contrutor com argumentos
        public SimpleMathTwo(int portionOne, int portionTwo) {
            this.portionOne = portionOne;
            this.portionTwo = portionTwo;
        }

        int addValues() {
            return portionOne + portionTwo;
        }

    }

    public static class SimpleMathThree {

        private int portionOne;
        private int portionTwo;
        private int portionThree;
        private int portionFour;

        //Exemplo de sobrecarga de contrutores

        public SimpleMathThree(int portionOne, int portionTwo) {
            this.portionOne = portionOne;
            this.portionTwo = portionTwo;
        }

        public SimpleMathThree(int portionOne, int portionTwo, int portionThree) {
            this.portionOne = portionOne;
            this.portionTwo = portionTwo;
            this.portionThree = portionThree;
        }

        public SimpleMathThree(int portionOne, int portionTwo, int portionThree, int portionFour) {
            this.portionOne = portionOne;
            this.portionTwo = portionTwo;
            this.portionThree = portionThree;
            this.portionFour = portionFour;
        }

        int addValues() {
            return portionOne + portionTwo + portionThree + portionFour;
        }

    }

}
