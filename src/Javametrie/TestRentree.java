/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javametrie;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Babs
 */
public class TestRentree {
    
    public void run() throws IOException {
        String nom = "";
        String prenom = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Votre nom : ");
        nom = sc.nextLine();
        System.out.print("Votre prenom : ");
        prenom = sc.nextLine();
        BufferedWriter writer;
//        String filename = MainRentree.class.getProtectionDomain().getCodeSource().getLocation().getPath()+nom + "_" + prenom + ".jpg";
        String filename = "Y:/Thouverez/Javametrie/" + nom + "_" + prenom + ".txt";
        
        System.out.println(filename);
        writer = new BufferedWriter(new FileWriter(new File(filename)));
        writer.write("coucou\n\n");
        writer.close();
    }
}
