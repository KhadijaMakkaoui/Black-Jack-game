package com.game;

import java.util.ArrayList;
import java.util.List;

public class Pioche {
    Carte carte;
    private  List<Carte> pioche=new ArrayList<>();

    public Pioche(boolean createCards) {
        if (createCards)
            Carte.creer_cartes(pioche);

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
}
