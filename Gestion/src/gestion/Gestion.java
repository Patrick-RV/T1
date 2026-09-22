/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestion;

import java.util.Scanner;

/**
 *
 * @author UCA40420
 */
public class Gestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ControlAlumno c = new ControlAlumno();
        String rpta="si";
            while(rpta.equals("si"))
            {
                Alumno a = new Alumno();
                while(a.getTipoDoc() == null)
                {
                System.out.println("Ingrese el tipo de documento: (DNI / RT) ");
                a.setTipoDoc(sc.nextLine());
                }
                while(a.getNumDoc() == null)
                {
                System.out.println("Ingrese el número de documento: ");
                a.setNumDoc(sc.nextLine());
            }
                System.out.println("Ingrese Nombre: ");
                a.setNombre(sc.nextLine());
                System.out.println("Ingrese Tipo de Beca: (Parcial / Total)");
                a.setTipoBeca(sc.nextLine());
}
            
            

    }
    
}
