import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       final float IVA = 0.22f;

       float Prezzo1, Prezzo2, Prezzo3;
       float SommaTotale;

       Scanner in = new Scanner(System.in);

       System.out.println("Inserisci il prezzo del primo prodotto:");
       Prezzo1 = in.nextFloat();

       SommaTotale = (Prezzo1 * IVA) + Prezzo1;

       System.out.println("Inserisci il prezzo del secondo prodotto:");
       Prezzo2 = in.nextFloat();

       SommaTotale = SommaTotale + (Prezzo2 * IVA) + Prezzo2;

       System.out.println("Inserisci il prezzo del terzo prodotto:");
       Prezzo3 = in.nextFloat();

       SommaTotale = SommaTotale + (Prezzo3 * IVA) + Prezzo3;

       System.out.printf("La somma totale da pagare è di: %.2f Euro + IVA", SommaTotale);

    }
}