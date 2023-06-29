/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        Ciudad c1 = new Ciudad("Cuenca");
        Ciudad c2 = new Ciudad("Loja");
        Ciudad c3 = new Ciudad("Quito");
        Ciudad c4 = new Ciudad("Zamora");

        Persona persona1 = new Persona("Rena", 39, c1);
        Persona persona2 = new Persona("Rena", 13, c2);
        Persona persona3 = new Persona("Santiago", 20, c3);
        Persona persona4 = new Persona("Kelvin", 19, c4);

        ArrayList<Persona> pr1 = new ArrayList<>();
        pr1.add(persona1);
        pr1.add(persona2);
        pr1.add(persona3);
        pr1.add(persona4);

        OperacionesEstudiantes op1 = new OperacionesEstudiantes();
        op1.establecerEstudiante(pr1);
        op1.establecerPromedioEdades();
        op1.establecerEdadMinima();
        op1.establecerEdadMaxima();
        op1.establecerListaCiudadesEstudiantes();

        System.out.printf("Promedio Edades: %.2f\n"
                + "Edad Mínima: %.0f\n"
                + "Edad Máxima: %.0f\n"
                + "Lista de las ciudades: %s\n",
                op1.obtenerPromedioEdades(),
                op1.obtenerEdadMinima(),
                op1.obtenerEdadMaxima(),
                op1.obtenerListaCiudadesEstudiantes());

    }
}
