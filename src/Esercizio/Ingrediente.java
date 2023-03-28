package Esercizio;

public class Ingrediente {
    protected String descrizione;
    protected int quantita;
    protected double prezzo;

    public Ingrediente() {}
    public Ingrediente(String descrizione, int quantita, double prezzo) {
        this.descrizione = descrizione;
        this.quantita = quantita;
        this.prezzo = prezzo;
    }

    public Ingrediente(Ingrediente ingrediente) {
        this.descrizione = ingrediente.descrizione;
        this.quantita = ingrediente.quantita;
        this.prezzo = ingrediente.prezzo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
}