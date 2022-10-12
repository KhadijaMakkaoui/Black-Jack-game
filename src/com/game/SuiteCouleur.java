package com.game;

public enum SuiteCouleur {
    CARREAUX(13,"Rouge","Carreaux"),
    COEUR(13,"Rouge","Coeur"),
    PIQUE(13,"Noir","Pique"),
    TREFLE(13,"Noir","Carreaux");
    final int nombre_carte;
    final String nom;
    String Couleur;

    SuiteCouleur(int nombre_carte, String couleur, String nom) {
        this.nombre_carte = nombre_carte;
        this.nom = nom;
        Couleur = couleur;
    }

    @Override
    public String toString() {
        return "SuiteCouleur{" +
                "nombre_carte=" + nombre_carte +
                ", nom='" + nom + '\'' +
                ", Couleur='" + Couleur + '\'' +
                '}';
    }
}
