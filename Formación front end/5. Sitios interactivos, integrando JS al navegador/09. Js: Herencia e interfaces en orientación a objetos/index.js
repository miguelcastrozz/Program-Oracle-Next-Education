import {Cliente} from "./Cliente.js"
import {CuentaCorriente} from "./CuentaCorriente.js";
import {CuentaAhorro} from "./CuentaAhorro.js";

const cliente1 = new Cliente("Leonardo","13804050","123224");
const cliente2 = new Cliente("María","16979808","8989");

const cuentaCorrienteLeonardo = new CuentaCorriente(cliente1, "1", "001");
const cuentaCorrienteMaria = new CuentaCorriente(cliente2,"2","002");

const cuentaAhorroLeonardo = new CuentaAhorro(cliente1,0,"9985", "001");
console.log(cuentaAhorroLeonardo);
