/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.github;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class PracticaGithub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
     String cadena;
        boolean seguir;
        int con=0;
          Scanner sc=new Scanner(System.in);
   
        do
        {
            System.out.println("anota un caracter");
            char caracter=sc.nextLine().charAt(0);
            caracter=Character.toUpperCase(caracter);
            System.out.println("anota una cadena");
            cadena=sc.nextLine();
            cadena=cadena.toUpperCase();
            con=0;
            con = pepito(cadena, caracter);
            System.out.println("se han anotado: "+con+" veces el caracter: "+caracter);
            System.out.println("¿deseas escribir otra?");
            seguir=sc.nextBoolean();
            sc.nextLine();
        }
        while (seguir==true);
    }

    public static int pepito(String cadena, char caracter) {
        int con=0;
        for (int i=0;i<cadena.length();i++)
            if (cadena.charAt(i)==caracter)
                con++;
        return con;
    }
    
}
