package com.game;

public class Carte {
    private SuiteCouleur suite;
    private Point hauteur;

    public Carte(SuiteCouleur suite, Point hauteur) {
        this.suite = suite;
        this.hauteur = hauteur;
    }

    public SuiteCouleur getSuite() {
        return suite;
    }

    public void setSuite(SuiteCouleur suite) {
        this.suite = suite;
    }

    public Point getHauteur() {
        return hauteur;
    }

    public void setHauteur(Point hauteur) {
        this.hauteur = hauteur;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "suite=" + suite +
                ", hauteur=" + hauteur +
                '}';
    }
}
