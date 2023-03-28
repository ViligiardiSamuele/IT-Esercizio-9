package Esercizio.Ordine;

import Esercizio.Piatto;

import java.util.ArrayList;
import java.util.Date;

public class Ordine_Domicilio extends Ordine {
    protected String indirizzo;
    protected Date oraConsegna;
    private double costoFisso;
    public Ordine_Domicilio() {}

    public Ordine_Domicilio(String indirizzo, double costoFisso) {
        this.indirizzo = indirizzo;
        this.oraConsegna = new Date();
        this.costoFisso = costoFisso;
    }
    public Ordine_Domicilio(String indirizzo, Date oraConsegna, double costoFisso) {
        this.indirizzo = indirizzo;
        this.oraConsegna = oraConsegna;
        this.costoFisso = costoFisso;
    }
    public Ordine_Domicilio(ArrayList<Piatto> piatti, String indirizzo, Date oraConsegna, double costoFisso) {
        super(piatti);
        this.indirizzo = indirizzo;
        this.oraConsegna = oraConsegna;
        this.costoFisso = costoFisso;
    }
    public Ordine_Domicilio(ArrayList<Piatto> piatti, String indirizzo, double costoFisso) {
        super(piatti);
        this.indirizzo = indirizzo;
        this.oraConsegna = new Date();
        this.costoFisso = costoFisso;
    }
    public Ordine_Domicilio(Ordine ordine, String indirizzo, double costoFisso) {
        super(ordine);
        this.indirizzo = indirizzo;
        this.oraConsegna = new Date();
        this.costoFisso = costoFisso;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public Date getOraConsegna() {
        return oraConsegna;
    }

    public void setOraConsegna(Date oraConsegna) {
        this.oraConsegna = oraConsegna;
    }

    @Override
    public double getPrezzo(){
        double tot = 0;
        for(Piatto p : this.getPiatti())
            tot+=p.getPrezzo();
        return tot + this.costoFisso;
    }
}