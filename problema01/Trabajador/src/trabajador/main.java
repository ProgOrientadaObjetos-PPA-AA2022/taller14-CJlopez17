/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajador;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author camil
 */
public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Enlace c = new Enlace();
        
        boolean bandera = true; 
      
        while(bandera){
            System.out.println("Ingrese el Nombre del Trabajador: ");
            String nom = sc.nextLine();
            
            System.out.println("Ingrese la Cedula del Trabajador: ");
            String ced = sc.nextLine();
            
            System.out.println("Ingrese el Correo del Trabajador: ");
            String corr = sc.nextLine();
            
            System.out.println("Ingrese el Sueldo del Trabajador: ");
            double sul = sc.nextDouble();
            sc.nextLine();
            
            System.out.println("Ingrese el mes del Sueldo del Trabajador: ");
            String mesSul = sc.nextLine();
            
            Trabajador trap = new Trabajador(ced,nom,corr,sul,mesSul);
            System.out.println(trap);
            c.insertarTrabajador(trap);
            sc.nextLine();
            
            System.out.println("Ingrese S si desea ingresar otro trabajador o "
                    + "N si desea terminar");
            String er = sc.nextLine();
            
            if(er.equals("N")){
                bandera = false; 
                
            }
        }
    }
}
