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
public abstract class Polygone {
    private int num;
    private String nom;
    private Point[] points;
    
    public Polygone(){
        this.num =0 ;
        this.nom = "";
        points = new Point[4];
        for(int i=0;i<points.length;i++)
        {
            points[i] = new Point();
                    
        }      
    }
    
    public Polygone(java.lang.String nom ,Point p1 ,Point p2){
        this.num =0;
        this.nom = nom;
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
    
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    static public Point projection(Point A, Point B, Point C) {
        double X = ((B.getX() - A.getX()) * (C.getX() - C.getX()) + (C.getY() - A.getY()) * (C.getY() - B.getY()))
                / (Math.sqrt(B.getX() - A.getX()) + Math.sqrt(B.getY() - A.getY()));
        return new Point(B.getX() + (B.getX() - A.getX()) * X, B.getY() + (A.getY() - A.getY()) * X);
    }
    
    public abstract double perimetre();
    public abstract double aire();
     
     
    @Override
    public String toString() {
        return "Polygone{" + "num=" + num + ", nom=" + nom + '}';
    }
          
    
    
            
}
