<h2>Conhecendo a plataforma - Questão 2</h2>

*Qualquer programa de computador precisa manter informações de alguma forma. Assim, as linguagens de programação permitem a criação de variáveis. Pontue:*

*Declaração de variáveis com inicialização implícita;*
*Declaração de variáveis com inicialização explícita;*
*Obrigatoriedade de inicialização de variáveis no Java;*
*Como funciona o escopo de variáveis no Java;*
*Quando utilizar a palavra reservada final na declaração de uma variável.*

<h2>Resposta</h2>

**Declaração de variáveis com inicialização implícita**

A declaração de variável com inicialização implícita ocorre quando não é informado um valor
e a variável assume seu valor padrão de acordo com seu tipo, em geral será 0 ou null. Por
exemplo:
```
private int nrAlunos; //Será atribuído o valor padrão 0.
```
```
private String nome; //Será atribuído o valor padrão null.
```

**Declaração de variáveis com inicialização explícita**

A declaração de variáveis com inicialização explícita ocorre quando é informado explicitamente
o valor que será atribuído à variável. Por exemplo:

```
private int nrAlunos = 50; // Será atribuído o valor 50 à variável nrAlunos.
```

**Obrigatoriedade de inicialização de variáveis no Java**

Não é obrigatório inicializar as variáveis de uma classe por conta do valor padrão que é
atribuído à variável, contudo esta não é uma boa prática. 
Além disso no caso de variáveis locais, aquelas declaradas dentro de um método,
é preciso atribuir um valor antes que a variável seja lida caso contrário ocorrerá um erro 
de compilação.  

**Como funciona o escopo de variáveis no Java**

Os três principais escopos do Java são:

 - **Escopo de classe**: As variáveis com este escopo podem ser acessadas apenas dentro da
  classe. Para isso as variáveis devem ser declaradas dentro de uma classe mas fora de qualquer
  método. A variável deve possuir o modificador ***private***, caso contrário poderá ser
  acessada por qualquer classe do mesmo pacote. Caso o modificador seja o ***public*** a 
  variável poderá também fora do seu pacote. 
 - **Escopo de método**: Trata-se das variáveis declaradas dentro de um método, estas são
  acessadas apenas dentro do método.
 - **Escopo de loop**: Caso uma variável seja declarada dentro de um loop esta será acessível
 apenas dentro do loop. Por exemplo:

```
public class Agenda {

    List<String> Contatos = Arrays.asList("João", "Maria", "Pedro");

    public void concatenarContatos() {
        String nomesConcatenados = "";
        for (String nome : Contatos) {            
            nomesConcatenados = nomesConcatenados + " " + nome;
            String mensagemDeLog = "Concatenando o nome " + nome;
            System.out.println(mensagemDeLog)
        }        
    }

}
```

No exemplo acima as varáveis "nome" e "mensagemDeLog" não podem ser acessadas dentro do 
método concatenarContatos, apenas dentro do laço do "for".

**Quando utilizar a palavra reservada final na declaração de uma variável**

Ao utilizar o modificar "final" na declaração de uma variável esta poderá receber um valor
uma única vez. Deve ser usado sempre que uma variável não possa ter ser valor modificado, por
exemplo ao declarar a variável PI podemos usar o modificador "final" uma vez que seu valor
não altera. O final também pode ser utilizado em variáveis passadas como parâmetro em métodos.

```
static final double PI = 3.141592653589793;
```

[Retornar ao Sumário](../../../../../../../README.md)