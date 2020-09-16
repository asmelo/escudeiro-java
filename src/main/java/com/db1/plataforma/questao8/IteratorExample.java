package com.db1.plataforma.questao8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String args[]){

        //Exemplos do uso de métodos da interface Iterator

        List<String> names = Arrays.asList("João", "Maria", "Carlos", "Natalia");
        Iterator namesIterator = names.iterator();
        while(namesIterator.hasNext()){
            System.out.println(namesIterator.next());
        }

    }

}
