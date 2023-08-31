import .Math;
/**
 * Escreva uma descrição da classe Triangulo aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Triangulo
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio;
    private double lado1, lado2, lado3;

    /**
     * Construtor para objetos da classe Triangulo
     */
    public Triangulo(double lado1,double lado2, double lado3)
    {
        // inicializa variáveis de instância
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
   
    public void Tirangulo(double lado1,double lado2, double lado3)
    {
        // inicializa variáveis de instância
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public boolean eEquilatero()
    {
        // escreva seu código aqui
        return lado1 == lado2 && lado2 == lado3;
    }
    
    public double perimetro()
    {
        // inicializa variáveis de instância
        return (lado1 + lado2 + lado3);
    }
}
