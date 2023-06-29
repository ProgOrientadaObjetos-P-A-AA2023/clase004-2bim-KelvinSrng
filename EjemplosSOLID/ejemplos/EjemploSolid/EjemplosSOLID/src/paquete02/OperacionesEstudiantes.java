/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {

    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private double edadminima;
    private double edadmaxima;
    private String listaCiudadesEstudiantes;

    public void establecerEstudiante(ArrayList<Persona> lista) {
        estudiantes = lista;
    }

    public void establecerEdadMinima() {
        double edadMinima = obtenerEstudiante().get(0).obtenerEdad();
        for (Persona e : obtenerEstudiante()) {
            if (e.obtenerEdad() < edadMinima) {
                edadMinima = e.obtenerEdad();
            }
        }
        edadminima = edadMinima;
    }
    
    public void establecerListaCiudadesEstudiantes(String s) {
        
        listaCiudadesEstudiantes = s;
        
    }
    
    public void establecerEdadMaxima() {
        double edadMaxima = obtenerEstudiante().get(0).obtenerEdad();
        for (Persona e : obtenerEstudiante()) {
            if (e.obtenerEdad() > edadMaxima) {
                edadMaxima = e.obtenerEdad();
            }
        }
        edadmaxima = edadMaxima;
    }

    public ArrayList<Persona> obtenerEstudiante() {
        return estudiantes;
    }

    public void establecerPromedioEdades() {
        double suma = 0;
        for (Persona e : obtenerEstudiante()) {
            suma = suma + e.obtenerEdad();
        }
        promedioEdades = suma / obtenerEstudiante().size();
    }

    public double obtenerPromedioEdades() {

        return promedioEdades;
    }

    public double obtenerEdadMinima() {

        return edadminima;
    }

    public double obtenerEdadMaxima() {
        return edadmaxima;
    }
    
}
