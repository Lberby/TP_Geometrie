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
public class Rectangle extends Polygone{
   private Point[] points;
     
    
    
    public Rectangle(){
        points = new Point[4];
        for(int i=0;i<points.length;i++)
        {
            points[i] = new Point();
                    
        }
       
    }
    
    public Rectangle(Point p1,Point p2, Point p3, Point p4){
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
        Segment segment2 = new Segment(points[1],points[2]);
        
        
        double len =0;
        if(segment1.longueur()> segment2.longueur())
        {
            len = segment1.longueur();
        }
        return len;
    }
    
    public double largeur(){
        Segment segment1 = new Segment( points[0],points[1]);
        Segment segment2 = new Segment(points[1],points[2]);
        
        
        double larg =0;
        if(segment2.longueur()< segment1.longueur())
            
        {
            larg = segment2.longueur();
        }
        return larg;
    }
    
    public double aire(){
        Segment segment1 = new Segment( points[0],points[1]);
        Segment segment2 = new Segment(points[1],points[2]);
         
        
        return segment1.longueur() * segment2.longueur();
    }
    
    public double perimetre(){
        Segment segment1 = new Segment( points[0],points[1]);
        Segment segment2 = new Segment(points[1],points[2]);
        Segment segment3 = new Segment(points[2],points[3]);
        Segment segment4 = new Segment(points[3], points[0]);
        
        double long1 = segment1.longueur();
        double long2 = segment2.longueur();
        double long3 = segment3.longueur();
        double long4 = segment4.longueur();
        double res  = long1 + long2 + long3 + long4;
        
        return res;
        
    }
    
    public boolean estValide(){
        Segment s1 = new Segment(points[0], points[1]);
        Segment s2 = new Segment(points[1], points[2]);
        Segment s3 = new Segment(points[2], points[3]);
        Segment s4 = new Segment(points[3], points[0]);
        
        double long1 = s1.longueur();
        double long2 = s2.longueur();
        double long3 = s3.longueur();
        double long4 = s4.longueur();
         
       if((s1.estPerpendiculaire(s2)) && s3.estPerpendiculaire(s4) && (s2.estPerpendiculaire(s3))){
           if(long1 == long3 && long2 == long4 ){
               
               return true;
           }
       }
        
        return false;
       
    }

    @Override
    public String toString() {
        return "Rectangle{" + "points=" + points + '}';
    }
    
     
    
    
    
}
