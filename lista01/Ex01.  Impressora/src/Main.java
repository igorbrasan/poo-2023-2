// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Impressora impressora = new Impressora("Epson", "l395", "Jato", 9);
        impressora.setCapacidade(50000);
        impressora.setFabricante("Teste");
        var tempo = impressora.tempoImpressao(500);
        System.out.println(impressora.getCapacidade());
        System.out.println("O tempo de impressão é " + tempo);
        System.out.println(impressora.imprimir("TextoTeste"));
        System.out.println(impressora.getCapacidade());

        }

}