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
    public boolean avoir_blackBack(){
        if (this.getHand().total_cartes()==21)
            return true;
        else
            return false;
    }
    public abstract void afficher_hand();
    //{
       // System.out.println("La main du "+this.nom+" :");
        //System.out.println(this.hand +" , Sa valeur est : " +this.hand.total_cartes());
    //}

}
