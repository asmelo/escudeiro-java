package com.db1.basico.questao4;

import com.db1.basico.questao4.model.Person;
import com.db1.basico.questao4.service.PersonService;

import java.util.List;

public class AvoidingOutOfMemory {

    //Uma forma de evitar consultar de dados e carregar em memória é criar um esquema de paginação, onde
    //a cada requisição é passado como parâmetro uma página e o tamanho da página, evitando assim carregar
    //todos os dados de uma só vez.
    public static void main(String[] args) {
        System.out.println("CHARACTER");
        char character = 'a';
        Character characterObj = Character.valueOf(character); // char to Character
        System.out.println(characterObj);
        characterObj = 'b';
        character = characterObj.charValue(); // Character -> char
        System.out.println(character);

        System.out.println("SHORT");
        short nrCurto = 1;
        Short nrCurtoObj = Short.valueOf(nrCurto); // short to Short
        System.out.println(nrCurtoObj);
        nrCurtoObj = 2;
        nrCurto = nrCurtoObj.shortValue(); // Short to short
        System.out.println(nrCurto);

        System.out.println("INTEGER");
        int inteiro = 1;
        Integer inteiroObj = Integer.valueOf(inteiro); //int -> Integer
        System.out.println(inteiroObj);
        inteiroObj = Integer.valueOf(2);
        inteiro = inteiroObj.intValue(); //Integer -> int
        System.out.println(inteiro);

        System.out.println("FLOAT");
        float flutuante = 1;
        Float flutuanteObj = Float.valueOf(flutuante); // float to Float
        System.out.println(flutuanteObj);
        flutuanteObj = Float.valueOf(2);
        flutuante = flutuanteObj.floatValue(); // Float to float
        System.out.println(flutuante);

        System.out.println("DOUBLE");
        double dobro = 1.0;
        Double dobroObj = Double.valueOf(dobro); // double to Double
        System.out.println(dobroObj);
        dobroObj = Double.valueOf(2.0);
        dobro = dobroObj.doubleValue(); // Double to double
        System.out.println(dobro);

        System.out.println("LONG");
        long longo = 1;
        Long longoObj = Long.valueOf(longo); // long to Long
        System.out.println(longoObj);
        longoObj = Long.valueOf(2);
        longo = longoObj.longValue();
        System.out.println(longo);

        System.out.println("BOOLEAN");
        boolean logico = true;
        Boolean logicoObj = Boolean.valueOf(logico); // boolean to Boolean
        System.out.println(logicoObj);
        logicoObj = false;
        logico = logicoObj.booleanValue();
        System.out.println(logico);

        System.out.println("BYTE");
        byte val = 1;
        Byte valObj = Byte.valueOf(val);
        System.out.println(valObj);
        valObj = Byte.valueOf((byte)2);
        val = valObj.byteValue();
        System.out.println(val);

        PersonService personService = new PersonService();
        List<Person> page1 = personService.findAll(0, 5);

        for (Person person : page1) {
            System.out.println(String.join(", ", person.getName(), person.getAge().toString()));
        }

        List<Person> page2 = personService.findAll(1, 5);

        for (Person person : page2) {
            System.out.println(String.join(", ", person.getName(), person.getAge().toString()));
        }
    }

}
