// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Voo BrasilBulgaria = new Voo("25/09/2023", "14:50", 98);
        Thread.sleep(1); //sempre dar ao menos um millisegundo para o identificador ser diferente...
        Voo ItaliaLondres = new Voo("25/09/2023", "14:51", 98);
        System.out.println("Atualmente há " + BrasilBulgaria.getPassageiros() + " passageiros.");
        System.out.println("O identificador de Voo é: " + BrasilBulgaria.identificador);
        System.out.println("A data do voo é: " + BrasilBulgaria.getDiamesano());
        System.out.println("Sua tentativa de comprar passagem resultou em: " + BrasilBulgaria.comprarPassagem());
        System.out.println("Atualmente há " + BrasilBulgaria.getPassageiros() + " passageiros.");
    }
}