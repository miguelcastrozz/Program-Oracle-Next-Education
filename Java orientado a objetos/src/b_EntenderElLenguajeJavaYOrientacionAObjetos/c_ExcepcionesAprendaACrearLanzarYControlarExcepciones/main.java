package b_EntenderElLenguajeJavaYOrientacionAObjetos.c_ExcepcionesAprendaACrearLanzarYControlarExcepciones;

public class main {

    public static void main(String[] args) throws Exception { /* Puede lanzar cualquier excepción en caso el método close() de la clase Connection lance una excepción */

        System.out.println("Inicio main");

        try {
            method1();
        } catch (Exception e) { // Atrapa cualquier excepción
            e.printStackTrace();
        }
        System.out.println("Fin main");

        // CONEXIÓN

        Connection connection = new Connection();

        /*
        try {
            connection.leerDatos();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.cerrar();
            }
        }
        */

        try (Connection connection1 = new Connection()) {
            connection1.leerDatos();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

    }

    private static void method1() {
        System.out.println("Inicio método 1");
        try {
            method2();
        } catch (MyException me) {
            me.printStackTrace();
        }
        System.out.println("Fin método 1");
    }

    private static void method2() throws MyException { /* Completamente seguro de que va a lanzar una excepción */
        System.out.println("Inicio método 2"); /*
        BOMBA PREDEFINIDA
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
            try {
                if (i == 3) {
                    int numero = 0;
                    int resultado = 5 / numero;
                    System.out.println(resultado);
                }
                String test = null;
                System.out.println(test.toString());
            } catch (ArithmeticException | NullPointerException terrible) {
                System.out.println("Atrapado: " + terrible.getMessage());
                terrible.printStackTrace();
            }
        }*/
        // BOMBA PERSONALIZADA
        throw new ArithmeticException();
    }

}

// Excepción .... Tipo de errores que retornamos cuando programamos sobre la JVM
// Error ........ Tipo de errores que retornan por los que programan sobre la JVM
