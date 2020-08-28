**Tipos primitivos e classes Wrappers**

No java os tipos primitivos classificam os dados mais básicos como números, caracteres ou 
valores lógicos. Por sua vez um Wrapper é um objeto que contém um dado do tipo primitivo
e implementa funcionalidades a fim de manipula-lo. 

O Java possui os seguintes tipos primitivos e respectivos Wrappers: 
 - char (Character)
 - short (Short)
 - int (Integer)
 - float (Float)
 - double (Double)
 - long (Long) 
 - boolean (Boolean)
 - byte (Byte)
 
 Ao declarar variáveis do tipo primitivo ou Wrappers estas são inicializadas com valores
 padrões:
  - O valor padrão do tipo primitivo char é o caractere nulo que é o '\u0000'
  - O tipo primitivo short é inicializado com zero, com o valor (short)0
  - O tipo int é inicializado com zero, com o valor 0
  - O float é inicializado com zero positivo, com o valor 0.0f
  - O double é inicializado com zero positivo, com o valor 0.0d
  - O long é inicializado com zero, com o valor 0L
  - O boolean é inicializado com false
  - O byte é inicializado com zero, com o valor (byte)0
  - Todos os Wrappers são inicializados com o valor null
  
A conversão entre tipo primitivo e wrapper e vice-versa pode ser realizada da seguinte forma:
 - char para Character
```
char character = 'a';
Character characterObj = Character.valueOf(character);
```
 - Character para char
```
character = characterObj.charValue();
``` 

 - short para Short
```
short nrCurto = 1;
Short nrCurtoObj = Short.valueOf(nrCurto);
```
 - Short para short
```
nrCurto = nrCurtoObj.shortValue();
``` 

 - int para Integer
```
int inteiro = 1;
Integer inteiroObj = Integer.valueOf(inteiro);
```
 - Integer para int
```
inteiro = inteiroObj.intValue();
``` 

 - float para Float
```
float flutuante = 1;
Float flutuanteObj = Float.valueOf(flutuante);
```
 - Float para float
```
flutuante = flutuanteObj.floatValue();
``` 

 - double para Double
```
double dobro = 1.0;
Double dobroObj = Double.valueOf(dobro);
```
 - Double para double
```
dobro = dobroObj.doubleValue();
``` 

 - long para Long
```
long longo = 1;
Long longoObj = Long.valueOf(longo);
```
 - Long para long
```
longo = longoObj.longValue();
``` 

 - boolean para Boolean
```
boolean logico = true;
Boolean logicoObj = Boolean.valueOf(logico);
```
 - Boolean para boolean
```
logico = logicoObj.booleanValue();
``` 

 - byte para Byte
```
byte val = 1;
Byte valObj = Byte.valueOf(val);
```
 - Byte para byte
```
val = valObj.byteValue();
```


Uso dos tipos primários e Wrappers

**char**: Utilizamos para armazenar caracteres isolados, por exemplo quando precisamos comparar a ordem de precedência
entre dois caracteres podemos utilizar o Character. Utilizando o método compareTo é possível identificar facilmente se
um caractere precede outro.
```
Character char1 = Character.valueOf('a');
Character char2 = Character.valueOf('b');
if (char1.compareTo(char2) == -1) {
    System.out.println(String.format("O caractere %s precede %s", char1, char2));
}
```

**int**: Utilizamos o tipo int quando manipulamos números inteiros que podem variar entre -2<sup>31</sup> e 2<sup>31</sup>-1.
Também podemos usar o unsigned int para armazenar valores entre 0 e -2<sup>32</sup>-1. O int ocupa 32 bits. Por exemplo 
podemos utilizar o int para armazenar o número de habitantes das cidades brasileiras.

**long**: O long armazena inteiros entre -2<sup>63</sup> e 2<sup>63</sup>-1, também é possível usar o unsigned long que
armazena inteiros entre 0 e 2<sup>64</sup>-1. O long deve ser utilizado quando a faixa de valores do int não for
suficiente. Por exemplo para armazenar o identificador de uma tabela do banco de dados com milhares de dados.

**short**: Caso tenhamos números inteiros entre -32.768 e 32.767 podemos otimizar o uso da memória usando o tipo short que
ocupa apenas 16 bits. Por exemplo podemos utilizar o short para armazenar a altura de  em metros, pois sabemos que
não passam de 32.767 metros.

**byte**: Ocupa apenas 8 bits e pode armazenar valores entre -128 e 127. Este deve ser usando em grandes arrays a fim
de otimizar ainda mais o uso da memória, desde que os valores do array não ultrapassem os limites do byte. Por exemplo
para uma variável que amazenará notas de 0 a 10 pode ser do tipo byte.
Podemos também converter uma String em um array de bytes para salvar caracteres no banco de dados desconsiderando a
codificação da String.

**double**: Utilizamos ao manipular números fracionados que não exigem grande precisão nos cálculos, portanto não é
indicado para manipular moeda, neste caso o recomendável é o uso da classe BigDecimal. Usamos o double por exemplo para
calcular medidas de uma receita de cozinha.

**float**: Também utilizamos ao manipular números fracionados que não exigem grande precisão nos
cálculos, assim como o double não é indicado para moeda. O float nos permite otimizar o uso de memória pois
possui uma precisão de 32 bits, diferente do double que possui uma precisão de 64 bits. Por exemplo ao manipular um
grande array com números decimais é indicado o uso de float, caso não seja necessária uma grande precisão.

**boolean**: O boolean armazena apenas os valores lógicos true e false. Ele é utilizado para representar flags ou
construir expressões lógicas. Por exemplo o a informação "Registro ativo" pode ser do tipo boolean.
