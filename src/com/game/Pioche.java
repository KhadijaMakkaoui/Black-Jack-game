package com.game;

import java.util.ArrayList;
import java.util.List;

public class Pioche {
    Carte carte;
    private  List<Carte> pioche=new ArrayList<>();
    private  List<Carte> pioche_melanger=new ArrayList<>();

    public Pioche(boolean isShuffled) {
        Carte.creer_cartes(pioche);
        if (isShuffled)
            Carte.melanger_carte(pioche);


    }
    public Pioche() {
    }

    public void ajouterCarte(Carte carte){
        pioche.add(carte);
    }


    @Override
    public String toString() {
        return "Pioche{" +
                "\n" + pioche +
                "}";
    }

    public Carte piocher_n_carte() {
        //avoir une copiede la premiere carte
        Carte cate=new Carte(pioche.get(0));

        pioche.remove(0);
        return cate;


    }
}
