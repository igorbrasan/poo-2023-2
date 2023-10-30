package org.example;

import java.util.Currency;

public class Livro {
    private String titulo, autor, editora, resumo;
    private Currency preco;

    /**
     * Empty constructor for testing purposes
     */
    public Livro() {
    }

    /**
     * Construtor completo de Livro
     * @param titulo
     * @param autor
     * @param editora
     * @param resumo
     * @param preco
     */
    public Livro(String titulo, String autor, String editora, String resumo, Currency preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.resumo = resumo;
        this.preco = preco;
    }
}

