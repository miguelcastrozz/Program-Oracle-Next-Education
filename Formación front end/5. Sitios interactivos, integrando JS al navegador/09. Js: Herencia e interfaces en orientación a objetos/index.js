import {Empleado} from "./Empleados/Empleado.js";
import {Gerente} from "./Empleados/Gerente.js";
import {Director} from "./Empleados/Director.js";
import {SistemaAutenticacion} from "./SistemaAutenticacion.js";

const empleado = new Empleado("Juan", "12345679", 10000);
empleado.asignarClave(123);
const gerente = new Gerente("Monica", "987654123", 12000);
gerente.asignarClave(456);
const director = new Director("Pedro", "159357536", 15000);
director.asignarClave(789);

console.log(empleado.verBonificacion());
console.log(gerente.verBonificacion());
console.log(director.verBonificacion());

console.log(SistemaAutenticacion.login(empleado, 123));
console.log(SistemaAutenticacion.login(gerente, 456));
console.log(SistemaAutenticacion.login(director, 999));
