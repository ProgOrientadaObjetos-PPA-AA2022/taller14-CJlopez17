/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajador;

import java.sql.Statement;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author camil
 */
public class Enlace {
    
    private Connection conn;
       
    public void establecerConexion() {  

        try {  
            // db parameters  
            String url = "jdbc:sqlite:bd/base001.db";  
            // create a connection to the database  
            conn = DriverManager.getConnection(url);  
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  
              
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }   
        
    } 
    
    public Connection obtenerConexion(){
        return conn;
    }
    
    public void insertarTrabajador(Trabajador c) {  
  
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO Trabajadores (cedula, nombres, correo, sueldo, mes)"
                    + "values (%s, '%s', '%s', '%s', '%s')",
                    c.getCedula(), 
                    c.getNombre(),
                    c.getCorreo(),
                    c.getSueldo(),
                    c.getMesSueldo());
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception: insertarTrabajador");
             System.out.println(e.getMessage());  
             
        }  
    }
    
    public ArrayList<Trabajador> obtenerDataTrabajador() {  
        ArrayList<Trabajador> lista = new ArrayList<>();
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from base001;";
            
            ResultSet rs = statement.executeQuery(data);
            while(rs.next()){
                Trabajador t = new Trabajador(rs.getString("cedula"),
                rs.getString("nombres"),rs.getString("correo"),rs.getDouble("sueldo"),
                rs.getString("mes"));
                lista.add(t);
            }
            
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception: obtenerTrabajador");
             System.out.println(e.getMessage());  
             
        }  
        return lista;
    }
}
