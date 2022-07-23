/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiante;

/**
 *
 * @author camil
 */
public class Estudiante {

    /**
     * @param args the command line arguments
     */
    private String nombre;
    private String apellido;
    private double cal1;
    private double cal2;
    private double cal3;

    public Estudiante(String nombre, String apellido, double cal1, double cal2, double cal3) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cal1 = cal1;
        this.cal2 = cal2;
        this.cal3 = cal3;
    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerApellido(String c) {
        apellido = c;
    }

    public void establecerCal1(double c) {
        cal1 = c;
    }

    public void establecerCal2(double c) {
        cal2 = c;
    }

    public void establecerCal3(double c) {
        cal3 = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerCal1() {
        return cal1;
    }

    public double obtenerCal2() {
        return cal2;
    }

    public double obtenerCal3() {
        return cal3;
    }

    @Override
    public String toString() {

        String cadena = String.format(""
                + "%s %s\n"
                + "\tCalificaciones: \n"
                + "\t%.1f\n"
                + "\t%.1f\n"
                + "\t%.1f\n",
                obtenerNombre(),
                obtenerApellido(),
                obtenerCal1(),
                obtenerCal2(),
                obtenerCal3());

        return cadena;
    }

}
