<h2>O básico do Java - Questão 4</h2>

*Durante muito tempo, uma das maiores dificuldades na hora de programar era o gerenciamento de memória. Os desenvolvedores eram responsáveis pela sua alocação e liberação manualmente, o que levava a muitos erros e memory leaks. Hoje, em todas as plataformas modernas (incluindo Java), temos gerenciamento de memória automático através de algoritmos de coleta de lixo. Pesquise sobre Garbage Collector e faça uma explanação de como este algoritmo funciona na plataforma Java. Também implemente dois algoritmos em Java: um que exemplifique um possível erro de OutOfMemoryError e outro que mostre os cuidados tomados para não acontecer este tipo de erro durante o desenvolvimento de software.*

<h2>Resposta</h2>

O Java possui gerenciamento automático de alocação e desalocação de memória, 
esta última é realizada por um processo chamado de Garbage Colletion. Neste 
processo a memória heap da JVM é analisada a fim de identificar objetos que
não serão mais utilizados e removê-los. Um algoritmo que implementa o Garbage
Colletion é chamado de Collector.  
 
Atualmente os principais algoritmos que implementam a Garbage Collection são:
Serial, Parallel, Concurrent (Deprecated) e Garbage-First (desde o Java 7)

De forma geral as colletions são executadas repetidamente durante a execução de uma 
aplicação, a frequência da sua execução é gerenciada pela JVM. Na primeira fase (Mark) 
o Garbage Colletor busca na memória heap por objetos instanciados que já foram 
utilizados e não são mais, numa segunda fase (Sweep) 
seleciona o espaço de memória desses objetos e os remove.

Mais especificamente o Collector Serial utiliza apenas uma thread, com isso a 
execução da aplicação é suspensa enquanto as Colletions são executadas. Já o Collector
Parallel utiliza múltiplas threads tornando-o mais eficiente, este é o algoritmo
padrão utilizado pela JVM, caso nenhum outro seja selecionado este será executado.
Atualmente a JVM também disponibiliza o Collector Garbage-First (G1), que é indicado para
aplicações com multi-processamento e grande espaço de memória. Na primeira fase (Mark)
o G1 divide a memória em regiões e então seleciona os objetos que não estão sendo mais utilizados.
Em seguida seleciona as regiões que possuem mais espaços a serem liberados e inicia a 
segunda fase (Sweep) por estas regiões, maximizando assim seus resultados.

O Collector ideal deve ser selecionado de acordo com a natureza da aplicação. Também é
possível ajustar os parâmetros que influenciarão na execução da Collection, como o tamanho
da memória heap (-Xmx<N>), o tempo máximo entre a execução de duas Collections 
(-XX:MaxGCPauseMillis=<N>) ou o número de threads para execução da Collection 
(-XX:ParallelGCThreads=<N>). Tais parâmetros podem afetar de forma sensível a performance das
aplicações em produção.

**Também implemente dois algoritmos em Java:** 

**Um que exemplifique um possível erro de OutOfMemoryError**
 
  - [Algoritmo exemplificando OutOfMemoryError](OutOfMemoryExample.java)
 
 **Outro que mostre os cuidados tomados para não acontecer este tipo de erro durante o desenvolvimento de software.**

  - [Algoritmo exemplificando como evitar esse tipo de erro](AvoidingOutOfMemory.java)
 
 Classes Auxiliares utilizadas:
  - [Person](model/Person.java)
  - [PersonService](service/PersonService.java)

[Retornar ao Sumário](../../../../../../../README.md)