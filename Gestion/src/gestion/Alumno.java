/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

/**
 *
 * @author UCA40420
 */
public class Alumno {
    private String Nombre;
    private String TipoDoc;
    private String NumDoc;
    private String TipoBeca;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getTipoDoc() {
        return TipoDoc;
    }

    public void setTipoDoc(String TipoDoc) {
        if (TipoDoc.equals("DNI") || TipoDoc.equals("Carnet de Extranjería")){
            this.TipoDoc = TipoDoc;
            }else {
            System.out.println("El tipo de documento no es correcto");
            }
    }

    public String getNumDoc() {
        return NumDoc;
    }

    public void setNumDoc(String NumDoc) {
        if(TipoDoc.equals("DNI"))
        if(NumDoc.length()==8){
        this.NumDoc = NumDoc;
        }
        else{
        System.out.println("El DNI debe tener 8 dígitos");
        }
        else if(TipoDoc.equals("RT"))
        if(NumDoc.length()==11){
        this.NumDoc = NumDoc;
        }
        else{
        System.out.println("El Carnet de Extranjería debe tener 11 dígitos");
        }
    }

    public String getTipoBeca() {
        return TipoBeca;
    }

    public void setTipoBeca(String TipoBeca) {
        this.TipoBeca = TipoBeca;
    }

   
    public void verDatos() {
        System.out.println("Nombre: "+this.Nombre+
                " \nTipo Doc: "+this.TipoDoc+
                " \nTipo Beca: "+ this.TipoBeca);
    }
}
