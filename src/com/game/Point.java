package com.game;

public enum Point {
    ACE_MIN("Ace",1,1),
    ACE_MAX("Ace",11,1),
    DEUX("Deux",2,2),
    TROIS("Trois",3,3),
    QUATRE("Quatre",4,4),
    CINQ("Cinq",5,5),
    SIX("Six",6,6),
    SEPT("Sept",7,7),
    HUIT("Huit",8,8),
    NEUF("Neuf",9,9),
    DIX("Dix",10,10),
    VALET("Valet",10,11),
    DAME("Dame",10,12),
    ROI("Roi",10,13);
    final String nom;
    final int point;
    final int hauteur;

    Point(String nom,int point,int hauteur) {
        this.nom=nom;
        this.point = point;
        this.hauteur=hauteur;
    }

    @Override
    public String toString() {
        return "Point{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
