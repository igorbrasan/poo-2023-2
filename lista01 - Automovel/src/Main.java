// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Automovel automovel = new Automovel("gasolina", "ford", "ka");
        System.out.printf("Setando combustível como álcool");
        automovel.setCombustivel("alcool");
        automovel.combustivel();
        automovel.setCombustivel("flex");
        automovel.combustivel();

        System.out.printf("Hello and welcome!");
        }
    }
}
