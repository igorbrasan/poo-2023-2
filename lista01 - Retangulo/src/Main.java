// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //CRIANDO UM QUADRADO
       Retangulo quadrado = new Retangulo(1);
       double ladoQuadrado = 1;
       quadrado.setLargura(ladoQuadrado);
       quadrado.setComprimento(ladoQuadrado);
        System.out.println(quadrado.area());
        System.out.println(quadrado.perimetro());
        System.out.println(quadrado.diagonal());

                System.out.println("-------------------------------------------");
        //criando um retangulo
        Retangulo rect = new Retangulo(4,3);
        System.out.println(rect.perimetro());
        System.out.println(rect.area());
        System.out.println(rect.diagonal());

    }
}