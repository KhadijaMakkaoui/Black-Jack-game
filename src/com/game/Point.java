package com.game;

public enum Point {
    ACE_MIN(1,1),
    ACE_MAX(11,1),
    DEUX(2,2),
    TROIS(3,3),
    QUATRE(4,4),
    CINQ(5,5),
    SIX(6,6),
    SEPT(7,7),
    HUIT(8,8),
    NEUF(9,9),
    DIX(10,10),
    VALET(10,11),
    DAME(10,12),
    ROI(10,13);
    final int point;
    final int hauteur;

    Point(int point,int hauteur) {
        this.point = point;
        this.hauteur=hauteur;
    }
}
