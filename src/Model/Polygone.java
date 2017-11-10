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
    
    public Polygone(){
        this.num =0 ;
        this.nom = "";
    }
    
    public Polygone(java.lang.String nom){
        this.num =0;
        this.nom = nom;
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
