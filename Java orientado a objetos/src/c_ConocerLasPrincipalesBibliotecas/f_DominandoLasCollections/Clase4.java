package c_ConocerLasPrincipalesBibliotecas.f_DominandoLasCollections;

import java.util.*;
import java.util.stream.Collectors;

public class Clase4 {

    public static final List<List<Integer>> listas = new ArrayList<List<Integer>>() {
        {
            add(new LinkedList<>());
            add(new ArrayList<>());
        }
    };

    public static void main(String[] args) {

        Curso curso1 = new Curso("Historia", 10);
        Curso curso2 = new Curso("Matemáticas", 20);
        Curso curso3 = new Curso("Física", 30);
        Curso curso4 = new Curso("Química", 40);
        Curso curso5 = new Curso("Biología", 50);

        ArrayList<Curso> cursos = new ArrayList<>();

        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        cursos.add(curso5);

        System.out.println(cursos);

        Collections.sort(cursos, Comparator.comparing(Curso::getNombre).reversed());

        int tiempo = 0;
        for (Curso curso : cursos) {
            tiempo += curso.getTiempo();
        }

        System.out.println(tiempo);

        List<Curso> cursoList = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Geometría")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());

        // Sumando los tiempos de los cursos
        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).sum());
        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).average());
        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).min());
        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).max());

        Map<String, List<Curso>> groupCurso = cursos.stream().collect(Collectors.groupingBy(Curso::getNombre));

        groupCurso.forEach((key, value) -> System.out.println(key + " " + value));

        cursos.parallelStream().mapToInt(Curso::getTiempo).sum();

    }

}
