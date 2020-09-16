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
com sequência de caracteres mutáveis. É possível atribuir uma string e depois mudar seu valor sem
que um novo objeto seja instanciado. A StringBuffer é indicada para o uso com múltiplas threads
pois seus métodos são sincronizados e a ordem de execução dos seus métodos é garantida de acordo
com a ordem em que cada um deles foi invocado pela diversas threads. Já a classe StringBuild 
possui os mesmos métodos da StringBuffer mas não realiza sincronização, portanto não é indicada
para trabalhar com múltiplas threads. Em cenários de uma única thread é preferível utilizar a
StringBuilder já que é mais eficiente por não realizar a sincronização.
 

**Como transformamos String em outro tipo de dado**

Todos os wrappers possuem métodos que possibilitam a conversão do seu valor primitivo em String. 
Por exemplo o wrapper Integer possui os métodos parseInt e valueOf, o Long possui os métodos 
parseLong e valueOf, o Double possui o parseDouble e valueOf e o Boolean possui o parseBoolean
e o valueOf. Segue alguns exemplos de conversão utizando esses métodos:

```
//Converter String para int
int valInt = Integer.parseInt("1")
int valInt = Integer.valueOf("1")
```  

```
//Converter String para long
long valLong = Long.parseLong("1")
long valLong = Long.valueOf("1")
```  

```
//Converter String para double
double valDouble = Double.parseDouble("1")
double valDouble = Double.valueOf("1")
```

```
//Converter String para boolean
boolean valDBoolean = Boolean.parseBoolean(true)
boolean valBoolean = Boolean.valueOf(true)
```

**Como podemos transformar qualquer tipo de dado em uma String.**

Todas as classes do Java herdam da classe Object, esta por sua vez possui o método toString 
que gera a representação de string da instância do objeto. Sendo assim podemos converter
qualquer classe em uma classe String utilizando este método. Por exemplo: 

```
//Converter Integer para String
Integer valInt = 3;
String valString = valInt.toString();
```

```
//Converter Long para String
Long valLong = 3l;
String valString = valLong.toString();
```

```
//Converter Boolean para String
Boolean valBoolean = true;
String valString = valBoolean.toString();
```
