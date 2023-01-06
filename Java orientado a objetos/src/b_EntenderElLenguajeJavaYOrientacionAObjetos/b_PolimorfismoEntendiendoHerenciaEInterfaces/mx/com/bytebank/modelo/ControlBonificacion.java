package b_EntenderElLenguajeJavaYOrientacionAObjetos.b_PolimorfismoEntendiendoHerenciaEInterfaces.mx.com.bytebank.modelo;

public class ControlBonificacion {

    private double suma;

    public double registrarSalario(Funcionario funcionario) {
        this.suma = funcionario.getBonificacion() + this.suma;
        System.out.println("Calculo actual: " + this.suma);
        return this.suma;
    }

}
