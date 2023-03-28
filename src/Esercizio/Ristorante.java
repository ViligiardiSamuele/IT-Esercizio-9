package Esercizio;

import Esercizio.Ordine.Ordine;
import Esercizio.Ordine.Ordine_Domicilio;
import Esercizio.Ordine.Ordine_Tavolo;

import java.nio.file.attribute.PosixFileAttributes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Ristorante {
    protected ArrayList<Piatto> menu;
    protected ArrayList<Ordine> ordini;

    public Ristorante(){
        this.menu = new ArrayList<>();
        this.ordini = new ArrayList<>();
    }
    public Ristorante(ArrayList<Piatto> menu, ArrayList<Ordine> ordini) {
        this.menu = menu;
        this.ordini = ordini;
    }

    public ArrayList<Piatto> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<Piatto> menu) {
        this.menu = menu;
    }

    public ArrayList<Ordine> getOrdini() {
        return ordini;
    }

    public void setOrdini(ArrayList<Ordine> ordini) {
        this.ordini = ordini;
    }

    public boolean addPiatto(Piatto piatto){
        return this.menu.add(piatto);
    }

    public boolean delPiatto(Piatto piatto){
        for(Piatto i : this.menu)
            if(piatto == i)
                return this.menu.remove(i);
        return false;
    }

    public boolean addOrdine(Ordine ordine){
        return this.ordini.add(ordine);
    }

    public boolean delOrdine(Ordine ordine){
        for(Ordine i : this.ordini)
            if(ordine == i)
                return this.ordini.remove(i);
        return false;
    }

    public ArrayList<Piatto> piattiOrdinati (String tipo){
        ArrayList<Piatto> piattiStessoTipo = new ArrayList<>();
        for(Piatto p : this.menu)
            if(p.getTipo().equals(tipo)) piattiStessoTipo.add(p);
        if(!piattiStessoTipo.isEmpty()){
            Piatto scambio;
            for(int i = 1; i < piattiStessoTipo.size(); i++){
                if(piattiStessoTipo.get(i).getPrezzo() > piattiStessoTipo.get(i+1).getPrezzo()){
                    scambio = piattiStessoTipo.get(i);
                    piattiStessoTipo.set(i, piattiStessoTipo.get(i+1));
                    piattiStessoTipo.set(i+1, scambio);
                }
            }
        }
        return piattiStessoTipo;
    }

    public ArrayList<Ordine_Tavolo> ordiniOrdinatiTavoli(String nomeCameriere){
        ArrayList<Ordine_Tavolo> ordiniCameriere = new ArrayList<>();
        for(Ordine o : this.ordini)
            if(o instanceof Ordine_Tavolo)
                if(((Ordine_Tavolo) o).getNomeCameriere().equals(nomeCameriere))
                    ordiniCameriere.add((Ordine_Tavolo) o);
        if(!ordiniCameriere.isEmpty()){
            Ordine_Tavolo scambio;
            for(int i = 1; i < ordiniCameriere.size(); i++){
                if(ordiniCameriere.get(i).getNumeroTavolo() > ordiniCameriere.get(i+1).getNumeroTavolo()){
                    scambio = ordiniCameriere.get(i);
                    ordiniCameriere.set(i, ordiniCameriere.get(i+1));
                    ordiniCameriere.set(i+1, scambio);
                }
            }
        }
        return ordiniCameriere;
    }

    public ArrayList<Ordine_Domicilio> ordiniOrdinatiConsegna(){
        ArrayList<Ordine_Domicilio> domicilioOrdinati = new ArrayList<>();
        for(Ordine o : this.ordini)
            if(o instanceof Ordine_Domicilio)
                domicilioOrdinati.add((Ordine_Domicilio) o);
        if(!domicilioOrdinati.isEmpty()){
            Ordine_Domicilio scambio;
            for(int i = 1; i < domicilioOrdinati.size(); i++){
                if(domicilioOrdinati.get(i).getOraConsegna().after(domicilioOrdinati.get(i+1).getOraConsegna())){
                    scambio = domicilioOrdinati.get(i);
                    domicilioOrdinati.set(i, domicilioOrdinati.get(i+1));
                    domicilioOrdinati.set(i+1, scambio);
                }
            }
        }
        return domicilioOrdinati;
    }
}