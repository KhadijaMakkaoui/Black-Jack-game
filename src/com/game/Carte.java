package com.game;

import java.util.*;

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
    public static void creer_cartes(List pioche){
        List<Carte> list=new ArrayList<>();
        for (SuiteCouleur s:SuiteCouleur.values()){
            for (Point p : Point.values()){
                pioche.add(new Carte(s,p));
            }
        }
    }
    public static List melanger_carte(List listAMelanger){
        Collections.shuffle(listAMelanger);
        return listAMelanger;
    }
    public void generate_random(int min, int max){
        Random random=new Random();
    }

    @Override
    public String toString() {
        return "(" + hauteur +
                " " + suite +
                ')';
    }
}
