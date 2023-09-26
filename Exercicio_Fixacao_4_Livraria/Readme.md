Observação: Nesta Lista, usar ArrayList e Iterator.

1) Uma livraria deseja automatizar os pedidos de livro e as consultas dos clientes ao
estoque. Uma livraria é caracterizada pelo nome, cnpj e possui uma lista dos livros que
vende. Por sua vez, um livro tem título, um autor principal, área, um preço e uma qtd em
estoque. O dono da livraria deseja:
    ● Adicionar livros passados livros com todos os dados e estoque zero.
    ● Adicionar livros passados livros com todos os dados, exceto a área e estoque zero. Considerar que a área será multidisciplinar.
    ● Registrar a compra de exemplares de um livro. Neste caso é passado o título do livro e a quantidade comprada. Caso o livro esteja na lista, a qtd comprada é adicionada a qtd em estoque e retorna-se true. Caso o livro não seja encontrado, retorne-se false.
    ● Vendedores podem consultar informações dos livros no momento da venda. É passado o nome do vendedor e título do livro. Quando o livro é encontrado na lista retorna-se uma mensagem com o título, preço e qtd em estoque. Caso a quantidade de estoque seja zero, é enviada a seguinte mensagem : " Sem estoque, deseja fazer pedido de novos exemplares?". Caso o livro não conste na lista a mensagem de retorno é " Título não faz parte do nosso catálogo".
    ● Mensalmente o sistema deve emitir uma listagem com todas as informações dos livros e um total da quantidade de todos os livros que possuem estoque.