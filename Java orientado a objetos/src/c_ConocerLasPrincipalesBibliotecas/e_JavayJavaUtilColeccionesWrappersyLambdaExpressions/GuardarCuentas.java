package c_ConocerLasPrincipalesBibliotecas.e_JavayJavaUtilColeccionesWrappersyLambdaExpressions;

import b_EntenderElLenguajeJavaYOrientacionAObjetos.b_PolimorfismoEntendiendoHerenciaEInterfaces.mx.com.bytebank.modelo.Cuenta;

public class GuardarCuentas {

    Cuenta[] cuenta = new Cuenta[10];
    Object[] referencia = new Object[10];

    int indice = 0;

    public void agregar(Cuenta cc) {
        cuenta[0] = cc;
        indice++;
    }

    public Object obtener(int indice) {
        return referencia[indice];
    }

}
