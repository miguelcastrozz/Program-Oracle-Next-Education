package b_EntenderElLenguajeJavaYOrientacionAObjetos.b_PolimorfismoEntendiendoHerenciaEInterfaces.mx.com.bytebank.modelo;

public class Gerente extends Funcionario implements Autenticable {

    // Sobre-escritura de método
    public double getBonificacion() {
        System.out.println("EJECUTANDO DESDE GERENTE");
        return 2000;
    }

    @Override
    public void setClave(String clave) {
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return false;
    }

}
