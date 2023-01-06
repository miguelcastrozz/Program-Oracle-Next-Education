package c_ConocerLasPrincipalesBibliotecas.f_DominandoLasCollections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Clase2 {

    public static void imprimir(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {

        ArrayList<Curso> cursos = new ArrayList<>();

        Curso curso4 = new Curso("Cálculo", 40);
        Curso curso5 = new Curso("Física", 40);
        Curso curso6 = new Curso("Química", 40);

        cursos.add(new Curso("Álgebra", 20));
        cursos.add(new Curso("Geometría", 30));
        cursos.add(new Curso("Trigonometría", 10));
        cursos.add(curso4);
        cursos.add(curso5);
        cursos.add(curso6);

        imprimir(cursos);

        // Ordena la lista de cursos por el nombre de cada curso
        cursos.sort(Comparator.comparing(Curso::getNombre));
        imprimir(cursos);

        // Ordena la lista de cursos por el nombre de cada curso en orden inverso
        cursos.sort(Comparator.comparing(Curso::getNombre).reversed());
        imprimir(cursos);

        // Ordena la lista de cursos por el tiempo de cada curso, stream tiene que retornar una lista nueva esto es por eso que se usa collect
        List<Curso> cursoLista = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Geometría")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());
        imprimir(cursoLista);

        /* Collections.sort(cursos, Collections.reverseOrder());
        System.out.println(cursos); */

    }

}

class Curso {

    private String nombre;
    private int tiempo;

    public Curso(String nombre, int tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombre='" + nombre + '\'' +
                ", tiempo=" + tiempo +
                '}';
    }

}
