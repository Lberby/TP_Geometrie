/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Laura
 */
public class Carre extends Polygone {
    private Point[] points;
    
    public Carre(){
        points = new Point[4];
        for(int i=0;i<points.length;i++)
        {
            points[i] = new Point();
                    
        }
         
    }
    
    public Carre(Point p1,Point p2, Point p3, Point p4){
         points = new Point[4];
        points[0] = p1;
        points[1] = p2; 
        points[2] = p3;
        points[3] = p4;
    }

    public Point getPoint(int index) {
        return points[index];
    }

    public void setPoint( int index, Point point1) {
        points[index] = point1;
    }

    public double longueur(){
        Segment segment1 = new Segment( points[0],points[1]);
        
        return segment1.longueur();
    }
    
    public double aire(){
        Segment segment1 = new Segment( points[0],points[1]);
      
        
        return segment1.longueur() * segment1.longueur();
    }
    
    public double perimetre(){
        Segment segment1 = new Segment( points[0],points[1]);
    
        return segment1.longueur()*4;
    }

    @Override
    public String toString() {
        return "Carre{" + "points=" + points + '}';
    }
    
   
    
    
}
