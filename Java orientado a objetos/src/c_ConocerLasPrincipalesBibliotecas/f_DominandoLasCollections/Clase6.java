package c_ConocerLasPrincipalesBibliotecas.f_DominandoLasCollections;

import java.util.*;

public class Clase6 {

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

        System.out.println(alumno1.equals(alumnoNuevo));
        System.out.println(curso1.getAlumnos().contains(alumnoNuevo));

    }

}


class Curso3 {

    private String nombre;
    private int tiempo;
    private List<Clase3> claseList = new ArrayList<>();
    private Collection<Alumno> alumnos = new HashSet<>();

    public Curso3(String nombre, int tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public Curso3(String nombre, int tiempo, List<Clase3> claseList) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.claseList = claseList;
    }

    public void addAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
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

    public List<Clase3> getClaseList() {
        return claseList;
    }

    public void setClaseList(List<Clase3> claseList) {
        this.claseList = claseList;
    }

    public Collection<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Collection<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Curso3{" +
                "nombre='" + nombre + '\'' +
                ", tiempo=" + tiempo +
                ", claseList=" + claseList +
                '}';
    }

}

class Alumno {

    private String nombre;
    private String codigo;

    public Alumno(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    @Override
    public boolean equals(Object obj) {
        Alumno alumno = (Alumno) obj;
        return this.nombre.equals(alumno.getNombre());
    }

    public int hashCode() {
        return this.nombre.hashCode();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

}
