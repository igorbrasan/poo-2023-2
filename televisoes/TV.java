/**
 * Escreva uma descrição da classe TV aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class TV
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String marca, senha;
    private boolean ligada, smart;
    private int canal;

    /**
     * Construtor para objetos da classe TV
     */
    public TV(String marca)
    {
        this.marca = marca;
        this.senha = null;
        this.smart = false;
        this.ligada = false;
        this.canal = 0;
    }
    public TV(String marca, String senha)
    {
        this.marca = marca;
        this.senha = senha;
        this.smart = true;
        this.ligada = false;
        this.canal = 0;
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public boolean ligar()
    {
        return ligada = true;
    }

    public void mudaCanal(int canal){
        ligar();
        this.canal = canal;
    }
}
