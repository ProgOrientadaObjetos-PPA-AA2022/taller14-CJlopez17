/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajador;

/**
 *
 * @author camil
 */
public class Trabajador {

    private String cedula;
    private String nombre;
    private String correo;
    private double sueldo;
    private String mesSueldo;

    public Trabajador(String ced, String nom, String corr,
                      double suel, String mesSuel) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo = correo;
        this.sueldo = sueldo;
        this.mesSueldo = mesSueldo;
    }

    public void establecerCedula(String f){
        cedula = f;
    }
    public void establecerNombre(String f){
        nombre = f;
    }
    public void establecerCorreo(String f){
        correo = f;
    }
    public void establecerCedula(double f){
        sueldo = f;
    }
    public void establecerMesSueldo(String f){
        mesSueldo = f;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public String getMesSueldo() {
        return mesSueldo;
    }
    
    public String toString(){
        String cadena = String.format("Trabajador: \n"
                + "Nombre: \n%s"
                + "Cedula: \n%s"
                + "Correo: \n%s"
                + "Sueldo: \n%.2f"
                + "Mes del sueldo: \n%s",nombre, cedula, correo, sueldo, mesSueldo);
        return cadena; 
    }
}

