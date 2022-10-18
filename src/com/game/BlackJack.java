package com.game;

public class BlackJack {
    private Pioche pioche;
    private Pioche defausser;
    private Banque banque;
    private Joueur joueur;

    private int wins;
    private int losses;
    private int pushes;
    public BlackJack(){
       pioche =new Pioche(true);

       defausser=new Pioche();

       //creer les personnes
        banque=new Banque();
        joueur=new Joueur();

    }
    private void creer_tour(){
        //donner deux cartes a la banque
        banque.getHand().ajouter_cart_hand(pioche);
        banque.getHand().ajouter_cart_hand(pioche);
        //donner deux cartes au joueur
        joueur.getHand().ajouter_cart_hand(pioche);
        joueur.getHand().ajouter_cart_hand(pioche);

    }

}
