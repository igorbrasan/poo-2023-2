
/**
 * Escreva uma descrição da classe ContaBancariaSimplificada aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ContaBancariaSimplificada
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private double saldo;
    private String nomeDoCorrentista;
    private boolean contaEEspecial;

    /**
     * Construtor para objetos da classe ContaBancariaSimplificada
     */
    public ContaBancariaSimplificada(/* )
 {
         inicializa variáveis de instância
      saldo = 0;
       nomeDoCorrentista = "";
       contaEEspecial = false;
   }

   public void abreConta(*/String nome, double deposito, boolean eEspecial)
    {
        nomeDoCorrentista = nome;
        saldo = deposito;
      contaEEspecial = eEspecial;        
 }
    
    public void abreContaSimples(String nome)
    {
        nomeDoCorrentista = nome;
        saldo = 0;
        contaEEspecial = false;
    }
    
    public void deposita(double valor)
    {
        saldo = saldo + valor;
    }

    public void retira(double valor)
    {
        if(contaEEspecial == false)
        {
          if( valor <= saldo)
          {
            saldo = saldo - valor;  
            }else {
                      System.out.println("Saldo Insuficiente.");
                    }
        } else {
            saldo = saldo - valor;
        }

    }
    
    public String mostraDados()
    {
        System.out.println("O nome do correntista é " + nomeDoCorrentista);
        System.out.println("O saldo do correntista é " + saldo);
        if(contaEEspecial){ System.out.println("A conta é especial.");
        }
        return "";
    }
}

