package b_EntenderElLenguajeJavaYOrientacionAObjetos.c_ExcepcionesAprendaACrearLanzarYControlarExcepciones;

public class Connection implements AutoCloseable {

    public Connection() {
        System.out.println("Abriendo conexión");
    }

    public void leerDatos() {
        System.out.println("Recibiendo datos");
        throw new IllegalStateException();
    }

    public void cerrar() {
        System.out.println("Cerrando conexión");
    }

    @Override
    public void close() throws Exception {
        cerrar();
    }

}
