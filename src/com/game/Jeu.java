package com.game;

public class Jeu {
    public static void main(String[] args) {
        System.out.println("-------------------Welcome to Blackjack---------------------");
        Carte c=new Carte(SuiteCouleur.TREFLE,Point.DIX);
        System.out.println(c.toString());
    }
}
