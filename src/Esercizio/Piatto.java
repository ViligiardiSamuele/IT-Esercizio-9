package Esercizio;

import java.util.ArrayList;

public class Piatto {
    protected String nome, tipo;
    protected ArrayList<Ingrediente> ingredienti;

    public Piatto() {
        this.ingredienti = new ArrayList<>();
    }
    public Piatto(String nome, String tipo, ArrayList<Ingrediente> ingredienti) {
        this.nome = nome;
        this.tipo = tipo;
        this.ingredienti = ingredienti;
    }
    public Piatto(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.ingredienti = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Ingrediente> getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(ArrayList<Ingrediente> ingredienti) {
        this.ingredienti = ingredienti;
    }

    public double getPrezzo(){
        double tot = 0;
        for(Ingrediente i : this.ingredienti)
            tot += i.getPrezzo();
        return tot;
    }

    public boolean addIngrediente(Ingrediente ingrediente){
        return this.ingredienti.add(ingrediente);
    }

    public boolean delIngrediente(Ingrediente ingrediente){
        for(Ingrediente i : this.ingredienti)
            if(ingrediente == i)
                return this.ingredienti.remove(i);
        return false;
    }

}