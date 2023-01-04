package c_ConocerLasPrincipalesBibliotecas.e_JavayJavaUtilColeccionesWrappersyLambdaExpressions;

import b_EntenderElLenguajeJavaYOrientacionAObjetos.b_PolimorfismoEntendiendoHerenciaEInterfaces.mx.com.bytebank.modelo.*;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        // ARREGLOS SENCILLOS /////////////////////////////////////////////////////////////////////

        int[] edades1 = new int[3];
        edades1[0] = 20;
        edades1[1] = 15;
        edades1[2] = 67;

        int[] edades2 = {20, 15, 67};

        System.out.println(edades1[1]);

        for (int i : edades2) {
            System.out.println(i);
        }

        // ARREGLOS CON OBJETOS ///////////////////////////////////////////////////////////////////

        CuentaCorriente[] cuentas = new CuentaCorriente[5];

        CuentaCorriente cuentaCorriente = new CuentaCorriente(23, 44);

        cuentas[0] = new CuentaCorriente(11, 99);
        cuentas[1] = cuentaCorriente;

        for (CuentaCorriente i : cuentas) {
            System.out.println(i);
        }

        for (int i = 0; i < cuentas.length; i++) {
            System.out.println(cuentas[i]);
        }

        // TEST CUENTA ////////////////////////////////////////////////////////////////////////////

        GuardarCuentas gc = new GuardarCuentas();
        Cuenta cc1 = new CuentaCorriente(11, 22);
        Cuenta cc2 = new CuentaCorriente(22, 44);

        gc.agregar(cc1);
        gc.agregar(cc2);

        gc.obtener(1);

        System.out.println(gc.obtener(0));
        System.out.println(gc.obtener(1));

        // TEST ARRAYLIST /////////////////////////////////////////////////////////////////////////

        List<Cuenta> lista = new ArrayList<>(); /* Forzando a que acepte solo un tipo de objeto */

        Cuenta cc3 = new CuentaCorriente(11, 22);
        Cuenta cc4 = new CuentaCorriente(13, 42);

        Cliente c = new Cliente();

        lista.add(cc3);
        lista.add(cc4);

        Cuenta obtenerCuenta = lista.get(0);
        System.out.println(obtenerCuenta);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        // Por cada cuenta en la lista
        for (Cuenta i : lista) {
            System.out.println(i);
        }

        // Comparación por referencia, ¿La lista contiene la cuenta cc1?
        if (lista.contains(cc1)) {
            System.out.println("Si, es igual (equals)");
        }

        // Comparación por valores
        if (cc1.esIgual(cc3)) {
            System.out.println("Si, somos iguales");
        }

        // TEST LINKEDLIST ////////////////////////////////////////////////////////////////////////

        List<Cliente> listaClientes = new LinkedList<>();

        // TEST INTEGER ///////////////////////////////////////////////////////////////////////////

        List<Integer> listaNumeros = new ArrayList<>();

        int numero = 40;

        // Integer numeroObjeto = new Integer(40); // Obsoleto
        Integer numeroObjeto = Integer.valueOf(40); // Retorna un objeto Integer

        listaNumeros.add(numero);           // Autoboxing
        int numeroPrimitivo = numeroObjeto; // Unboxing = El objeto se convierte en primitivo

        System.out.println(Integer.MAX_VALUE);

        // TEST WRAPPERS //////////////////////////////////////////////////////////////////////////

        // Un wrapper es una clase que envuelve un tipo primitivo ejemplos: Integer, Double, Float, etc.

        Double numeroDouble = 33.0;
        Boolean verdadero = true;
        Double numeroDouble2 = Double.valueOf(33);

        String numeroString = "43"; // Autoboxing
        Double stringToDouble = Double.valueOf(numeroString);
        Integer stringToInteger = Integer.valueOf(numeroString);
//        Double numeroDoublePrimo = numero.doubleValue(); // Unboxing

        Number numeroNumber = Double.valueOf(5);

        // TEST ORDENAR LISTAS ////////////////////////////////////////////////////////////////////

        Cuenta cuentaCorriente1 = new CuentaCorriente(22, 33);
        cuentaCorriente1.deposita(333.0);

        Cuenta cuentaCorriente2 = new CuentaCorriente(22, 44);
        cuentaCorriente2.deposita(444.0);

        Cuenta cuentaCorriente3 = new CuentaCorriente(22, 11);
        cuentaCorriente3.deposita(111.0);

        Cuenta cuentaCorriente4 = new CuentaCorriente(22, 22);
        cuentaCorriente4.deposita(222.0);

        List<Cuenta> listaCuentas = new ArrayList<>();
        listaCuentas.add(cuentaCorriente1);
        listaCuentas.add(cuentaCorriente2);
        listaCuentas.add(cuentaCorriente3);
        listaCuentas.add(cuentaCorriente4);

        // CLASES ANÓNIMAS ////////////////////////////////////////////////////////////////////////

        listaCuentas.sort(new Comparator<Cuenta>() {
            @Override
            public int compare(Cuenta c1, Cuenta c2) {
                return Double.compare(c1.getSaldo(), c2.getSaldo());
            }
        });

        // TEST LAMBDA ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

        /*listaCuentas.sort(lista, (c1, c2) -> {
            return Double.compare(c1.getSaldo(), c2.getSaldo());
        });*/

        lista.forEach(cuenta -> { System.out.println(cuenta);
        });

    }

}

// ValueOf = Retorna un objeto

// TODO: 04-01-2023
// CMD + INTRO / DELETE
