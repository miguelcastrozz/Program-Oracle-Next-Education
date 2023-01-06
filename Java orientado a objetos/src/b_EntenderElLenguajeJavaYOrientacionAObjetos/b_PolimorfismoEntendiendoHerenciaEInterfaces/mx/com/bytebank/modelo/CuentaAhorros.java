package b_EntenderElLenguajeJavaYOrientacionAObjetos.b_PolimorfismoEntendiendoHerenciaEInterfaces.mx.com.bytebank.modelo;

public class CuentaAhorros extends Cuenta {

    public CuentaAhorros(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

}
