package c_ConocerLasPrincipalesBibliotecas.f_DominandoLasCollections;

import java.util.*;

public class Clase7 {

    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("Juan Perez", "001");
        Alumno alumno2 = new Alumno("Mario Cardenas", "002");
        Alumno alumno3 = new Alumno("Maria Lopez", "003");
        Alumno alumno4 = new Alumno("Ana Martinez", "004");
        Alumno alumno5 = new Alumno("Jose Sanchez", "005");
        Alumno alumno6 = new Alumno("Luis Garcia", "006");
        Alumno alumno7 = new Alumno("Luisa Garcia", "007");

        Collection<Alumno> listaAlumnos = new HashSet<>();

        Alumno alumnoNuevo = new Alumno("Juan Perez", "001");

        Curso3 curso1 = new Curso3("Historia", 1);

        curso1.addAlumno(alumno1);
        curso1.addAlumno(alumno2);
        curso1.addAlumno(alumno3);
        curso1.addAlumno(alumno4);
        curso1.addAlumno(alumno5);
        curso1.addAlumno(alumno6);
        curso1.addAlumno(alumno7);

        curso1.getAlumnos().forEach(System.out::println);

        // Iterators: Son objetos que nos permiten recorrer una colección de objetos

        Iterator<Alumno> alumnoIterator = curso1.getAlumnos().iterator();

        while (alumnoIterator.hasNext()) {
            System.out.println(alumnoIterator.next()); /* next: Devuelve el siguiente elemento de la colección */
        }

        curso1.getAlumnos().forEach(System.out::println);

    }

}
