
/**
 * Escreva uma descrição da classe professor aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class professor
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nomeDoProfessor, departamento, dataDeAdmissao;
    private int registro;
    

    /**
     * Construtor para objetos da classe professor
     */
    public professor(String nomeDoProfessor, String departamento, String dataDeAdmissao, int registro )
    {
        // inicializa variáveis de instância
        this.dataDeAdmissao = dataDeAdmissao;
        this.registro = registro;
        this.departamento = departamento;
        this.nomeDoProfessor = nomeDoProfessor;
        
    }
    
    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public professor(String nomeDoProfessor, String departamento, int registro)
    {
      this(nomeDoProfessor,departamento,"01/01/2009",registro);
    }
}
