import {Cliente} from "../Cliente.js";
import {CuentaCorriente} from "./CuentaCorriente.js";

export class Cuenta {

    #cliente;
    numero;
    agencia;
    #saldo;

    static cantidadCuentas = 0;

    constructor(tipo, cliente, numero, agencia) {
        if (this.constructor === Cuenta) {
            throw new Error("No se debe instanciar objetos de la clase cuenta");
        }
        this.tipo = tipo;
        this.cliente = cliente;
        this.numero = numero;
        this.agencia = agencia;
        this.#saldo = 0;
        CuentaCorriente.cantidadCuentas++;
    }

    depositoEnCuenta(valor) {
        if (valor > 0)
            this.#saldo += valor;
        return this.#saldo;
    }

    retirarDeCuenta1(valor, comision) {
        this._retirarDeCuenta(valor, 0);
    }

    // Método abstracto
    retirarDeCuenta2(valor) {
        throw new Error("Debe implementar el método en su clase");
    }

    // _ = Privado
    _retirarDeCuenta(valor, comision) {
        valor *= 1 + comision / 100;
        if (this.tipo === "Corriente") {
            valor *= 1.05;
        } else if (this.tipo === "Ahorro") {
            valor *= 1.02;
        }
        if (valor <= this.#saldo)
            this.#saldo -= valor;
        return this.#saldo;
    }

    verSaldo() {
        return this.#saldo;
    }

    transferirParaCuenta(valor, cuentaDestino) {
        this.retirarDeCuenta1(valor);
        cuentaDestino.depositoEnCuenta(valor);
        valor = 200;
        valor = valor * 1000;
    }

    prueba() {
        console.log("Método padre");
    }

    set cliente(valor) {
        if (valor instanceof Cliente)
            this.#cliente = valor;
    }

    get cliente() {
        return this.#cliente;
    }

}
