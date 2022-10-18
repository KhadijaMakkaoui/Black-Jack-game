package com.game;

public class Banque extends Personne{
    public Banque(){
        super.setNom("Banque");
    }
    public void afficher_hand(){
        System.out.println("La main de la banque :");
        System.out.println(super.getHand().getCarteHand(0));
        System.out.println("La deuxieme carte est cachée");
    }
}
