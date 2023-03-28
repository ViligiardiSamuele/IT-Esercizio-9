package Esercizio.Ordine;

import Esercizio.Piatto;
import java.util.ArrayList;

public class Ordine {
    protected ArrayList<Piatto> piatti;

    public Ordine(){}

    public Ordine(ArrayList<Piatto> piatti) {
        this.piatti = new ArrayList<>();
    }
    public Ordine(Ordine ordine) {
        this.piatti = ordine.piatti;
    }

    public ArrayList<Piatto> getPiatti() {
        return piatti;
    }

    public void setPiatti(ArrayList<Piatto> piatti) {
        this.piatti = piatti;
    }

    public double getPrezzo(){
        double tot = 0;
        for(Piatto p : this.getPiatti())
            tot+=p.getPrezzo();
        return tot;
    }

    public boolean addPiatto(Piatto piatto){
        return this.piatti.add(piatto);
    }

    public boolean delPiatto(Piatto piatto){
        for(Piatto i : this.piatti)
            if(piatto == i)
                return this.piatti.remove(i);
        return false;
    }

}