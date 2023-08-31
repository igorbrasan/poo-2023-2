
/**
 * Escreva uma descrição da classe Filme aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Filme
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nomeDoAtorPrincipal;
    private String nomeDoDiretor;
    private int anoLancamento;
    private int copiasDisponiveis;
    private boolean eNacional;

    /**
     * Construtor para objetos da classe Filme
     */
    public Filme()
    {
        // inicializa variáveis de instância
        nomeDoAtorPrincipal = "";
        nomeDoDiretor = "";
        anoLancamento = 0;
        copiasDisponiveis = 0;
        eNacional = false;
        
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public void cadastroFilme(String ator, String diretor, int ano, int copias, boolean nacional)
    {
        // escreva seu código aqui
        nomeDoAtorPrincipal = ator;
        nomeDoDiretor = diretor;
        anoLancamento = ano;
        copiasDisponiveis = copias;
        eNacional = nacional;
    }
}
