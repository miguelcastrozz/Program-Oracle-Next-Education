import {Cuenta} from "./Cuenta.js";

export class CuentaCorriente extends Cuenta {

    static cantidadCuentas = 0;

    constructor(tipo, cliente, numero, agencia) {
        super(tipo, cliente, numero, agencia);
        CuentaCorriente.cantidadCuentas++;
    }

    retirarDeCuenta1(valor) {
        super._retirarDeCuenta(valor, 5);
    }

    prueba() {
        console.log("Método hijo");
    }

}
