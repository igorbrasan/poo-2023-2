import java.util.*;


public class Main {
    public static void main(String[] args) {
        Pais p1 = new Pais("Brazil", "BSB");
        Pais p2 = new Pais("Argentina", "BuenosAires");
        Pais p3 = new Pais("Colombia", "La paz");
        Pais p4 = new Pais("Uruguay", "Curacao");
        Continente America = new Continente("SUDAMERICA");
        America.AddPaises(p1);
        America.AddPaises(p2);
        America.AddPaises(p3);
        America.AddPaises(p4);
        America.adicionarFronteira(p1,p2);
        America.adicionarFronteira(p2,p3);
        America.adicionarFronteira(p3,p4);
        America.adicionarFronteira(p4,p1);
        America.listaPaiseFronteiras();
        
    }
}