<h2>O básico do Java - Questão 3</h2>

*Para começarmos desenvolver em Java, precisamos de muito pouco. Basta um editor de texto, uma outra coisinha que você aprendeu na questão de número 2 e um terminal. Crie uma classe Java utilizando um editor qualquer. Esta classe deve ter um método main que imprima a frase “Hello World!”, para começarmos com o pé direito esta aventura de programação. Agora faça uma explanação sobre:*
 
* O que você precisou para resolver esta questão;*
 *O comando que você usou para compilar;*
 *O comando que você usou para executar;*
 *Qual é a estrutura miníma de uma classe Java;*
 *O que é o método main e qual a sua importância;*
 *O que é e em que momento da resolução da questão foi gerado o BYTECODE;*

<h2>Resposta</h2>

**Crie uma classe Java utilizando um editor qualquer**

[Link para classe criada](Main.java)

**O que você precisou para resolver esta questão?**

Para criar a classe Main precisei das classes String e System, ambas presentes no
java.lang, este foi obtido na instalação do JDK. Para compilar a classe Main 
precisei do JDK e para executar precisei da JVM e JRE.

**O comando que você usou para compilar**

javac Main.java

**O comando que você usou para executar**

java Main

**Qual é a estrutura miníma de uma classe Java**
```
class Main {
}
```
**O que é o método main e qual a sua importância**

O método main é o ponto de início de uma aplicação Java, trata-se de um método 
necessariamente público e estático, não possui um retorno e recebe como parâmetro
um array de String que correspondem aos argumentos que podem ser passados via
linha de comando. 

**O que é e em que momento da resolução da questão foi gerado o BYTECODE**

O Bytecode (.class) é gerado na compilação do código fonte (.java), trata-se de 
um código não compreensível para os seres humanos mas que serve de entrada para
a JVM que irá traduzi-lo para instruções específicas do sistema operacional e 
hardware utilizado. 


[Retornar ao Sumário](../../../../../../../README.md)