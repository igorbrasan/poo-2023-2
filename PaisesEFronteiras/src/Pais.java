import java.util.ArrayList;

public class Pais {

    /**
     * Classe País
     */
    private String nome;
    private String nomeCapital;
    private ArrayList<Pais> fronteiras;

    public Pais(String nome, String nomeCapital) {
        this.nome = nome;
        this.nomeCapital = nomeCapital;
        this.fronteiras = new ArrayList<Pais>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeCapital() {
        return nomeCapital;
    }

    public void setNomeCapital(String nomeCapital) {
        this.nomeCapital = nomeCapital;
    }

    public ArrayList<Pais> getFronteiras() {
        return fronteiras;
    }

    public void setFronteiras(ArrayList<Pais> fronteiras) {
        this.fronteiras = fronteiras;
    }

    public boolean addFronteiras(Pais pais) {
        if (pais != null) {
            fronteiras.add(pais);
            return true;
        } else {
            return false;
        }

    }





}
