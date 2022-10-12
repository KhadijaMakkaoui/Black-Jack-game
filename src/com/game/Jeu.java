package com.game;

public class Jeu {
    public static void main(String[] args) {
        System.out.println("-------------------Welcome to Blackjack---------------------");
        Carte c1=new Carte(SuiteCouleur.TREFLE,Point.DIX);
        Carte c2=new Carte(SuiteCouleur.CARREAUX,Point.TROIS);
        Pioche p=new Pioche(true);

        System.out.println(p.toString());
    }
}
