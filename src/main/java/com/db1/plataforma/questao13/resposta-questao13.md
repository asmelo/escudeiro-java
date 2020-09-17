<h2>Conhecendo a plataforma - Questão 13</h2>

*A qualidade de um software não pode ser avaliada em um produto já feito. É fundamental que, durante o desenvolvimento, sejam adotadas técnicas para aprimorar a produção. Pesquise sobre testes unitários em Java e:*

 - *Pontue quais frameworks existem atualmente para auxiliar o desenvolvimento de testes unitários no ecossistema Java e a diferença entre eles;*
 - *Escolha um framework e faça testes unitários para pelo menos três exercícios desenvolvidos anteriormente;*
 - *Justifique sua escolha de framework e exercícios.*

<h2>Resposta</h2>

**Pontue quais frameworks existem atualmente para auxiliar o desenvolvimento de testes unitários no ecossistema Java e a 
diferença entre eles;**

Atualemente o Java possui diversos frameworks que auxiliam no desenvolvimento de testes unitários, alguns deles são:

**O JUnit** possibilita a automação de testes com apresentação dos resultados. Este possibilita a verificação de cada método
 de uma classe se funciona da forma esperada ou se existe algum erro, neste caso exibindo que erro ocorreu. O JUnit provê
 diversos métodos de asserção que verificam o resultado do teste como assertEquals(), assertTrue(), e assertFalse(). Este
 possui diversas anotações que simplificam seu uso. O JUnit 4 ainda é bastante utilizado mas o Junit 5 possui diversas
 melhorias como os testes parametrizados que possibilita executar um único método inúmeras vezes com parâmetros diferentes.
 
 **O TestNG** em termos gerais funciona de forma similar ao JUnit porém é menos utilizado pela comunidade, este possibilita
 a execução de testes com múltiplas threads, possui um arquivo de configuração onde pode-se definir os pacotes, 
 classes e métodos a serem testados e definição de grupos de testes que serão executados. O TestNG possibilita também 
 utilizar dados externos nos seus testes.
 
 **O Mockito** permite "mockar" as dependências de uma classe a fim de poder testa-la de forma isolada sem nenhum interferência
 externa. A expressão "mockar" é utilizada para descrever objetos que imitam objetos reais para teste. Através da notação
 @Mock podemos definir as instâncias de classes ou interfaces que serão mockadas e através da notação @InjectMocks definimos a classe
 que está sendo testada e onde os mocks criados serão injetados. A fim de definir os valores retornados pelos métodos
 de uma instância mockada é utilizado o Mockito.when(mock.method(args)).thenReturn(value). Através do método verify é possível 
 realizar uma validação de forma flexível, informando exatamento qual trecho de código será validado. O mockito também 
 permite a criação de mocks parciais através do @Spy e a permite também mockar o lançamento de exceções.
 
 **O PowerMockito** é uma extensão de suporte ao Mockito, este trabalha com Java Reflection agregando assim a possibilidade
 de mockar métodos finais, estáticos ou privados. 
 
 **O EasyMock** é similar ao mockito e possibilita mockar classes e interfaces utilizando o Java Reflection, contudo não dá suporte a criação
 de mocks parciais. O mock das chamadas aos métodos é feito através do EasyMock.expect(mock.method(args)).andReturn(Value).
 A validação flexível também existe com o método verify contudo antes da sua chamada é preciso sempre executar o EasyMock.replay(mock).
 O EasyMock também possibilita mockar o lançamento de exceções.
 
 **O AssertJ** busca prover diversos métodos que possibilitem escrever asserçoes de forma fluente e legível. A fim de escrever
 uma asserção sempre precisamos usar o método Assertions.assertThat(), este nos permiter executar de forma encadeada diversos
 outros métodos como isNotEqualTo(), isIn(), startsWith(), endsWith(), isEqualToIgnoringCase(), hasSize(), contains(), doesNotContain()
 e muitos outros.
 
 **O Hamcrest** é simmilar ao AssertJ e normalmente é utilizado junto com o JUnit por ser incorporado ao mesmo. Este 
 utiliza predicados para fazer as asserções, por exemplo: 
 ```
assertThat(varA, equalToIgnoringCase(varB)); 
assertThat(employee,hasToString(employeeStr));
assertThat(Employee.class,typeCompatibleWith(Person.class));
```

**A Spring Unit** funciona de forma similar aos frameworks já citados contudo foca em aplicações com multicamadas, assim
fornece o **Spring MockMVC** para camada Web, o **DataJpaTest** para a camada de dados e a camada de negócio é baseada no 
Mockito, sem a necessidade de subir o contexto do Spring.

**O JSONAssert** por sua vez foca em todas as peculiaridades da asserção de dados do tipo JSON e para isso realiza uma 
comparação lógica dos dados. Um exemplo de asserção seria:
```
String value = "{id:123456, name:\"Pedro\", age:52}";
JSONAssert.assertEquals("{name:\"Pedro\", id:123456}", value, JSONCompareMode.LENIENT);
```

Neste exemplo a asserção irá passar pois o modo LENIENT ainda que o JSON avaliado possua mais campos que o JSON comparado 
o teste irá passar. Já utilizando o modo STRICT este teste não passaria pois exige que os valores comparados sejam
exatamente iguais. Observamos no examplo também que a ordem dos elementos não interfere na comparação, independente do 
modo utilizado. O JSONAssert também possibilita a comparação de elementos em arrays além de outras particularidades.

**O JSONPath** é uma alternativa ao JSONAssert e ainda possibilita realizar consultas do JSON, por exemplo a expressão
$.length() que retorna o número de elementos de um JSON, a expressão $..id que possibilita verificar todos os campos "id". É possível
extrair partes dos elementos em array como o primeiro elemento do array usando o $.[1] ou os três primeiros elementos do array
usando o $.[0:3]. Através da expressão $.[?(@.name == 'Pedro')] é possível consultar por um campo específico em todo o JSON.
Todos esses valores extraídos do JSON podem ser utilizados em asserções.

**Escolha um framework e faça testes unitários para pelo menos três exercícios desenvolvidos anteriormente;**

 - [Testes unitários da questao 4](tests/questao4/BigDecimalArithmeticOpsTest.java)
 
 - [Testes unitários da questao 10](tests/questao10/modifierExamples/service/PersonTest.java)
 
 - [Testes unitários da questao 12](tests/questao12/custom_exception/CustomExceptionExampleTest.java)

**Justifique sua escolha de framework e exercícios.**

Para os testes unitários implementados em alguns dos exercícios anteriormente foi selecionado o JUnit. Uma vez que nos exercícios
escolhidos não existe dependência externa portanto não houve necessidade de mockar classes portanto nem o Mockito, PowerMockito
ou EasyMock foram escolhidos. Como nos exercícios não há JSON nem o JSONAssert nem o JSONPath foi selecionado. Por serem classes 
simples o Spring Unit não foi selecionado. Para as asserções foram utilizados aqueles já incorporados ao JUnit.

Os exercícios selecionados foram aqueles possuiam métodos bem definidos a fim de testa-los uma vez que são as unidades mais simples
da classe. O exercício da questão número 12 foi selecionado em especial por possuir muitas possibilidades de acertos e erros,
todos foram testados usando testes parametrizados.

[Retornar ao Sumário](../../../../../../../README.md)