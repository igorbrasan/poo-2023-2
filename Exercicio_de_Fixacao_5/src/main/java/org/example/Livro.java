package org.example;


public class Livro {
    private String titulo, autor, editora, resumo;
    private Double preco, precofinal;

    /**
     * Empty constructor for testing purposes
     */
    public Livro() {
    }

    /**
     * Construtor para facilitar a vida de Revista
     * @param titulo
     * @param editora
     * @param preco
     */
    public Livro(String titulo, String editora, Double preco) {
        this.titulo = titulo;
        this.editora = editora;
        this.preco = preco;
    }

    /**
     * Construtor completo de Livro
     * @param titulo
     * @param autor
     * @param editora
     * @param resumo
     * @param preco
     */
    public Livro(String titulo, String autor, String editora, String resumo, Double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.resumo = resumo;
        this.preco = preco;
        this.precofinal = aplicaImposto(preco);
    }

    private double aplicaImposto(Double preco) {
        return preco*1.03;
    }

    public String toString(){
        return("Título:" + titulo + ". Preço original: " + preco + ". Imposto: 3%. Preço final: " + precofinal);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public double getPrecoFinal(){
        return precofinal;
    }
}

