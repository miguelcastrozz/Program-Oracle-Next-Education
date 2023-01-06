package c_ConocerLasPrincipalesBibliotecas.f_DominandoLasCollections;

import java.util.Comparator;
import java.util.Set;
import java.util.HashSet;

public class Clase5 {

    public static void main(String[] args) {

        String alumno1 = "Juan Perez";
        String alumno2 = "Karla Sanchez";
        String alumno3 = "Ricardo Torres";
        String alumno4 = "Fernanda Lopez";
        String alumno5 = "Arturo Gomez";

        // Set es una interfaz que no permite elementos duplicados y no mantiene ningún orden, HashSet es una clase que implementa la interfaz Set
        Set<String> listaAlumnos = new HashSet<>();

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);

        for (String alumno : listaAlumnos) {
            System.out.println("alumno = " + alumno);
        }

        boolean valida = listaAlumnos.contains("Ricardo Torres");
        listaAlumnos.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println(valida);

    }

}
