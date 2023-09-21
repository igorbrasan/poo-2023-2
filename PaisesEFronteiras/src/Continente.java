import java.util.ArrayList;

public class Continente {

    private String nome;
    private ArrayList<Pais> paises;

    public Continente(String nome) {
        this.nome = nome;
        this.paises = new ArrayList<Pais>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void AddPaises(Pais Pais) {
        paises.add(Pais);
    }

    public void adicionarFronteira(Pais p1, Pais p2) {
        p1.addFronteiras(p2);
        p2.addFronteiras(p1);
    }

    public void listaPaiseFronteiras() {

        for (Pais p : paises) {
            System.out.println("O pais " + p.getNome() + " tem as fronteiras:");
            ArrayList<Pais> fronteiras = p.getFronteiras();
            for (Pais f : fronteiras) {
                System.out.println(f.getNome());
            }
        }



        }

}
