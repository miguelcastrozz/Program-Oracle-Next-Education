export class Empleado {

    #nombre;
    #dni;
    #salario
    #clave;

    constructor(nombre, dni, salario) {
        this.#nombre = nombre;
        this.#dni = dni;
        this.#salario = salario;
        this.#clave = "";
    }

    verBonificacion() {
        return this.#salario;
    }

    _verBonificacion(bono) {
        return this.#salario += bono / 100;
    }

    asignarClave(clave) {
        this.#clave = clave;
    }

    autenticable(clave) {
        return clave === this.#clave;
    }

}
