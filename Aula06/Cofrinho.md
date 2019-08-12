#### Detalhamento

**1)**  Crie a classe Cofrinho. A classe  **_Cofrinho_** simula um “porquinho” ou um cofrinho digital que só aceita moedas de 10, 25 e 50 centavos. Os objetos desta classe devem armazenar:

**·**  **String nome** - o nome do dono do cofrinho

**. int qtd50**  - a quantidade (int) de moedas de 50 centavos que foram colocadas no cofrinho.

**· int qtd25**  - a quantidade (int) de moedas de 25 centavos que foram colocadas no cofrinho.

**.int qtd10**  - a quantidade (int) de moedas de 10 centavo que foram colocadas no cofrinho.

**Observe a ordem de declaração de parâmetros: (String nome, int qtd50, int qtd25, int qtd10).**

**2)** Agora crie os métodos conforme descrito abaixo: 

**a)**  Implemente um  **_método construtor_**  que inicialize os atributos da classe com valores passados como parâmetro na ordem acima e um  **_método construtor_**  default que deve inicializar o nome com "" e as quantidade com 0;

**b)**  Implemente os  **_métodos modificadores e de acesso_**  para os atributos desta classe.

**c)**  A classe deve oferecer os seguintes métodos para depósito:

  **.  _depositaUmaMoedaDe10_** – o método é chamado toda vez que uma          						    				moeda de 10 centavos é depositada no cofrinho. Esse método incrementa o atributo que guarda a quantidade de moedas de 10 centavos;
   
**._depositaUmaMoedaDe25_** - idem para moeda de 25 centavos;
   
  **_. depositaUmaMoedaDe50_** idem para moeda de 50 centavos;

**d)** Implemente o método **_double calculaTotal()_ _-_** retorna o valor total em reais, armazenado no cofrinho;

**e)** Crie o método **_exibeDados( )_**. Esse método irá exibir o nome do dono do cofrinho, o valor total no cofre, bem como o valor em moedas de 10, moedas de 25 e moedas de 50 centavos.

**2)**  Crie uma classe de teste **_TestaCofrinho_**. Nessa classe instancie a classe Cofrinho. Peça para o usuário fornecer (via **_Teclado_**) o nome do dono e 3 números inteiros representando a quantidade de moedas de 50, 25 e 10 centavos. Exiba o valor total no cofrinho. Faça um depósito de 10, um de 25 e um de 50 centavos e após exiba novamente o valor total no cofrinho.