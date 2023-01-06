package b_EntenderElLenguajeJavaYOrientacionAObjetos.b_PolimorfismoEntendiendoHerenciaEInterfaces.mx.com.bytebank.modelo;

public class AutenticacionUtil {

    private String clave;

    public boolean iniciarSesion(String clave) {
        return this.clave == clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

}
