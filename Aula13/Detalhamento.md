### Detalhamento

**1)** Crie uma classe chamada  **Socio**.

 **a)** Crie um atributo chamado **numero** do tipo inteiro, um atributo  **idade** do tipo inteiro e um atributo  **nome** do tipo texto (String).
 
 **b)** Crie um método construtor que não recebe nenhum argumento e inicializa os atributos numero e idade com 0 e nome com um texto vazio.
 
 **c)** Crie um construtor que receba respectivamente os parâmetros  **numero, idade e nome** e inicialize os atributos da classe com os valores dos parâmetros.

**d)** Crie métodos de acesso e modificação para os atributos da classe. Os métodos deverão seguir a seguinte assinatura:

-   setNumero
-   setIdade
-   setNome
-   getNumero
-   getIdade
-   getNome

 **e)** Crie um método  **toString**(), que retorna os dados de  **Socio** no seguinte formato _numero, idade, nome_ por exemplo: _122, 33, Antônio Silva_  

   

**2)** Crie uma classe  **SocioAtleta** que herda de  **Socio**.

 **a)** Crie um atributo chamado **categoria** do tipo texto (String).

 **b)** Crie um método construtor que não recebe nenhum argumento e inicialize os atributos  **numero** e  **idade** com 0, **nome** com um texto vazio e  **categoria** com "Mirim".
 
 **c)** Crie um construtor que receba respectivamente os parâmetros **numero, idade, nome** e inicialize os atributos da classe com os valores dos parâmetros. Neste construtor inicialize a categoria de acordo com os seguintes critérios.

| Idade |Categoria  |
|--|--|
|  Até 10 anos| Mirim  |
|11 a 15 anos|Infantil|
|16 a 20 anos|Juvenil|
|21 a 40 anos|Adulto|
|Maior que 40|Master|


 **d)**  **Sobrescreva** o método **setIdade** atualizando a **categoria** de acordo com os critérios acima.
 
  **e)**  **Sobrescreva** o método **toString**(), que retorna os dados de  **SocioAtleta** no seguinte formato  _numero, idade, nome, categoria_  por exemplo: _122, 33, Antônio Silva, Adulto_
