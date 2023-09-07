import java.lang.Math;
public class Retangulo {
    private double comprimento, largura;
     public Retangulo(double comprimento, double largura){
         if (comprimento <= 0 || largura <= 0) {
             throw new IllegalArgumentException("Comprimento e largura devem ser maiores que 0.");
         }
         this.comprimento = comprimento;
         this.largura = largura;
     }
     public Retangulo(double lado){
         if (lado <= 0) {
             throw new IllegalArgumentException("Lado deve ser maior que 0.");
         }
         this.comprimento = lado;
         this.largura = lado;
     }
     public double area(){
         return comprimento * largura;
     }

     public double perimetro(){
     return 2 * (comprimento + largura);
     }

     public double diagonal(){
         return Math.sqrt(Math.pow(comprimento, 2) + Math.pow(largura, 2));
     }


     //Getters e setters
    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        if (comprimento <= 0) {
            throw new IllegalArgumentException("Lado deve ser maior que 0.");
        }
        this.comprimento = comprimento;
    }

    public double getLargura () {
            return largura;
        }

    public void setLargura ( double largura){
        if (largura <= 0) {
            throw new IllegalArgumentException("Lado deve ser maior que 0.");
        }
           this.largura = largura;
    }
}