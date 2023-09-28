package org.example;

import java.util.ArrayList;
import java.util.Iterator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }
}

/**
 * Classe para representar a livraria(estoque de livros)
 */
class Livraria{
    private String nome, cnpj;
    private ArrayList<Livro> livros;

    /**
     * Construtor vazio
     */
    public Livraria() {
    }

    /**
     *Registrar a compra de exemplares de um livro. Neste caso é passado o título do
     * livro e a quantidade comprada. Caso o livro esteja na lista, a qtd comprada é
     * adicionada a qtd em estoque e retorna-se true. Caso o livro não seja encontrado,
     * retorne-se false.
     * @param titulo
     * @param quantidade
     * @return
     */
    public boolean Comprarlivro(String titulo, int quantidade){
        for (Iterator <Livro> it = livros.iterator(); it.hasNext() ;) {
            Livro elem = it.next();
            if(elem.getTitulo().equals(titulo)){
                elem.addtoEstoque(quantidade);
                return true;
            }else{
                return false;
            }
        }

    }

    /**
     * Vendedores podem consultar informações dos livros no momento da venda. É
     * passado o nome do vendedor e título do livro. Quando o livro é encontrado na
     * lista retorna-se uma mensagem com o título, preço e qtd em estoque. Caso a
     * quantidade de estoque seja zero, é enviada a seguinte mensagem : " Sem estoque,
     * deseja fazer pedido de novos exemplares?". Caso o livro não conste na lista a
     * mensagem de retorno é " Título não faz parte do nosso catálogo".
     * @param Vendedor
     * @param titulo
     * @return
     */
    public String consultar(String Vendedor, String titulo){
        for (Iterator <Livro> it = livros.iterator(); it.hasNext() ;) {
            Livro elem = it.next();
            if(elem.getTitulo().equals(titulo)){
                if(elem.getEstoque() == 0){
                    return("Sem estoque. Deseja fazer pedido de novos exemplares?");
                }else {
                    return (elem.getTitulo() + elem.getPreco() + elem.getEstoque());
                }
            } else {
                return ("Título não faz parte do nosso catálogo");
            }
        }
    }

    /**
     * Mensalmente o sistema deve emitir uma listagem com todas as informações dos
     * livros e um total da quantidade de todos os livros que possuem estoque.
     * @return
     */
    public String relatorioMensal(){
        System.out.println("Relatório mensal de estoque:");
        int quantidade = 0;
        for(Iterator<Livro>it = livros.iterator(); it.hasNext();){
            Livro elem = it.next();
            quantidade = quantidade + elem.getEstoque();
            System.out.println("Título = "+ elem.getTitulo());
            System.out.println("Autor = "+ elem.getAutorPrincipal());
            System.out.println("Área = "+ elem.getArea());
            System.out.println("Estoque = "+ elem.getEstoque());
            System.out.println("Preço = "+ elem.getPreco());
        }
        System.out.println("Estoque total de livros = " + quantidade);

        return ("Relatório Finalizado");
    }

}

/**
 * Classe Livro
 */
class Livro {
    private String titulo, autorPrincipal, area;
    private double preco;
    private int estoque;

    /**
     * Construtor de livro geral, com estoque zero.
     * @param titulo
     * @param autorPrincipal
     * @param area
     * @param preco
     */
    public Livro(String titulo, String autorPrincipal, String area, double preco) {
        this.titulo = titulo;
        this.autorPrincipal = autorPrincipal;
        this.area = area;
        this.preco = preco;
        this.estoque = 0;
    }

    /**
     * Construtor simplificado, com área fixada em Multidisciplinar.
     * @param titulo
     * @param autorPrincipal
     * @param preco
     */
    public Livro(String titulo, String autorPrincipal, double preco) {
        this.titulo = titulo;
        this.autorPrincipal = autorPrincipal;
        this.area = "Multidisciplinar";
        this.preco = preco;
        this.estoque = 0;
    }



    /**
     * Getters
     * @return
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Setter
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     *
     * @return
     */
    public String getAutorPrincipal() {
        return autorPrincipal;
    }

    /**
     *
     * @param autorPrincipal
     */
    public void setAutorPrincipal(String autorPrincipal) {
        this.autorPrincipal = autorPrincipal;
    }

    /**
     *
     * @return
     */
    public String getArea() {
        return area;
    }

    /**
     *
     * @param area
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     *
     * @return
     */
    public double getPreco() {
        return preco;
    }

    /**
     *
     * @param preco
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     *
     * @return
     */
    public int getEstoque() {
        return estoque;
    }

    /**
     * Incluir livros no estoque
     * @param quantidade
     */
    public void addtoEstoque(int quantidade) {
        this.estoque = this.estoque + quantidade;
    }
}


