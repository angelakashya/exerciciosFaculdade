### Detalhamento

**1)** Crie uma classe chamada  **ArrayUtil**.  

**a)** Crie um atributo chamado **numeros**, este atributo deve ser um array de inteiros

**b)** Crie um método construtor, que recebe um parâmetro do tipo inteiro. Este parâmetro representa o número máximo de inteiros  que serão guardados no array, ou seja, a capacidade do array. Inicialize o array com esta capacidade neste construtor.

**c)** Crie um atributo chamado **tamanho**, do tipo inteiro. Este atributo representa a quantidade inserida no array.  

**d)** Crie o método **getTamanho** que retorna o valor do atributo tamanho.

**e)** Crie o método **inserir**, que recebe como argumento um inteiro e insere no final da array (primeira posição não ocupada). O atributo **tamanho** deve ser incrementado após a inserção.

**f)** Crie o método  **getNumero(int pos)**. Ele deve retornar o número na posição pos ou -1 se não estiver ocupada.

**2)** Crie mais alguns métodos na classe **ArrayUtil**.

**a)** Crie o método  _public void **inverte**_, que inverte, no próprio array, os números do array. Observe que você deve inverter apenas as posições ocupadas da array, ou seja, se array tem tamanho 10, mas apenas as 4 primeiras posições ocupadas, você deve inverter atá a posição 4.

**b)** Crie o método _public void **ordenaAsc**_, que ordena o array do menor para o maior número. Observe que você deve ordenar apenas as posições ocupadas da array, ou seja, se array tem tamanho 10, mas apenas as 4 primeiras posições ocupadas, você deve ordenar atá a posição 4.

**c)** Crie o método **public int obtemMaior**, que retorna o maior número do array. Desconsiderar as posições não ocupadas da array.