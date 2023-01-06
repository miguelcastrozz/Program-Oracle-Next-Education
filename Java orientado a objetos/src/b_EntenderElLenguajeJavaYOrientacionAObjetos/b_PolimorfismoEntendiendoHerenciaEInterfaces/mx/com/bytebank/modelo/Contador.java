package b_EntenderElLenguajeJavaYOrientacionAObjetos.b_PolimorfismoEntendiendoHerenciaEInterfaces.mx.com.bytebank.modelo;

public class Contador extends Funcionario {

    @Override
    public double getBonificacion() {
        System.out.println("Llamando metodo del Contador");
        return 200;
    }

}
