### Detalhamento

**1)** Crie a classe  **Atleta**. Essa classe contém os atributos  **int idade** e **double peso**;

**a)**  Implemente um **método construtor** que inicialize os atributos da classe com valores passados como parâmetro, na ordem idade e peso. Implemente também o construtor padrão;

**b)**  Implemente os **métodos modificadores e de acesso** para os atributos desta classe.

**c)**  Implemente o **método String determinaCategoria().** Esse método deve retornar uma  **String** descrevendo a categoria do atleta de acordo com os seguintes parâmetros.
| Idade |Peso  |Categoria  |
|--|--|--|
| Até 12 anos | - | Infantil |
| 13 a 16 anos| até 40kg <br> acima de 40kg|Juvenil leve <br>Juvenil Pesado
|17 a 24 anos|até 45kg <br> de 45,001kg a 60kg <br> acima de 60kg|Senior leve<br>Senior médio<br> Senior pesado
|Acima de 24 anos| -|Veterano


**2)** Crie a classe  **TestaAtleta**. Essa classe contém apenas o método  **main**. Instancie um objeto do tipo Atleta, que recebe a idade e o peso do atleta informados pelo usuário. Após, imprima na tela qual a categoria que este atleta pertence.