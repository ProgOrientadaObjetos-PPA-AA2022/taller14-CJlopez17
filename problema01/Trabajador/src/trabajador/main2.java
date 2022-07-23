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
public class main2 {
 
    public static void main(String[] args) {
        Enlace c = new Enlace();
        
        for (int i = 0; i < c.obtenerDataTrabajador().size(); i++) {
            System.out.printf("%s\n", c.obtenerDataTrabajador().get(i));
        }
    }
}
