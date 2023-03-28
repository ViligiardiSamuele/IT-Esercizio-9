package Esercizio.Ordine;

import Esercizio.Piatto;

import java.util.ArrayList;

public class Ordine_Tavolo extends Ordine {
    protected int numeroTavolo;
    protected String nomeCameriere;
    protected double prezzoTotale;

    public Ordine_Tavolo(ArrayList<Piatto> piatti, int numeroTavolo, String nomeCameriere) {
        super(piatti);
        this.numeroTavolo = numeroTavolo;
        this.nomeCameriere = nomeCameriere;
    }

    public Ordine_Tavolo(int numeroTavolo, String nomeCameriere) {
        super(new ArrayList<>());
        this.numeroTavolo = numeroTavolo;
        this.nomeCameriere = nomeCameriere;
    }

    public int getNumeroTavolo() {
        return numeroTavolo;
    }

    public void setNumeroTavolo(int numeroTavolo) {
        this.numeroTavolo = numeroTavolo;
    }

    public String getNomeCameriere() {
        return nomeCameriere;
    }

    public void setNomeCameriere(String nomeCameriere) {
        this.nomeCameriere = nomeCameriere;
    }
}