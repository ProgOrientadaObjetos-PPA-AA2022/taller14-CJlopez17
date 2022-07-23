/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiante;

import java.util.ArrayList;
/**
 *
 * @author camil
 */
public class OperacionesEstuadiante {

    private ArrayList<Estudiante> lista = new ArrayList<>();
    private double promedio;

    public OperacionesEstuadiante (ArrayList<Estudiante> e){
        lista = e;
    }

    public void establecerLista(ArrayList<Estudiante> lista) {
        this.lista = lista;
    }

    public void establecerPromedio(Estudiante e) {
        promedio = (e.obtenerCal1() + e.obtenerCal2() + e.obtenerCal3()) / 3;
    }

    public ArrayList<Estudiante> obtenerLista() {
        return lista;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String cadena = "";
        for (int i = 0; i < obtenerLista().size(); i++) {
            establecerPromedio(obtenerLista().get(i));
            cadena = String.format("%s%s\tPromedio: %.2f\n\n",
                    cadena,
                    obtenerLista().get(i),
                    obtenerPromedio());
        }
        return cadena;
    }
}
