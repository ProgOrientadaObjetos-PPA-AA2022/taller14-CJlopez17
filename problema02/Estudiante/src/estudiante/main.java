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
public class main {
    public static void main(String[] args) {
        Enlace e = new Enlace();
        OperacionesEstuadiante op = new OperacionesEstuadiante(e.obtenerDataEstudiante());
        System.out.println(op);
    }
   
}
