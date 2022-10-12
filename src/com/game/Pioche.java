package com.game;

import java.util.ArrayList;
import java.util.List;

public class Pioche {
    Carte carte;
    private List<Carte> pioche=new ArrayList<>();
    public void ajouterCarte(Carte carte){
        pioche.add(carte);
    }

    @Override
    public String toString() {
        return "Pioche{" +
                "\npioche=" + pioche +
                "}";
    }
}
