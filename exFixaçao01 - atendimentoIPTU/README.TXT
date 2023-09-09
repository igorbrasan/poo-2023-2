----------------------------------------------------------------------------
Este é o arquivo README do projeto. Você deve descrever aqui o seu projeto.
Informe ao usuário (alguém que não sabe nada sobre este projeto!) tudo que
ele/ela precisa saber. Os comentários devem incluir, pelo menos:
------------------------------------------------------------------------

TÍTULO DO PROJETO:
OBJETIVO DO PROJETO:
VERSÃO ou DATA:
COMO INICIAR O PROJETO:
AUTORES:
INSTRUÇÕES PARA O USUÁRIO:

Exercício:
Programar uma solução em Java para o cenário abaixo. 
Verifique se existe ou não possibilidades de usar o conceito de sobrecarga.
Um programa de atendimento ao cidadão precisa cadastrar as pessoas que serão beneficiadas com a quitação de IPTU atrasados.
Para representar um beneficiário, os atributos necessários são: 
    nome, 
    RG, 
    CPF, 
    tipo de imóvel (casa, apartamento, etc...), 
    metro quadrado do imóvel, 
    valor da renda do beneficiário e 
    valor total dos débitos com o  IPTU. 

Para iniciar o cadastro de um beneficiário é preciso ao menos o nome e RG. 

Neste caso os outros dados são inicializados com valores default (e.g zero, null, etc);
Para obter o benefício é preciso completar o cadastro. 
É possível completar o cadastro incluindo todos os dados, ou em duas etapas:  
    (i)tipo de imóvel (casa, apartamento, etc...), metro quadrado do imóvel,
    (ii) valor da renda do beneficiário, valor total dos débitos com o  IPTU.
Para o cálculo do pagamento do  débito do IPTU pode-se optar pelo cálculo por  renda ou por cálculo por tamanho do imovel (sem parâmetros de entrada). 
Cálculo por renda: 10% de desconto para rendas até 5 mil reais e 5% para acima de 5 mil. 
Cálculo por m2: 10 reais para cada metro quadrado.