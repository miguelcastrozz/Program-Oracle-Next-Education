package c_ConocerLasPrincipalesBibliotecas.f_DominandoLasCollections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Clase1 {

    public static void main(String[] args) {

        System.out.println("\nCREAR\n");

        String variable1 = "Ejemplo 1";
        String variable2 = "Ejemplo 2";
        String variable3 = "Ejemplo 3";
        String variable4 = "Ejemplo 4";

        ArrayList<String> lista = new ArrayList<>();

        lista.add(variable1);
        lista.add(variable4);
        lista.add(variable2);
        lista.add(variable3);
        System.out.println(lista);

        lista.remove(2);
        System.out.println(lista);

        lista.set(1, "Ejemplo alterado");
        System.out.println(lista);

        System.out.println(lista.size());

        System.out.println("\nLEER\n");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        for (String i : lista) {
            System.out.println(i);
        }

        lista.forEach(i -> {
            System.out.println(i);
        });

        System.out.println("\nCURSOS\n");

        String curso1 = "Geometría";
        String curso2 = "Álgebra";
        String curso3 = "Física";
        String curso4 = "Química";
        String curso5 = "Biología";

        ArrayList<String> cursos = new ArrayList<>();

        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        cursos.add(curso5);

        System.out.println(cursos);

        // Ascendentemente
        Collections.sort(cursos);
        System.out.println(cursos);

        // Descendentemente
        Collections.sort(cursos, Collections.reverseOrder());
        System.out.println(cursos);

        // Ascendentemente
        cursos.sort(Comparator.naturalOrder());
        System.out.println(cursos);

        // Descendentemente
        cursos.sort(Comparator.reverseOrder());
        System.out.println(cursos);

        // Ascendentemente
        List<String> cursosLista = cursos.stream().sorted().collect(Collectors.toList());

    }

}
