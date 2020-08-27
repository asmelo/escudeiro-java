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


Exemplos de uso dos tipos primários e Wrappers

 - char (Character)
 - short (Short)
 - int (Integer)
 - float (Float)
 - double (Double)
 - long (Long)
 - boolean (Boolean)
 - byte (Byte)