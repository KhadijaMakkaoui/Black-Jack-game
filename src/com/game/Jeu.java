package com.game;

public class Jeu {
    public static void main(String[] args) {
        System.out.println("-------------------Welcome to Blackjack---------------------");
        BlackJack bj=new BlackJack();
        Pioche p=new Pioche(true);
        p.ajouterCarte(new Carte(SuiteCouleur.PIQUE,Point.ACE_MAX));
        p.ajouterCarte(new Carte(SuiteCouleur.PIQUE,Point.ACE_MAX));
        p.ajouterCarte(new Carte(SuiteCouleur.PIQUE,Point.ACE_MAX));
        p.ajouterCarte(new Carte(SuiteCouleur.PIQUE,Point.ACE_MAX));
        Hand hand=new Hand();
        hand.ajouter_cart_hand(p);
        hand.ajouter_cart_hand(p);
        hand.ajouter_cart_hand(p);
        System.out.println("Hand now has a value of:");
        System.out.println(hand.total_cartes());


    }
}
