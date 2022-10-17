package com.game;

public abstract class Personne {
    private String nom;
    private Hand hand;

    public Personne() {
        this.nom = "";
        this.hand = new Hand();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }
    public boolean black_jack(){
        if (this.getHand().total_cartes()==21)
            return true;
        else
            return false;
    }

}
