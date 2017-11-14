/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Random;

/**
 *
 * @author csnd2340
 */
public class Cercle extends Polygone {

    private Point[] points;
    public double rayon;

    public Cercle() {
        points = new Point[1];
        Random alea = new Random();
        rayon = alea.nextInt(20)-10;
    }
    
    public Cercle(Point p1,double r){
       rayon = r;
       points = new Point[1];
       points[0] = p1;
               
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

     public Point getPoint(int index) {
        return points[index];
    }

    public void setPoint( int index, Point point1) {
        points[index] = point1;
    }

    public double perimetre() {
        return 2 * Math.PI * rayon;
    }
    
    public double aire(){
        return Math.PI * rayon * rayon;
    }
    
    public boolean estValide(){
        return true;
    }

    @Override
    public String toString() {
        return "Cercle{" + "points=" + points + ", rayon=" + rayon + '}';
    }
    
    
}
