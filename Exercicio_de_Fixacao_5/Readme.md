# Exercício de Fixação 5

Uma livraria precisa de um sistema para cadastrar seus títulos e informar aos vendedores os preços finais ao consumidor.

A livraria trabalha com títulos do tipo livros e revistas. Sabe-se que todo livro possui um nome, autor principal, editora, resumo e preço.

Existem livros que são didáticos. Para estes também é registrada a sua área (ex. informática, história, geografia, etc).

As revistas possuem um nome, editora, preço e periodicidade. Para o cenário acima, modelar a estrutura das classes e implementar em java.

### Construir os seguintes métodos:

 - métodos construtores;
 - método para consultar os dados dos títulos (entrada a referencia de um titulo);
 - um método para consultar o preço final dos títulos usando o conceito de polimorfismo. 
   - O método recebe a referência do título e retorna as informações na tela. 
   - Por conta do imposto sobre serviços ISS, o preço final deve ter um acréscimo de 
     - 10% para revistas, 
     - 10% para livros didáticos e 
     - 3% para Livro.  
   - A string deve conter as informações do 
     - título, 
     - o preço original, 
     - o valor do ISS e 
     - o preço final.
Construir uma classe aplicaçãoLivraria, que possua o nome da Livraria acessível para todas as instâncias de livros e revistas.

Construir um método que imprima todos os títulos da Livraria.