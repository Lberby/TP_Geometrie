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
public class Segment {
    private Point[] points;

    
    public Segment(){
        points = new Point[2];
        for(int i=0;i<points.length;i++)
        {
            points[i] = new Point();
                    
        }               
    }
    
    public Segment(Point p1,Point p2){
        points = new Point[2];
        points[0] = p1;
        points[1] = p2;     
    }

    public Point[] getPoints() {
        return points;
    }

    public void setPoint( int index, Point point1) {
        points[index] = point1;
    }
    
    
    
    public double longueur(){
         
        double a = Math.abs((( points[1].getX() - points[0].getX())*(points[1].getX() + points[0].getX())));
        double b = Math.abs((( points[1].getY() - points[0].getY())*(points[1].getY() + points[0].getY())));
        double longueur = Math.abs(Math.sqrt(a + b));
        return longueur;
    }
    

    public boolean estParallele(Segment s) 
    {
        double coef1 = Math.abs((points[1].getY() - points[0].getY())  / (points[1].getX() - points[0].getX()));
        double coef2 = Math.abs((s.points[1].getY() - s.points[0].getY())/(s.points[1].getX() - s.points[0].getX()));
        
        
        if (coef1 == coef2) 
        {
            return true;
        } 
        else 
        {
            return false;
        }
    }
    
    public boolean estPerpendiculaire(Segment s)
    {
        double vec1 = (points[1].getX() - points[0].getX());
        double vec2 = (points[1].getY() - points[0].getY());
        
        double vec3 = (s.points[1].getX() - s.points[0].getX());
        double vec4 = (s.points[1].getY() - s.points[0].getY());
        
        if(((vec1 * vec3) + (vec2 * vec4)) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
                
    }
    
    public double aire(){
        return 0;
    }
    
    public double perimetre(){
        return 2*this.longueur();
    }

    @Override
    public String toString() {
        return "Segment{" + "points=" + points + '}';
    }
   
    
   
   
    
    
}