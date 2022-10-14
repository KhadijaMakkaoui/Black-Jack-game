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

    @Override
    public String toString() {
        return "Hand{" +
                "cartesHand=" + cartesHand +
                '}';
    }
}
