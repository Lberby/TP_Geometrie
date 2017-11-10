/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author csnd2340
 */
public class Cercle {

    private Point[] points;
    public int rayon;

    public Cercle() {
        points = new Point[1];
        rayon = 10;
    }
    
    

    public double périmètre() {
        return 2 * Math.PI * rayon;
    }
}
