/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

import java.util.ArrayList;

/**
 *
 * @author UCA40420
 */
public class ControlAlumno {
    ArrayList<Alumno> lista_alumno = new ArrayList();
    public void agregarAlumno(Alumno a){
    lista_alumno.add(a);
    }
    public void listarAlumnos(){
        System.out.println("La lista de asistentes es: ");
        for(Alumno Alumno : lista_alumno){
        Alumno.verDatos();
        }
    }
}
