package b_EntenderElLenguajeJavaYOrientacionAObjetos.a_EntendiendoLaOrientacionAObjetos;


public class Cuenta {

    private double saldo;
    private int agencia;
    private int numero;
    Cliente titular;

    public Cuenta() {

    }

    // Variable de la clase y no de las instancias
    private static int total = 0;

    public Cuenta(double saldo, int agencia, int numero) {
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
    }

    public void depositar(double saldo) {
        this.saldo += saldo;
    }

    public boolean retirar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    // Recibimos como parámetro una Cuenta de tipo Cuenta
    public boolean transferir(double valor, Cuenta cuenta) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            cuenta.depositar(valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
