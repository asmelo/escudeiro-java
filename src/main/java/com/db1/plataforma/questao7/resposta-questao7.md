<h2>Conhecendo a plataforma - Questão 7</h2>

*Quando estamos desenvolvendo um software, por vários momentos surge a necessidade de executar uma parte do código várias vezes, como uma repetição. O Java oferece alguns tipos de laços de repetição para o programador escolher, então pesquise sobre o assunto e:*

 - *Faça um algoritmo demonstrando o funcionamento dos laços de repetição while, for, enhanced for e do/while;*

 - *Faça uma comparação entre os tipos de laços;*

 - *Demostre por meio de um algoritmo o funcionamento do break e do continue em laços de repetição.*

<h2>Resposta</h2>

**Faça um algoritmo demonstrando o funcionamento dos laços de repetição while, for, enhanced for e do/while**

 - [Algoritmo com os exemplos dos laços de repetição](LoopExample.java)

**Faça uma comparação entre os tipos de laços**

O "for" simples do Java é composto por três parâmetros: inicialização, expressão lógica e uma ação a ser executada a 
cada passo, geralmente um incremento. São parâmetros opcionais que irão controlar a execução do laço. O "enhanced for"
por sua vez possui uma estrutura mais simples. Este possui a declaração de uma variável que irá conter cada um dos 
itens do array/colletion e o array/colletion em si. Apesar de ser mais simples e legível pode não ser adequado para
todos os casos, por exemplo quando precisa-se acessar o índice que indica as posições do array/colletion é preciso 
usar o "for" simples.    

O "while" possui uma outra lógica de execução em relação ao "for", apenas uma expressão lógica irá determinar se a 
execução do laço irá parar ou não. O "do/while" se comporta de forma similar é diferença é que a primeira execução
do laço sempŕe irá ocorrer, ao contrário do "while" que pode não realizar interação alguma caso a expressão lógica já
no primeiro momento seja falsa. 

**Demostre por meio de um algoritmo o funcionamento do break e do continue em laços de repetição.**

- [Algoritmo com os exemplos do continue e break](BreakAndContinueExample.java)

[Retornar ao Sumário](../../../../../../../README.md)