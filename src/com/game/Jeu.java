package com.game;

public class Jeu {
    public static void main(String[] args) {
        System.out.println("-------------------Welcome to Blackjack---------------------");
        Carte c1=new Carte(SuiteCouleur.TREFLE,Point.DIX);
        Carte c2=new Carte(SuiteCouleur.CARREAUX,Point.ACE_MIN);
        Pioche p=new Pioche();
        p.ajouterCarte(c1);
        p.ajouterCarte(c2);
        System.out.println(p.toString());
    }
}
