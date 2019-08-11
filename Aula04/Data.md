# Detalhamento

## Esse projeto conterá uma classe representando uma Data.

 **a.** Crie essa classe e a chame de Data.

 **b.** Implemente a classe Data com três atributos inteiros: dia, mes e ano.

 **c.** Crie um método construtor que inicialize os atributos com o valor 0 (Zero).

 **d.** Crie um método construtor que inicialize os atributos com valores passados como argumento.

 **e.** Crie métodos modificadores para os atributos da classe. Os métodos de modificação são aqueles que modificam o valor do atributo e geralmente se chamam setXXX, onde XXX é o nome do atributo.

 **f.** Crie métodos de acesso aos atributos. Os métodos de acesso são aqueles que acessam (retornam) o valor do atributo e cujo nome é getXXX, onde XXX é o nome do atributo.

 **g.** Crie o método public String obtemDataPadrao() que retorna a data no formato padrão DD/MM/AAAA (ex: 12/4/2006).

 **h.** Crie o método public int obtemDataInvertida() que retorna a data na forma de um número inteiro AAAAMMDD (ex: 20161129). Você vai ter que fazer alguns cálculos aqui. Nesse exemplo, para chegar a esse valor inteiro, você terá que, na verdade, somar 20160000+1100+29. Para transformar o ano 2016 no número 20160000, você vai ter que multiplicar o ano por 10.000: ano*10.000. Pense por quanto você vai ter que multiplicar o mês para chegar naquele valor.  