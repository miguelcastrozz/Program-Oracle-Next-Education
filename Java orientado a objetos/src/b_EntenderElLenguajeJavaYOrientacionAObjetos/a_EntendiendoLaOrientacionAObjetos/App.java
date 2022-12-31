package b_EntenderElLenguajeJavaYOrientacionAObjetos.a_EntendiendoLaOrientacionAObjetos;

public class App {

    public static void main(String[] args) {

        Cuenta primerCuenta = new Cuenta(1000, 123, 456);
        System.out.println(primerCuenta.getSaldo());

        Cuenta segundaCuenta = new Cuenta(2000, 123, 789);
        System.out.println(segundaCuenta.getSaldo());

        /*
        if (primerCuenta.getSaldo() == segundaCuenta.getSaldo()) {
        System.out.println("Somos iguales");
        } else {
        System.out.println("Somos diferentes");
        }
        */

        // Deposito de dinero

        System.out.println("Saldo actual sin depositar: " + segundaCuenta.getSaldo());
        segundaCuenta.depositar(5000);

        // Retiro de dinero

        System.out.println("Saldo actual depositando: " + segundaCuenta.getSaldo());
        segundaCuenta.retirar(1000);

        System.out.println("Saldo actual una vez retirado dinero: " + segundaCuenta.getSaldo());

        // Transferencia de dinero

        primerCuenta.depositar(20000);
        primerCuenta.transferir(1000, segundaCuenta);

        if (primerCuenta.transferir(1000, segundaCuenta)) {
            System.out.println("Transferencia exitosa");
        } else {
            System.out.println("No es posible");
        }

        System.out.println("La primera cuenta que envío quedo con " + primerCuenta.getSaldo());
        System.out.println("La segunda cuenta que recibió quedo con " + segundaCuenta.getSaldo() + "\n");

        Cliente diego = new Cliente();

        diego.nombre = "Diego";
        diego.documento = "45444332";
        diego.telefono = "999922222";

        Cuenta cuentaDiego = new Cuenta(1000, 1, 312);
        cuentaDiego.titular = diego;

        System.out.println(cuentaDiego.titular.documento);
        System.out.println(cuentaDiego.titular);
        System.out.println(diego + "\n");

        Cuenta pedro = new Cuenta();
        cuentaDiego.titular = new Cliente();

    }

}
