/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javametrie;

import Model.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Babs
 */
public class MainRentree {

    public void run() throws IOException {
        String nom = "";
        String prenom = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Votre nom : ");
        nom = sc.nextLine();
        System.out.print("Votre prenom : ");
        prenom = sc.nextLine();
        int nbTest = 0;
        int nbTestSuccess = 0;
        BufferedWriter writer;
        /*
            Le fichier est envoyé sur le disque Réception, vous ne pouvez pas réécrire sur ce fichier une fois qu'il a été crée
            Commentez la ligne ci-dessous, décommentez celle suivante et mettez un chemin approprié
         */
        //String filename = "Y:/Thouverez/Javametrie/" + nom + "_" + prenom + ".txt";
        String filename = "C:/Users/csnd2340/Documents/Berby_Laura.jpg" + nom + "_" + prenom + ".txt";

        System.out.println(filename);
        writer = new BufferedWriter(new FileWriter(new File(filename), true));
        writer.write(nom + " " + prenom + "\n\n");

        // Point
        try {
            nbTest++;
            Point p = new Point();
            System.out.println("+ Point: Classe Point ok");
            writer.write("+ Point: Classe Point ok\n");
            nbTestSuccess++;
        } catch (Exception e) {
            System.out.println("- Point: Pas de classe");
            writer.write("- Point: Pas de classe\n");
        }

        //Constructeurs
        try {
            nbTest++;
            Point p = new Point(7.5, -8.2);
            System.out.println("+ Point: Point(double, double) ok");
            writer.write("+ Point: Point(double, double) ok\n");
            nbTestSuccess++;
        } catch (Exception e) {
            System.out.println("- Point: Pas de constructeur Point(double, double)");
            writer.write("- Point: Pas de constructeur Point(double, double)\n");
        }

        try {
            nbTest++;
            Point p = new Point("P1", 7.5, -8.2);
            System.out.println("+ Point: Point(String, double, double) ok");
            writer.write("+ Point: Point(String, double, double) ok\n");
            nbTestSuccess++;
        } catch (Exception e) {
            System.out.println("- Point: Pas de constructeur Point(String, double, double)");
            writer.write("- Point: Pas de constructeur Point(String, double, double)\n");
        }

        // Getters
        try {
            nbTest++;
            Point p = new Point(7.5, -8.2);
            double x = p.getX();
            if (x == 7.5) {
                System.out.println("+ Point: getter sur X ok");
                writer.write("+ Point: getter sur X ok\n");
                nbTestSuccess++;
            } else {
                System.out.println("- Point: getter sur X mauvais");
                writer.write("- Point: getter sur X mauvais\n");
            }
        } catch (Exception e) {
            System.out.println("- Point: Pas de getter sur X");
            writer.write("- Point: Pas de getter sur X\n");
        }

        try {
            nbTest++;
            Point p = new Point(7.5, -8.2);
            double y = p.getY();
            if (y == -8.2) {
                System.out.println("+ Point: getter sur Y ok");
                writer.write("+ Point: getter sur Y ok\n");
                nbTestSuccess++;
            } else {
                System.out.println("- Point: getter sur Y mauvais");
                writer.write("- Point: getter sur Y mauvais\n");
            }
        } catch (Exception e) {
            System.out.println("- Point: Pas de getter sur Y");
            writer.write("- Point: Pas de getter sur Y\n");
        }

        try {
            nbTest++;
            Point p = new Point("p1", 7.5, -8.2);
            String s = p.getNom();
            if ("p1".equals(s)) {
                System.out.println("+ Point: getter sur nom ok");
                writer.write("+ Point: getter sur nom ok\n");
                nbTestSuccess++;
            } else {
                System.out.println("- Point: getter sur nom mauvais");
                writer.write("- Point: getter sur nom mauvais\n");
            }
        } catch (Exception e) {
            System.out.println("- Point: Pas de getter sur nom");
            writer.write("- Point: Pas de getter sur nom\n");
        }

        try {
            nbTest++;
            Point p = new Point(7.5, -8.2);
            int s = p.getNumero();
            System.out.println("+ Point: Getter sur numero ok");
            writer.write("+ Point: Getter sur numero ok\n");
            nbTestSuccess++;
        } catch (Exception e) {
            System.out.println("- Point: Pas de getter sur numero");
            writer.write("- Point: Pas de getter sur numero\n");
        }

        // Setters
        try {
            nbTest++;
            Point p = new Point(7.5, -8.2);
            p.setX(9.56);
            double x = p.getX();
            if (x == 9.56) {
                System.out.println("+ Point: setter sur X ok");
                writer.write("+ Point: setter sur X ok\n");
                nbTestSuccess++;
            } else {
                System.out.println("- Point: setter sur X mauvais");
                writer.write("- Point: setter sur X mauvais\n");
            }
        } catch (Exception e) {
            System.out.println("- Point: Pas de setter sur X");
            writer.write("- Point: Pas de setter sur X\n");
        }

        try {
            nbTest++;
            Point p = new Point(7.5, -8.2);
            p.setY(-12.5);
            double y = p.getY();
            if (y == -12.5) {
                System.out.println("+ Point: setter sur Y ok");
                writer.write("+ Point: setter sur Y ok\n");
                nbTestSuccess++;
            } else {
                System.out.println("- Point: setter sur Y mauvais");
                writer.write("- Point: setter sur Y mauvais\n");
            }
        } catch (Exception e) {
            System.out.println("- Point: Pas de setter sur Y");
            writer.write("- Point: Pas de setter sur Y\n");
        }

        try {
            nbTest++;
            Point p = new Point("p2", 7.5, -8.2);
            p.setNom("p2");
            String s = p.getNom();
            if ("p2".equals(s)) {
                System.out.println("+ Point: setter sur nom ok");
                writer.write("+ Point: setter sur nom ok\n");
                nbTestSuccess++;
            } else {
                System.out.println("- Point: setter sur nom mauvais");
                writer.write("- Point: setter sur nom mauvais\n");
            }
        } catch (Exception e) {
            System.out.println("- Point: Pas de setter sur nom");
            writer.write("- Point: Pas de setter sur nom\n");
        }

        try {
            nbTest++;
            Point p = new Point(7.5, -8.2);
            int s = p.setNumero(7);
            System.out.println("- Point: Setter sur numero ne doit pas exister");
            writer.write("- Point: Setter sur numero ne doit pas exister\n");
        } catch (Exception e) {
            System.out.println("+ Point: Pas de setter sur numero");
            writer.write("+ Point: Pas de setter sur numero\n");
            nbTestSuccess++;
        }

        // toString
        try {
            nbTest++;
            Point p = new Point("p2", 7.5, -8.2);
            String s = p.toString();
            System.out.println("+ Point: toString ok");
            writer.write("+ Point: toString ok\n");
            nbTestSuccess++;
        } catch (Exception e) {
            System.out.println("- Point: Pas de toString");
            writer.write("- Point: Pas de toString\n");
        }

        // Segment
        try {
            nbTest++;
            Segment s = new Segment();
            System.out.println("+ Segment: Classe Segment ok");
            writer.write("+ Segment: Classe Segment ok\n");
            nbTestSuccess++;
        } catch (Exception e) {
            System.out.println("- Segment: pas de classe");
            writer.write("- Segment: pas de classe\n");
        }

        try {
            nbTest++;
            Point p1 = new Point(2.5, 5.5);
            Point p2 = new Point(5.5, 5.5);
            Segment s = new Segment(p1, p2);
            System.out.println("+ Segment: Segment(Point, Point) ok");
            writer.write("+ Segment: Segment(Point, Point) ok\n");
            nbTestSuccess++;
        } catch (Exception e) {
            System.out.println("- Point: Pas de constructeur Segment(Point, Point)");
            writer.write("- Point: Pas de constructeur Segment(Point, Point)\n");
        }

        // Parallele
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(3, 0);
            Segment s1 = new Segment(p1, p2);
            Point p3 = new Point(2, 2);
            Point p4 = new Point(-5, 11);
            Segment s2 = new Segment(p3, p4);
            boolean r = s1.estParallele(s2);
            if (!r) {
                System.out.println("+ Segment:  estParallele(Segment) 0 ok");
                writer.write("+ Segment:  estParallele(Segment) 0 ok\n");
                nbTestSuccess++;
            } else {
                System.out.println("- Segment:  estParallele(Segment) 0 mauvais");
                writer.write("- Segment:  estParallele(Segment) 0 mauvais\n");
            }
        } catch (Exception e) {
            System.out.println("- Segment: Pas de methode estParallele(Segment)");
            writer.write("- Segment: Pas de methode estParallele(Segment)\n");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(3, 0);
            Segment s1 = new Segment(p1, p2);
            Point p3 = new Point(2, 2);
            Point p4 = new Point(-5, 2);
            Segment s2 = new Segment(p3, p4);
            boolean r = s1.estParallele(s2);
            if (r) {
                System.out.println("+ Segment:  estParallele(Segment) 1 ok");
                writer.write("+ Segment:  estParallele(Segment) 1 ok\n");
                nbTestSuccess++;
            } else {
                System.out.println("- Segment:  estParallele(Segment) 1 mauvais");
                writer.write("- Segment:  estParallele(Segment) 1 mauvais\n");
            }
        } catch (Exception e) {
            System.out.println("- Segment: Pas de methode estParallele(Segment)");
            writer.write("- Segment: Pas de methode estParallele(Segment)\n");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 6);
            Segment s1 = new Segment(p1, p2);
            Point p3 = new Point(2, 2);
            Point p4 = new Point(2, 0);
            Segment s2 = new Segment(p3, p4);
            boolean r = s1.estParallele(s2);
            if (r) {
                System.out.println("+ Segment:  estParallele(Segment) 2 ok");
                writer.write("+ Segment:  estParallele(Segment) 2 ok\n");
                nbTestSuccess++;
            } else {
                System.out.println("- Segment:  estParallele(Segment) 2 mauvais");
                writer.write("- Segment:  estParallele(Segment) 2 mauvais\n");
            }
        } catch (Exception e) {
            System.out.println("- Segment: Pas de methode estParallele(Segment)");
            writer.write("- Segment: Pas de methode estParallele(Segment)\n");
        }
        try {
            nbTest++;
            Point p1 = new Point(2.5, 5.5);
            Point p2 = new Point(5.5, 7.5);
            Segment s1 = new Segment(p1, p2);
            Point p3 = new Point(8, 1);
            Point p4 = new Point(14, 5);
            Segment s2 = new Segment(p3, p4);
            boolean r = s1.estParallele(s2);
            if (r) {
                System.out.println("+ Segment:  estParallele(Segment) 3 ok");
                writer.write("+ Segment:  estParallele(Segment) 3 ok\n");
                nbTestSuccess++;
            } else {
                System.out.println("- Segment:  estParallele(Segment) 3 mauvais");
                writer.write("- Segment:  estParallele(Segment) 3 mauvais\n");
            }
        } catch (Exception e) {
            System.out.println("- Segment: Pas de methode estParallele(Segment)");
            writer.write("- Segment: Pas de methode estParallele(Segment)\n");
        }

        // Perpendiculaire
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(5, 0);
            Segment s1 = new Segment(p1, p2);
            Point p3 = new Point(5, -2);
            Point p4 = new Point(0, 12);
            Segment s2 = new Segment(p3, p4);
            boolean r = s1.estPerpendiculaire(s2);
            if (!r) {
                System.out.println("+ Segment:  estPerpendiculaire(Segment) 0 ok");
                writer.write("+ Segment:  estPerpendiculaire(Segment) 0 ok\n");
                nbTestSuccess++;
            } else {
                System.out.println("- Segment:  estPerpendiculaire(Segment) 0 mauvais");
                writer.write("- Segment:  estPerpendiculaire(Segment) 0 mauvais\n");
            }
        } catch (Exception e) {
            System.out.println("- Segment: Pas de methode estPerpendiculaire(Segment)");
            writer.write("- Segment: Pas de methode estPerpendiculaire(Segment)\n");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(5, 0);
            Segment s1 = new Segment(p1, p2);
            Point p3 = new Point(0, 0);
            Point p4 = new Point(0, 12);
            Segment s2 = new Segment(p3, p4);
            boolean r = s1.estPerpendiculaire(s2);
            if (r) {
                System.out.println("+ Segment:  estPerpendiculaire(Segment) 1 ok");
                writer.write("+ Segment:  estPerpendiculaire(Segment) 1 ok\n");
                nbTestSuccess++;
            } else {
                System.out.println("- Segment:  estPerpendiculaire(Segment) 1 mauvais");
                writer.write("- Segment:  estPerpendiculaire(Segment) 1 mauvais\n");
            }
        } catch (Exception e) {
            System.out.println("- Segment: Pas de methode estPerpendiculaire(Segment)");
            writer.write("- Segment: Pas de methode estPerpendiculaire(Segment)\n");
        }
        try {
            nbTest++;
            Point p1 = new Point(2.5, 5.5);
            Point p2 = new Point(5.5, 8.5);
            Segment s1 = new Segment(p1, p2);
            Point p3 = new Point(8, 1);
            Point p4 = new Point(13, 6);
            Segment s2 = new Segment(p3, p4);
            boolean r = s1.estPerpendiculaire(s2);
            if (!r) {
                System.out.println("+ Segment:  estPerpendiculaire(Segment) 2 ok");
                writer.write("+ Segment:  estPerpendiculaire(Segment) 2 ok\n");
                nbTestSuccess++;
            } else {
                System.out.println("- Segment:  estPerpendiculaire(Segment) 2 mauvais");
                writer.write("- Segment:  estPerpendiculaire(Segment) 2 mauvais\n");
            }
        } catch (Exception e) {
            System.out.println("- Segment: Pas de methode estPerpendiculaire(Segment)");
            writer.write("- Segment: Pas de methode estPerpendiculaire(Segment)\n");
        }
        // Aire perimetre
        try {
            nbTest++;
            Point p1 = new Point(2.5, 5.5);
            Point p2 = new Point(5.5, 8.5);
            Segment s1 = new Segment(p1, p2);
            double r = s1.aire();
            System.out.println("+ Segment: aire() ok");
            writer.write("+ Segment: aire() ok\n");
            nbTestSuccess++;
        } catch (Exception e) {
            System.out.println("- Segment: Pas de methode aire()");
            writer.write("- Segment: Pas de methode aire()\n");
        }
        try {
            nbTest++;
            Point p1 = new Point(2.5, 5.5);
            Point p2 = new Point(5.5, 8.5);
            Segment s1 = new Segment(p1, p2);
            double r = s1.perimetre();
            System.out.println("+ Segment: perimetre() ok");
            writer.write("+ Segment: perimetre() ok\n");
            nbTestSuccess++;
        } catch (Exception e) {
            System.out.println("- Segment: Pas de methode perimetre()");
            writer.write("- Segment: Pas de methode perimetre()\n");
        }

        // toString
        try {
            nbTest++;
            Point p1 = new Point(2.5, 5.5);
            Point p2 = new Point(5.5, 8.5);
            Segment s1 = new Segment(p1, p2);
            String r = s1.toString();
            System.out.println("+ Segment: toString ok");
            writer.write("+ Segment: toString ok\n");
            nbTestSuccess++;
        } catch (Exception e) {
            System.out.println("- Segment: Pas de toString");
            writer.write("- Segment: Pas de toString\n");
        }
        // - Segment

        // Carre
        try {
            nbTest++;
            Carre c = new Carre();
            System.out.println("+ Carre: Classe Carre ok");
            writer.write("+ Carre: Classe Carre ok\n");
            nbTestSuccess++;
        } catch (Exception e) {
            System.out.println("- Carre: Pas de classe");
            writer.write("- Carre: Pas de classe\n");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 5);
            Point p3 = new Point(5, 5);
            Point p4 = new Point(5, 0);
            Carre c = new Carre(p1, p2, p3, p4);
            System.out.println("+ Carre: Carre(Point, Point, Point, Point) ok");
            writer.write("+ Carre: Carre(Point, Point, Point, Point) ok\n");
            nbTestSuccess++;
        } catch (Exception e) {
            System.out.println("- Carre: Pas de constructeur Carre(Point, Point, Point, Point)");
            writer.write("- Carre: Pas de constructeur Carre(Point, Point, Point, Point)\n");
        }
        // Getter
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 5);
            Point p3 = new Point(5, 5);
            Point p4 = new Point(5, 0);
            Carre c = new Carre(p1, p2, p3, p4);
            Point p = c.getPoint(1);
            System.out.println("+ Carre: Getter ok");
            writer.write("+ Carre: Getter ok\n");
            nbTestSuccess++;
        } catch (Exception e) {
            System.out.println("- Carre: Pas de getter");
            writer.write("- Carre: Pas de getter\n");
        }
        // Setter
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 5);
            Point p3 = new Point(5, 5);
            Point p4 = new Point(8, 0);
            Point p5 = new Point(5, 0);
            Carre c = new Carre(p1, p2, p3, p4);
            c.setPoint(3, p5);
            System.out.println("+ Carre: Setter ok");
            writer.write("+ Carre: Setter ok\n");
            nbTestSuccess++;
        } catch (Exception e) {
            System.out.println("- Carre: Pas de Setter");
            writer.write("- Carre: Pas de Setter\n");
        }
        // Aire perimetre
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 5);
            Point p3 = new Point(5, 5);
            Point p4 = new Point(5, 0);
            Carre c = new Carre(p1, p2, p3, p4);
            double r = c.aire();
            if (r == 25) {
                System.out.println("+ Carre: aire() ok");
                writer.write("+ Carre: aire() ok\n");
                nbTestSuccess++;
            } else {
                System.out.println("- Carre: aire() mauvais");
                writer.write("- Carre: aire() mauvais\n");
            }
        } catch (Exception e) {
            System.out.println("- Carre: Pas de methode aire()");
            writer.write("- Carre: Pas de methode aire()\n");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 5);
            Point p3 = new Point(5, 5);
            Point p4 = new Point(5, 0);
            Carre c = new Carre(p1, p2, p3, p4);
            double r = c.perimetre();
            if (r == 20) {
                System.out.println("+ Carre: perimetre() ok");
                writer.write("+ Carre: perimetre() ok\n");
                nbTestSuccess++;
            } else {
                System.out.println("- Carre: perimetre() mauvais");
                writer.write("- Carre: perimetre() mauvais\n");
            }
        } catch (Exception e) {
            System.out.println("- Carre: Pas de methode perimetre()");
            writer.write("- Carre: Pas de methode perimetre()\n");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 5);
            Point p3 = new Point(5, 5);
            Point p4 = new Point(5, 0);
            Carre c = new Carre(p1, p2, p3, p4);
            double r = c.longueur();
            if (r == 5) {
                System.out.println("+ Carre: longueur() ok");
                writer.write("+ Carre: longueur() ok\n");
                nbTestSuccess++;
            } else {
                System.out.println("- Carre: longueur() mauvais");
                writer.write("- Carre: longueur() mauvais\n");
            }
        } catch (Exception e) {
            System.out.println("- Carre: Pas de methode longueur()");
            writer.write("- Carre: Pas de methode longueur()\n");
        }

        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 5);
            Point p3 = new Point(5, 5);
            Point p4 = new Point(5, 0);
            Carre c = new Carre(p1, p2, p3, p4);
            String r = c.toString();
            System.out.println("+ Carre: toString ok");
            writer.write("+ Carre: toString ok\n");
            nbTestSuccess++;
        } catch (Exception e) {
            System.out.println("- Carre: Pas de toString");
            writer.write("- Carre: Pas de toString\n");
        }
        // - Carre

        // Rectangle
        try {
            nbTest++;
            Rectangle r = new Rectangle();
            System.out.println("+ Rectangle: Classe Rectangle ok");
            writer.write("+ Rectangle: Classe Rectangle ok\n");
            nbTestSuccess++;
        } catch (Exception e) {
            System.out.println("- Rectangle: Pas de classe");
            writer.write("- Rectangle: Pas de classe\n");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 7);
            Point p3 = new Point(3, 7);
            Point p4 = new Point(3, 0);
            Rectangle r = new Rectangle(p1, p2, p3, p4);
            System.out.println("+ Rectangle: Rectangle(Point, Point, Point, Point) ok");
            writer.write("+ Rectangle: Rectangle(Point, Point, Point, Point) ok\n");
            nbTestSuccess++;
        } catch (Exception e) {
            System.out.println("- Rectangle: Pas de constructeur Rectangle(Point, Point, Point, Point)");
            writer.write("- Rectangle: Pas de constructeur Rectangle(Point, Point, Point, Point)\n");
        }

        // Aire perimetre
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 7);
            Point p3 = new Point(3, 7);
            Point p4 = new Point(3, 0);
            Rectangle r = new Rectangle(p1, p2, p3, p4);
            double res = r.aire();
            if (res == 21) {
                System.out.println("+ Rectangle: aire() ok");
                writer.write("+ Rectangle: aire() ok\n");
                nbTestSuccess++;
            } else {
                System.out.println("- Rectangle: aire() mauvais");
                writer.write("- Rectangle: aire() mauvais\n");
            }
        } catch (Exception e) {
            System.out.println("- Rectangle: Pas de methode aire()");
            writer.write("- Rectangle: Pas de methode aire()\n");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 7);
            Point p3 = new Point(3, 7);
            Point p4 = new Point(3, 0);
            Rectangle r = new Rectangle(p1, p2, p3, p4);
            double res = r.perimetre();
            if (res == 20) {
                System.out.println("+ Rectangle: perimetre() ok");
                writer.write("+ Rectangle: perimetre() ok\n");
                nbTestSuccess++;
            } else {
                System.out.println("- Rectangle: perimetre() mauvais");
                writer.write("- Rectangle: perimetre() mauvais\n");
            }
        } catch (Exception e) {
            System.out.println("- Rectangle: Pas de methode perimetre()");
            writer.write("- Rectangle: Pas de methode perimetre()\n");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 7);
            Point p3 = new Point(3, 7);
            Point p4 = new Point(3, 0);
            Rectangle r = new Rectangle(p1, p2, p3, p4);
            double res = r.longueur();
            if (res == 7) {
                System.out.println("+ Rectangle: longueur() ok");
                writer.write("+ Rectangle: longueur() ok\n");
                nbTestSuccess++;
            } else {
                System.out.println("- Rectangle: longueur() mauvais");
                writer.write("- Rectangle: longueur() mauvais\n");
            }
        } catch (Exception e) {
            System.out.println("- Rectangle: Pas de methode longueur()");
            writer.write("- Rectangle: Pas de methode longueur()\n");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 7);
            Point p3 = new Point(3, 7);
            Point p4 = new Point(3, 0);
            Rectangle r = new Rectangle(p1, p2, p3, p4);
            double res = r.largeur();
            if (res == 3) {
                System.out.println("+ Rectangle: largeur() ok");
                writer.write("+ Rectangle: largeur() ok\n");
                nbTestSuccess++;
            } else {
                System.out.println("- Rectangle: largeur() mauvais");
                writer.write("- Rectangle: largeur() mauvais\n");
            }
        } catch (Exception e) {
            System.out.println("- Rectangle: Pas de methode largeur()");
            writer.write("- Rectangle: Pas de methode largeur()\n");
        }

        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 7);
            Point p3 = new Point(3, 7);
            Point p4 = new Point(3, 0);
            Rectangle r = new Rectangle(p1, p2, p3, p4);
            String res = r.toString();
            System.out.println("+ Rectangle: toString ok");
            writer.write("+ Rectangle: toString ok\n");
            nbTestSuccess++;
        } catch (Exception e) {
            System.out.println("- Rectangle: Pas de toString");
            writer.write("- Rectangle: Pas de toString\n");
        }
        // - Rectangle 

        // Losange
        try {
            nbTest++;
            Losange l = new Losange();
            System.out.println("+ Losange: Classe Losange ok");
            writer.write("+ Losange: Classe Losange ok\n");
            nbTestSuccess++;
        } catch (Exception e) {
            System.out.println("- Losange: Pas de classe");
            writer.write("- Losange: Pas de classe\n");
        }
        try {
            nbTest++;
            Point p1 = new Point(3, 0);
            Point p2 = new Point(0, 4);
            Point p3 = new Point(3, 8);
            Point p4 = new Point(6, 4);
            Losange l = new Losange(p1, p2, p3, p4);
            System.out.println("+ Losange: Losange(Point, Point, Point, Point) ok");
            writer.write("+ Losange: Losange(Point, Point, Point, Point) ok\n");
            nbTestSuccess++;
        } catch (Exception e) {
            System.out.println("- Losange: Pas de constructeur Losange(Point, Point, Point, Point)");
            writer.write("- Losange: Pas de constructeur Losange(Point, Point, Point, Point)\n");
        }

        // Aire perimetre
        try {
            nbTest++;
            Point p1 = new Point(3, 0);
            Point p2 = new Point(0, 4);
            Point p3 = new Point(3, 8);
            Point p4 = new Point(6, 4);
            Losange l = new Losange(p1, p2, p3, p4);
            double res = l.aire();
            if (res == 24) {
                System.out.println("+ Losange: aire() ok");
                writer.write("+ Losange: aire() ok\n");
                nbTestSuccess++;
            } else {
                System.out.println("- Losange: aire() mauvais");
                writer.write("- Losange: aire() mauvais\n");
            }
        } catch (Exception e) {
            System.out.println("- Losange: Pas de methode aire()");
            writer.write("- Losange: Pas de methode aire()\n");
        }
        try {
            nbTest++;
            Point p1 = new Point(3, 0);
            Point p2 = new Point(0, 4);
            Point p3 = new Point(3, 8);
            Point p4 = new Point(6, 4);
            Losange l = new Losange(p1, p2, p3, p4);
            double res = l.perimetre();
            if (res == 20) {
                System.out.println("+ Losange: perimetre() ok");
                writer.write("+ Losange: perimetre() ok\n");
                nbTestSuccess++;
            } else {
                System.out.println("- Losange: perimetre() mauvais");
                writer.write("- Losange: perimetre() mauvais\n");
            }
        } catch (Exception e) {
            System.out.println("- Losange: Pas de methode perimetre()");
            writer.write("- Losange: Pas de methode perimetre()\n");
        }
        try {
            nbTest++;
            Point p1 = new Point(3, 0);
            Point p2 = new Point(0, 4);
            Point p3 = new Point(3, 8);
            Point p4 = new Point(6, 4);
            Losange l = new Losange(p1, p2, p3, p4);
            double res = l.longueur();
            if (res == 5) {
                System.out.println("+ Losange: longueur() ok");
                writer.write("+ Losange: longueur() ok\n");
                nbTestSuccess++;
            } else {
                System.out.println("- Losange: longueur() mauvais");
                writer.write("- Losange: longueur() mauvais\n");
            }
        } catch (Exception e) {
            System.out.println("- Losange: Pas de methode longueur()");
            writer.write("- Losange: Pas de methode longueur()\n");
        }
        try {
            nbTest++;
            Point p1 = new Point(5, 0);
            Point p2 = new Point(0, 2);
            Point p3 = new Point(5, 4);
            Point p4 = new Point(10, 2);
            Losange l = new Losange(p1, p2, p3, p4);
            String res = l.toString();
            System.out.println("+ Losange: toString ok");
            writer.write("+ Losange: toString ok\n");
            nbTestSuccess++;
        } catch (Exception e) {
            System.out.println("- Losange: Pas de toString");
            writer.write("- Losange: Pas de toString\n");
        }
        // - Rectangle

        // Triangle
        try {
            nbTest++;
            Triangle t = new Triangle();
            System.out.println("+ Triangle: Classe Triangle ok");
            writer.write("+ Triangle: Classe Triangle ok\n");
            nbTestSuccess++;
        } catch (Exception e) {
            System.out.println("- Triangle: Pas de classe");
            writer.write("- Triangle: Pas de classe\n");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 4);
            Point p3 = new Point(3, 0);
            Triangle t = new Triangle(p1, p2, p3);
            System.out.println("+ Triangle: Triangle(Point, Point, Point) ok");
            writer.write("+ Triangle: Triangle(Point, Point, Point) ok\n");
            nbTestSuccess++;
        } catch (Exception e) {
            System.out.println("- Triangle: Pas de constructeur Triangle(Point, Point, Point)");
            writer.write("- Triangle: Pas de constructeur Triangle(Point, Point, Point)\n");
        }

        // Aire perimetre
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 4);
            Point p3 = new Point(3, 0);
            Triangle t = new Triangle(p1, p2, p3);
            double res = t.aire();
            if (res == 10) {
                System.out.println("+ Triangle: aire() ok");
                writer.write("+ Triangle: aire() ok\n");
                nbTestSuccess++;
            } else {
                System.out.println("- Triangle: aire() mauvais");
                writer.write("- Triangle: aire() mauvais\n");
            }
        } catch (Exception e) {
            System.out.println("- Triangle: Pas de methode aire()");
            writer.write("- Triangle: Pas de methode aire()\n");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 4);
            Point p3 = new Point(3, 0);
            Triangle t = new Triangle(p1, p2, p3);
            double res = t.perimetre();
            if (res == 12) {
                System.out.println("+ Triangle: perimetre() ok");
                writer.write("+ Triangle: perimetre() ok\n");
                nbTestSuccess++;
            } else {
                System.out.println("- Triangle: perimetre() mauvais");
                writer.write("- Triangle: perimetre() mauvais\n");
            }
        } catch (Exception e) {
            System.out.println("- Triangle: Pas de methode perimetre()");
            writer.write("- Triangle: Pas de methode perimetre()\n");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 3);
            Point p3 = new Point(3, 0);
            Triangle t = new Triangle(p1, p2, p3);
            boolean res = t.estIsocele();
            if (res) {
                System.out.println("+ Triangle: estIsocele() ok");
                writer.write("+ Triangle: estIsocele() ok\n");
                nbTestSuccess++;
            } else {
                System.out.println("- Triangle: estIsocele() mauvais");
                writer.write("- Triangle: estIsocele() mauvais\n");
            }
        } catch (Exception e) {
            System.out.println("- Triangle: Pas de methode estIsocele()");
            writer.write("- Triangle: Pas de methode estIsocele()\n");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 3);
            Point p3 = new Point(3, 0);
            Triangle t = new Triangle(p1, p2, p3);
            boolean res = t.estRectangle();
            if (res) {
                System.out.println("+ Triangle: estRectangle() ok");
                writer.write("+ Triangle: estRectangle() ok\n");
                nbTestSuccess++;
            } else {
                System.out.println("- Triangle: estRectangle() mauvais");
                writer.write("- Triangle: estRectangle() mauvais\n");
            }
        } catch (Exception e) {
            System.out.println("- Triangle: Pas de methode estRectangle()");
            writer.write("- Triangle: Pas de methode estRectangle()\n");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 3);
            Point p3 = new Point(3, 0);
            Triangle t = new Triangle(p1, p2, p3);
            boolean res = t.estEquilateral();
            if (!res) {
                System.out.println("+ Triangle: estEquilateral() ok");
                writer.write("+ Triangle: estEquilateral() ok\n");
                nbTestSuccess++;
            } else {
                System.out.println("- Triangle: estEquilateral() mauvais");
                writer.write("- Triangle: estEquilateral() mauvais\n");
            }
        } catch (Exception e) {
            System.out.println("- Triangle: Pas de methode estEquilateral()");
            writer.write("- Triangle: Pas de methode estEquilateral()\n");
        }
        try {
            nbTest++;
            Point p1 = new Point(0, 0);
            Point p2 = new Point(0, 4);
            Point p3 = new Point(3, 0);
            Triangle t = new Triangle(p1, p2, p3);
            String res = t.toString();
            System.out.println("+ Losange: toString ok");
            writer.write("+ Losange: toString ok\n");
            nbTestSuccess++;
        } catch (Exception e) {
            System.out.println("- Losange: Pas de toString");
            writer.write("- Losange: Pas de toString\n");
        }
        // - Rectangle

        System.out.println("Nombre total de tests: " + nbTest);
        writer.write("\nNombre total de tests: " + nbTest);
        System.out.println("Nombre total de tests passés: " + nbTestSuccess);
        writer.write("\nNombre total de tests passés: " + nbTestSuccess);
        System.out.println("Note sur 20 : " + (double) nbTestSuccess * 20 / nbTest);
        writer.write("\nNote sur 20 : " + (double) nbTestSuccess * 20 / nbTest);

        writer.close();
    }
}
