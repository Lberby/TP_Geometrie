/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javametrie;

import java.io.IOException;

/**
 *
 * @author Laura
 */
public class TP_géometrie {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) throws IOException {
        /*Point A = new Point(0,3);
        Point B = new Point(3,9);
        Point C = new Point(0,3);
        Point D = new Point(3,9);
      
        
        Segment AB = new Segment(A,B);
        Segment BC = new Segment(B,C);
        Segment CA = new Segment(C,A);
        
        Segment CD = new Segment(C,D);
        
        Triangle t1 = new Triangle(A,B,C);
        
        Losange ABCD = new Losange();
        
        System.out.println("La longueur est :" + AB.longueur());
        System.out.println("La longueur est :" + CD.longueur());
        
        
        System.out.println("Parallèle :" + AB.estParallele(CD));
        System.out.println("Perpendiculaire :" + AB.estPerpendiculaire(CD));
      
        System.out.println("Isocele : " + t1.estIsocele());
        System.out.println("Equilateral : " + t1.estEquilateral());
        
        System.out.println("La longueur losange est :" + ABCD.longueurL());*/
        
        MainRentree mr = new MainRentree();
        mr.run();
    }
    
}