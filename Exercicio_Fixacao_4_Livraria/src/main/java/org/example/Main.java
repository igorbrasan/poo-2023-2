package org.example;

import java.util.ArrayList;

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

class Livraria{
    private String nome, cnpj;
    private ArrayList<Livro> livros;

    public Livraria() {
    }

    public boolean Comprarlivro(Livro livro, int quantidade){
        for (livro:
             livros) {

        }
        return true;
    }
}

class Livro {
    private String titulo, autorPrincipal, area;
    private boolean preco;
    private int estoque;

    public Livro(String titulo, String autorPrincipal, String area, boolean preco) {
        this.titulo = titulo;
        this.autorPrincipal = autorPrincipal;
        this.area = area;
        this.preco = preco;
        this.estoque = 0;
    }

    public Livro(String titulo, String autorPrincipal, boolean preco) {
        this.titulo = titulo;
        this.autorPrincipal = autorPrincipal;
        this.area = "Multidisciplinar";
        this.preco = preco;
        this.estoque = 0;
    }
}


