public class Impressora {
    private String fabricante, modelo, tecnologia;
    private int capacidade, velocidade;

    private Impressora(String fabricante, String modelo, String tecnologia, int capacidade, int velocidade){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.tecnologia = tecnologia;
        this.capacidade = capacidade;
        this.velocidade = velocidade;
    }
    public Impressora(String fabricante, String modelo, String tecnologia, int velocidade){
        this(fabricante, modelo, tecnologia, 0, velocidade);
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int tempoImpressao(int paginas){
        int capacidade = this.capacidade;
        int tempo = 999999999;
        if(capacidade>paginas) {
             tempo = paginas / velocidade;
        }
        return (tempo);
        }

    public String imprimir(String texto){
        this.capacidade--;
        return texto;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}
