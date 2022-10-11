package com.game;

public enum Point {
    ACE_MIN(1),
    ACE_MAX(11),
    DEUX(2),
    TROIS(3),
    QUATRE(4),
    CINQ(5),
    SIX(6),
    SEPT(7),
    HUIT(8),
    NEUF(9),
    DIX(10),
    VALET(11),
    DAME(12),
    ROI(13);
    int point;

    Point(int point) {
        this.point = point;
    }
}
