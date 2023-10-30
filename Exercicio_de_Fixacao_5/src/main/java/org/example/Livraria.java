package org.example;

import java.util.ArrayList;

public class Livraria {
    public String nome;
    private String cnpj;
    private ArrayList<Livro> livros;

    public Livraria(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }
    public void addToLivros(Livro livro){
        livros.add(livro);
    }
    public String consultaPorTitulo(String titulo){
        String resultado = "";
        for (Livro livro:livros) {
            if(livro.getTitulo().equals(titulo)){
                resultado = livro.toString();
            }
        }
        if(resultado.equals("")){
            resultado = ("não encontrado.");
        }
        return resultado;
    }

    public String listaLivros(){
        for (Livro livro:
             livros) {
            System.out.println(livro.toString());

        }
    }
}
