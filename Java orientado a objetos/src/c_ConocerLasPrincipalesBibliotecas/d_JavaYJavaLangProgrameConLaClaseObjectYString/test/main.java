package c_ConocerLasPrincipalesBibliotecas.d_JavaYJavaLangProgrameConLaClaseObjectYString.test;

import c_ConocerLasPrincipalesBibliotecas.d_JavaYJavaLangProgrameConLaClaseObjectYString.animal.Perro;

public class main {

    public static void main(String[] args) {

        Perro perro1 = new Perro("Lucas", "Pastor Aleman", 3);

        System.out.println(perro1.ladrar(" fuerte"));

        ///////////////////////////////////////////////////////////////////////////////////////////

        String nombre = "Miguel";

        System.out.println("Usando replace ........ " + nombre.replace("g", "T"));
        System.out.println("Usando concat ......... " + nombre.concat(" Castro"));
        System.out.println("Usando toUpperCase .... " + nombre.toUpperCase());
        System.out.println("Usando toLowerCase .... " + nombre.toLowerCase());
        System.out.println("Usando charAt ......... " + nombre.charAt(5));
        System.out.println("Usando indexOf ........ " + nombre.indexOf("e"));
        System.out.println("Usando lastIndexOf .... " + nombre.lastIndexOf("e"));

        ///////////////////////////////////////////////////////////////////////////////////////////

        // Object cuenta = new CuentaAhorro(344, 544);

        printLine(nombre);

    }

    public static void printLine(Object valor) {
        System.out.println(valor);
    }

}

// TODO: 03-01-2023
