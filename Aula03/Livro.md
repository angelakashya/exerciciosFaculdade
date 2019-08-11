 # Detalhamento

 ## Vamos começar criando a classe Livro.

**a.** A classe Livro possui 4 atributos: titulo (String), codigo (int), autor (String) e preco (double). Esses serão os atributos (também chamados de campos ou variáveis) da classe.

**b.** Crie um método construtor que inicialize os atributos do livro com valores default (string vazia (“”) para variáveis que são String e zero (0) para variáveis numéricas).

**c.** Crie um método construtor que inicialize os atributos do livro com valores passados pelos parâmetros.

**d.** Crie métodos de modificação dos atributos. Os métodos de modificação são aqueles que modificam o valor do atributo e, geralmente, se chamam setXXX, onde XXX é o nome do atributo com primeira letra em maiúsculo. Por exemplo: setTitulo(...), setCodigo(...), etc. Esses métodos possuem parâmetros (variáveis declaradas ao lado do nome do método) que recebem os valores passados como argumento.

**e.** Crie métodos de acesso dos atributos. Os métodos de acesso são aqueles que acessam (retornam) o valor do atributo e cujo nome é getXXX, onde XXX é o nome do atributo com primeira letra em maiúsculo. Por exemplo: getTitulo(), getCodigo(), etc.

**f.** Faça o método “public double calculaPrecoFinal(double desconto)”. Esse método possui uma variável double como parâmetro, que representa o desconto que será dado ao livro (por exemplo, 0.2, representa um desconto de 20%). Ele retorna um valor double contendo o valor final do livro.

**g.** Faca o método “exibeDados()”  que exibe os valores de todos os atributos. 