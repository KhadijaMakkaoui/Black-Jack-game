package com.game;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    private List<Carte> cartesHand;
    public Hand(){
        cartesHand=new ArrayList<>();
    }
    public void ajouter_cart_hand(Pioche p){
        cartesHand.add(p.piocher_n_carte());
    }

    public int total_cartes(){
        int total=0;
        int aces=0;
        //Calculer la somme du total des carte
        for (Carte c: cartesHand) {
            total+=c.getHauteur().point;
            if (c.getHauteur().point==11)
                aces++;
        }
        if (total>21 && aces>0){
            aces--;
            total-=10;
        }
        return total;
    }
    @Override
    public String toString() {
        return "Hand{" +
                "cartesHand=" + cartesHand +
                '}';
    }
}
