package com.game;

public enum SuiteCouleur {
    CARREAUX(1,"Rouge","Carreaux"),
    COEUR(2,"Rouge","Coeur"),
    PIQUE(3,"Noir","Pique"),
    TREFLE(4,"Noir","Carreaux");
    final int num;
    final String nom;
    String Couleur;

    SuiteCouleur(int num, String couleur, String nom) {
        this.num = num;
        this.nom = nom;
        Couleur = couleur;
    }

    @Override
    public String toString() {
        return
                ""+ num ;
    }
}
