**Veja o digrama de classe abaixo, diferencie quais são as exceções Checked, Runtime e Erros e descreva a diferença de cada tipo:**

As **exceções checked** são aquelas que herdam da da classe Exception mas não herdam da RunTimeException. Tratam-se
daquelas falhas que ocorrem por fatores externos ao código, falhas que são possíveis do usuário
recuperar-se como por exemplo a **IOException**, SQLException ou FileNotFoundException. Estas falhas são verificados em
tempo de compilação. Métodos que podem gerar esse tipo de exceção devem propagar a exceção através do throws a fim 
de garantir que quando sejam utilizados seja obrigatório o tratamento de tais exceções.

As **exceções Runtime (unchecked)** são aquelas que herdam da classe RuntimeException. Tratam-se dos falhas que ocorrem por erro 
na lógica do código, falhas onde o usuário não tem como se recuperar como por exemplo **ArithmeticException, 
ClassCastException, NullPointerException, InputMismatchException e ArrayIndexOutOfBoundsException**. Estas exceções são 
lançados apenas em tempo de execução.

Ao contrário das exeções que espera-se que sejam tratadas os Erros indicam problemas sérios que uma aplicação não deveria
tentar tratá-los. Como exemplo de Error temos o **AWTError, OutOfMemoryError e ThreadDeath**. Normalmente não é considerada
uma boa prática capturar Erros no código uma vez que deveriam ser resolvidos com uma mudança na arquitetura ou um refatoramento
ao invés de captura-los no código. Estes erros são lançados em tempo de execução.
