### Detalhamento

**1)**  Crie uma classe chamada _Matematica_. Essa classe possui como atributo um valor inteiro numero.

**a)** Crie um método construtor que não receba nenhum argumento.

**b)** Crie um método construtor que inicialize o atributo da classe.

**c)** Crie métodos de acesso e modificação para o atributo da classe.

**d)** Crie o **método public int fatorial( )**. Esse método retorna um inteiro que é o fatorial do número inicializado na classe (use o _for para resolver esse problema_). Exemplo:

-   3! = 3 . 2 . 1 = 6
-   4! = 4 . 3 . 2 . 1 = 24
-   6! = 6 . 5 . 4 . 3 . 2 . 1 = 720

**e)** Crie o método **double pow (int exp)**. Esse método irá fazer a função de expoente. Para tanto, ele considera que o atributo é a base e o parâmetro é o expoente do cálculo. Por exemplo, se numero é 2 e o exp (parâmetro é 3), ele deve calcular:

-   2ˆ3 = 8

**2)** Crie a classe **TestaMatematica**. No método main desta classe, instancie um objeto Matematica. Leia do teclado um numero para instanciar a classe e outro para o expoente. Chame os métodos _fatorial( )_ e _pow(..)_ e apresente os resultados na tela.