package c_ConocerLasPrincipalesBibliotecas.f_DominandoLasCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// TODO: Arreglar clases
public class Clase3 {

    public static final List<List<Integer>> listas = new ArrayList<List<Integer>>() {
        {
            add(new LinkedList<>());
            add(new ArrayList<>());
        }
    };

    public static void main(String[] args) {

        for (List<Integer> lista : listas) {
            final String nombreImplementacion = lista.getClass().getSimpleName();
            // Add
            long inicio = System.currentTimeMillis();
            for (int i = 0; i < 1000000; i++) {
                lista.add(i);
            }
            long fin = System.currentTimeMillis();
            System.out.println(nombreImplementacion + " add: " + (fin - inicio) + " ms");
            // Get
            inicio = System.currentTimeMillis();
            for (int i = 0; i < 1000000; i++) {
                lista.get(i);
            }
            fin = System.currentTimeMillis();
            System.out.println(nombreImplementacion + " get: " + (fin - inicio) + " ms");
            // Remove
            inicio = System.currentTimeMillis();
            for(int i = 99999; i >= 0; i--){
                lista.remove(i);
            }
            fin = System.currentTimeMillis();
            System.out.println(nombreImplementacion + " remove: " + (fin - inicio) + " ms");
        }

        Curso2 curso1 = new Curso2("Java", 30);
//        curso1.addAula(new Aula("List"));
//        curso1.addAula(new Aula("ArrayList"));
//        curso1.addAula(new Aula("LinkedList"));
//        curso1.addAula(new Aula("Inmutable"));

//        List<Aula> aulaList = curso1.getAulaList();

        ArrayList<Curso2> cursos = new ArrayList<>();
        cursos.add(curso1);

    }

}

class Aula {

}

class Curso2 {

    private String nombre;
    private int tiempo;
    private List<Clase3> claseList = new ArrayList<>();

    public Curso2(String nombre, int tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public Curso2(String nombre, int tiempo, List<Clase3> claseList) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.claseList = claseList;
    }

    public void addAula(Clase3 clase) {
        this.claseList.add(clase);
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

    // La lista obtenida es inmutable
//    public List<Aula> getAulaList() {
//        return Collections.unmodifiableList(aulaList);
//    }

    public void setAulaList(List<Clase3> claseList) {
        this.claseList = claseList;
    }

    @Override
    public String toString() {
        return "Curso2{" +
                "nombre='" + nombre + '\'' +
                ", tiempo=" + tiempo +
                ", claseList=" + claseList +
                '}';
    }

}
