package org.example;

import java.util.Currency;

public class Revista extends Livro{
    private String periodicidade;
    private double precofinal;

    public Revista(String periodicidade) {
        this.periodicidade = periodicidade;
    }

    public Revista(String titulo, String editora, Double preco, String periodicidade) {
        super(titulo, editora, preco);
        this.periodicidade = periodicidade;
        this.precofinal = aplicaImposto(preco);

    }
    public double aplicaImposto(Double preco) {
        return preco*1.1;

    }
    @Override
    public String toString(){
        return("Título:" + super.getTitulo() + ". Preço original: " + super.getPreco() + ". Imposto: 10%. Preço final: " + precofinal);
    }
    public String getPeriodicidade() {
        return periodicidade;
    }
    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }
}
