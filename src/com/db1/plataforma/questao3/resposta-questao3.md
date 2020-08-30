**Um dos tipos mais utilizados na plataforma Java é o tipo String, com S maiúsculo. 
Strings em Java são objetos ou instâncias da classe java.lang.String que devem ser 
declaradas e instanciadas. Vamos, então, concentrar nossa energia no estudo deste tipo
 tão importante. Crie exemplos utilizando String mostrando:**

**Como criamos um objeto do tipo String**

Uma String pode ser criada utilizando a palavra-chave new ou através da sintaxe literal.

```
String nome = new String("João"); //Utilizando a palavra-chave new
String nome = "João"; //Sintaxe literal
```

**Como podemos concatenar uma String**

No Java existem diversas formas de concatenar Strings, algumas formas são:

 - **Operador de adição**: É possível utilizar este operador para concatenar Strings como
 se estivesse somando números, por exemplo:
 
 ```
String stringConcatenada = "Exemplo de " + "concatenação de " + "Strings";
System.out.println(stringConcatenada); //Irá imprimir "Exemplo de concatenação de String"
```

- **Classe StringBuilder**: Internamente esta classe possui um array mutável
de caracteres, ao inicializar a classe precisamos declarar o tamanho deste array, por conta
disso o StringBuilder consegue concatenar String de forma bastante eficiente. Por exemplo:

```
StringBuilder stringBuilder = new StringBuilder(10);
 
stringBuilder.append("Exemplo de ");
stringBuilder.append("concatenação de ");
stringBuilder.append("Strings");

System.out.println(stringBuilder.toString());
```

- **Classe StringJoiner**: Esta classe possibilita concaternar Strings definido
delimitador, prefixo e sufixo. Por exemplo:

```
private final static String PREFIX = "[";
private final static String SUFFIX = "]";

...

StringJoiner joiner = new StringJoiner(", ", PREFIX, SUFFIX);
    joiner.add("Maçã")
      .add("Pera")
      .add("Uva");

System.out.println(joiner.toString()); //Irá imprimir "[Maça, Pera, Uva]"
```

- **Método concat da classe String**: Utilizando o método concat da própria classe String
podemos facilmente concatenar Strings. Por exemplo:

```
String stringConcatenada = "Exemplo de ".concat("concatenação de ")
  .concat("Strings")
  
System.out.println(stringConcatenada);
```

- **Método format da classe String**: Este método permite injetar diversos tipos de objetos
em um template de String, por exemplo:

```
String stringConcatenada = String.format("O salário do profissional %s é %.2f. Está no
padrão %s", "Marcos Antônio", 10000.00, "Alto");
 
System.out.println(stringConcatenada); // Irá imprimir "O salário do profissional Marcos Antônio
é 10000.00. Está no padrão Alto"
```

**Quais os principais comportamentos de uma String**
A classe String é imutável, uma vez que uma sequência de caracateres seja atribuida a uma instância
de uma classe String esta não pode mais ser modificada. Sempre que um novo valor é atribuido
a uma instância de String um novo objeto é criado. Por ser imutável uma String pode ser
compartilhada de forma segura já que uma nova instância é criada e não irá interferir na 
instância original. Todas as string literais como "Exemplo de string literal" são implementadas
como instâncias da classe String.

**Como trabalhamos com String utilizando as classes StringBuilder e StringBuffer, pontuando
 a diferença entre elas e qual a importância de usá-las**;
 
Ao contrário da classe String com as classes StringBuffer ou StringBuilder podemos trabalhar
com sequência de caracteres mutáveis. 
 


https://docs.oracle.com/javase/8/docs/api/java/lang/String.html


The String class represents character strings. All string literals in Java programs, such as "abc", are implemented as instances of this class.
Strings are constant; their values cannot be changed after they are created. String buffers support mutable strings. Because String objects are immutable they can be shared. For example:

     String str = "abc";
 
is equivalent to:

     char data[] = {'a', 'b', 'c'};
     String str = new String(data);
 
Here are some more examples of how strings can be used:

     System.out.println("abc");
     String cde = "cde";
     System.out.println("abc" + cde);
     String c = "abc".substring(2,3);
     String d = cde.substring(1, 2);
 
The class String includes methods for examining individual characters of the sequence, for comparing strings, for searching strings, for extracting substrings, and for creating a copy of a string with all characters translated to uppercase or to lowercase. Case mapping is based on the Unicode Standard version specified by the Character class.

The Java language provides special support for the string concatenation operator ( + ), and for conversion of other objects to strings. String concatenation is implemented through the StringBuilder(or StringBuffer) class and its append method. String conversions are implemented through the method toString, defined by Object and inherited by all classes in Java. For additional information on string concatenation and conversion, see Gosling, Joy, and Steele, The Java Language Specification.

Unless otherwise noted, passing a null argument to a constructor or method in this class will cause a NullPointerException to be thrown.

A String represents a string in the UTF-16 format in which supplementary characters are represented by surrogate pairs (see the section Unicode Character Representations in the Character class for more information). Index values refer to char code units, so a supplementary character uses two positions in a String.

The String class provides methods for dealing with Unicode code points (i.e., characters), in addition to those for dealing with Unicode code units (i.e., char values).


