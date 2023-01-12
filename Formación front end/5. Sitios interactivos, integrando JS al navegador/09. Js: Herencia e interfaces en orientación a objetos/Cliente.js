export class Cliente {

    nombreCliente;
    dniCliente;
    rutCliente;
    autetnticableCliente;
    #clave;

    constructor(nombreCliente, dniCliente, rutCliente) {
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.rutCliente = rutCliente;
        this.#clave = "";
    }

    asignarClave(clave) {
        this.#clave = clave;
    }

    autenticable() {
        return true;
    }

}
