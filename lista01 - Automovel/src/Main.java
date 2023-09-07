// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        float distancia = 654.98F;
        System.out.println("Criando automóvel ford ka com combustível gasolina");
        Automovel fordka = new Automovel("gasolina","ford", "ka");
        System.out.print("Retornando dados do veículo: ");
        System.out.println(fordka.combustivel());
        System.out.println(fordka.modelo());
        System.out.println(fordka.fabricante());
        System.out.println(String.valueOf(fordka.consumo(distancia)));
//whoah
        System.out.println("Criando automóvel VW gol com combustível alcool");
        Automovel vwGol = new Automovel("alcool", "vw", "gol");
        System.out.println(vwGol.combustivel());
        System.out.println(vwGol.modelo());
        System.out.println(vwGol.fabricante());
        System.out.println(String.valueOf(vwGol.consumo(distancia)));

        System.out.println("Hello and welcome!");
        }
    }

