import {Cuenta} from "./Cuenta.js";

export class CuentaAhorro extends Cuenta {

    constructor(tipo, cliente, numero, agencia) {
        super(tipo, cliente, numero, agencia);
    }

    retirarDeCuenta1(valor) {
        super._retirarDeCuenta(valor, 1);
    }

}