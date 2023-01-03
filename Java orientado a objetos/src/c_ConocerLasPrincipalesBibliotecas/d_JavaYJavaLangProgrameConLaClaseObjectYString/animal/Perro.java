package c_ConocerLasPrincipalesBibliotecas.d_JavaYJavaLangProgrameConLaClaseObjectYString.animal;

// default = Visible únicamente dentro de este paquete

/**
 *
 * Ejemplo de una clase Perro
 *
 * @version 1.0
 * @author MiguelCastro
 */
public class Perro {

    private String nombre;
    private String raza;
    private int edad;

    /**
     * Instancia un objeto de tipo Perro
     *
     * @param nombre Nombre del perro
     * @param raza Raza del perro
     * @param edad Edad del perro
     */
    public Perro(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    /**
     * Ladrar
     *
     * @param tipo Tipo de ladrido
     * @return Frase que dice el perro
     */
    public String ladrar(String tipo) {
        return "Me llamo " + this.nombre + ", ladro"  + tipo + " y estoy muy contento";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
