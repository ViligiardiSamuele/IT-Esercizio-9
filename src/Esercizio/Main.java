package Esercizio;

import Esercizio.Ordine.Ordine_Domicilio;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Ristorante ristorante1 = new Ristorante();
        Piatto piatto1 = new Piatto("Pasta","Primo");
        Ingrediente ingrediente1 =  new Ingrediente("Pesto",1,2.5);
        piatto1.addIngrediente(ingrediente1);
        ristorante1.addPiatto(piatto1);
        Ordine_Domicilio od1 = new Ordine_Domicilio("Via di casa mia, 21",new Date(2022,1,1,20,10,59),12.45);
        ristorante1.addOrdine(od1);

    }
}