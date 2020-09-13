package com.db1.plataforma.questao8;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        /*
        O TreeSet implementa a interface NavigableSet com base em um TreeMap que por sua vez utiliza a árvore rubro-negra em sua implementação.
        Desta forma o TreeSet mantém seus elementos ordenados automaticamente de acordo com sua ordenação natural (implementando a interface Comparable) ou pelo
        Comparator definido na sua construção. Ao contrário do LinkedHashSet a ordenação do TreeSet basea-se na comparação dos seus elementos e não na inserção dos mesmos na coleção.
        Por garantir tal ordenação o TreeSet possui uma performance de O(log(n)) na execução dos métodos add, remove e contains.
        Assim como o hashSet a implementação do TreeSet também não é sincronizada.

        Portanto devemos usar o TreeSet quando não puder existir elementos duplicados, quando a ordenação dos elementos for necessária e quando o custo de O(log(n)) for suficiente
        para a manipulação dos elementos.
        */

        //Exemplo de uso do TreeSet onde os elementos serão ordenados de acordo com a ordenação natual do objeto String.
        //A classe String possui ordenação natural pois implementa a classe Comparable e possui o método compareTo.
        Set<String> brazilianStates = new TreeSet<>();

        brazilianStates.add("Paraná");
        brazilianStates.add("Alagoas");
        brazilianStates.add("Sergipe");
        brazilianStates.add("Amazonas");

        //Elementos sendo inseridos pela segunda vez
        brazilianStates.add("Paraná");
        brazilianStates.add("Alagoas");

        //Ao listar os elementos do "Set" percebemos que eles não foram duplicados
        //Percebemos também que os elementos foram ordenados alfabeticamente independente da ordem que os elementos foram inseridos
        System.out.println("Elementos do conjuto de estados brasileiros: " + brazilianStates);


        //Exemplo de uso do TreeSet onde os elementos serão ordenados de acordo com um Comparator específico.
        Set<Person> personSet = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                Integer age1 = p1.getAge();
                Integer age2 = p2.getAge();
                return age1.compareTo(age2);
            }
        });
        //Com o Java 8 é possível realizar a mesma construção de forma mais concisa:
        // Set<Person> personSet1 = new TreeSet<>(Comparator.comparing(Person::getAge));

        personSet.add(new Person("Pedro", 45));
        personSet.add(new Person("Carla", 32));
        personSet.add(new Person("Jonas", 13));
        personSet.add(new Person("Suzana", 68));

        System.out.println("Pessoas ordenadas pela idade: " + personSet);

    }

    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public static Person of(String name, int age) {
            return new Person(name, age);
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

}
