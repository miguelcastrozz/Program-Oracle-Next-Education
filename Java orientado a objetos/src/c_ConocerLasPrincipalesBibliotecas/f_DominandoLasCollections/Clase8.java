package c_ConocerLasPrincipalesBibliotecas.f_DominandoLasCollections;

import java.util.*;

public class Clase8 {

    public static void main(String[] args) {

        Curso4 curso1 = new Curso4("Historia", 1);

        Alumno alumno1 = new Alumno("Juan Perez", "001");
        Alumno alumno2 = new Alumno("Mario Cardenas", "002");
        Alumno alumno3 = new Alumno("Maria Lopez", "003");
        Alumno alumno4 = new Alumno("Ana Martinez", "004");
        Alumno alumno5 = new Alumno("Jose Sanchez", "005");
        Alumno alumno6 = new Alumno("Luis Garcia", "006");
        Alumno alumno7 = new Alumno("Luisa Garcia", "007");

        curso1.addAlumno(alumno1);
        curso1.addAlumno(alumno2);
        curso1.addAlumno(alumno3);
        curso1.addAlumno(alumno4);
        curso1.addAlumno(alumno5);
        curso1.addAlumno(alumno6);
        curso1.addAlumno(alumno7);

        Optional<Alumno> alumno = curso1.getAlumnos().stream().filter(a -> a.getCodigo().equalsIgnoreCase("003")).findFirst();

        if (alumno.isPresent()) {
            System.out.println(alumno.get());
        }

        Alumno alumnoMap = curso1.getAlumnoMap().get("003");
        System.out.println(alumnoMap);

/*
        curso1.getAlumnoMap().forEach((codigo, alumno) -> {
            System.out.println("Codigo: " + codigo + " Alumno: " + alumno);
        });
*/

    }

}

class Curso4 {

    private String nombre;
    private int tiempo;
    private List<Clase3> claseList = new ArrayList<>();
    private Collection<Alumno> alumnos = new HashSet<>();
    private Map<String, Alumno> alumnoMap = new HashMap<>(); /* new linkedHashMap<>(); LinkedHashMap mantendrá el orden de inserción */

    public Curso4(String nombre, int tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public Curso4(String nombre, int tiempo, List<Clase3> claseList) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.claseList = claseList;
    }

    public void addAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
        this.alumnoMap.put(alumno.getCodigo(), alumno);
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

    public Map<String, Alumno> getAlumnoMap() {
        return alumnoMap;
    }

    public void setAlumnoMap(Map<String, Alumno> alumnoMap) {
        this.alumnoMap = alumnoMap;
    }

    @Override
    public String toString() {
        return "Curso4{" +
                "nombre='" + nombre + '\'' +
                ", tiempo=" + tiempo +
                ", claseList=" + claseList +
                ", alumnos=" + alumnos +
                '}';
    }

}
