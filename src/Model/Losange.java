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
public class Losange extends Polygone {

    private Point[] points;

    public Losange() {
        points = new Point[4];
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point();

        }

    }

    public Losange(Point p1, Point p2, Point p3, Point p4) {
        points = new Point[4];
        points[0] = p1;
        points[1] = p2;
        points[2] = p3;
        points[3] = p4;
    }

    public Point getPoint(int index) {
        return points[index];
    }

    public void setPoint(int index, Point point1) {
        points[index] = point1;
    }

    public double longueur() {
        Segment segment1 = new Segment(points[0], points[1]);

        return segment1.longueur();
    }

    public double perimetre() {

        Segment segment1 = new Segment(points[0], points[1]);
        Segment segment2 = new Segment(points[1], points[2]);
        Segment segment3 = new Segment(points[2], points[3]);
        Segment segment4 = new Segment(points[3], points[0]);

        /*System.out.println(points[0]);
        System.out.println(points[1]);
        System.out.println(points[2]);
        System.out.println(points[3]);*/
        double long1 = segment1.longueur();
        double long2 = segment2.longueur();
        double long3 = segment3.longueur();
        double long4 = segment4.longueur();
        /*System.out.println(long1);
        System.out.println(long2);
        System.out.println(long3);
        System.out.println(long4);*/

        double res = long1 * 4;

        return res;

    }

    public double aire() {
        Segment segment1 = new Segment(points[0], points[2]);
        Segment segment2 = new Segment(points[1], points[3]);

        return (segment1.longueur() * segment2.longueur()) / 2;
    }

    public boolean estValide() {
        Segment d1 = new Segment(points[0], points[2]);
        Segment d2 = new Segment(points[1], points[3]);

        Segment segment1 = new Segment(points[0], points[1]);
        Segment segment2 = new Segment(points[1], points[2]);
        Segment segment3 = new Segment(points[2], points[3]);
        Segment segment4 = new Segment(points[3], points[0]);

        double long1 = segment1.longueur();
        double long2 = segment2.longueur();
        double long3 = segment3.longueur();
        double long4 = segment4.longueur();

        if ((d1.estPerpendiculaire(d2))) {
            if (long1 == long2 && long2 == long3 && long3 == long4) {

                return true;
            }
        }

        return false;

    }

    @Override
    public String toString() {
        return "Losange{" + "points=" + points + '}';
    }

}
