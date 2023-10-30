package org.example;

import java.util.Currency;

public class LivroDidatico extends Livro{
    private  CategoriaLivroDidatico categoria;
    private double precofinal;


    public LivroDidatico(String titulo, String autor, String editora, String resumo, Double preco, CategoriaLivroDidatico categoria) {
        super(titulo, autor, editora, resumo, preco);
        this.categoria = categoria;
        this.precofinal = aplicaImposto(preco);

    }
    public double aplicaImposto(Double preco) {
       return preco*1.1;

    }
@Override
    public String toString(){
    return("Título:" + super.getTitulo() + ". Preço original: " + super.getPreco() + ". Imposto: 10%. Preço final: " + precofinal);
    }

    public CategoriaLivroDidatico getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaLivroDidatico categoria) {
        this.categoria = categoria;
    }
}
