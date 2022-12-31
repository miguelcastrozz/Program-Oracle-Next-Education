// Manera 1
const ciudades_disponibles = new Array();
ciudades_disponibles.push("Bogotá");
ciudades_disponibles.push("Lima");
ciudades_disponibles.push("Santiago");
ciudades_disponibles.push("Buenos Aires");
console.log(ciudades_disponibles);

// Manera 2
const ciudades_indisponibles = ["Bogotá", "Lima", "Santiago", "Buenos Aires"];
console.log(ciudades_indisponibles);

// Manera 3
const ciudades_populares = [];
ciudades_populares.push("Bogotá");
ciudades_populares.push("Lima");
ciudades_populares.push("Santiago");
ciudades_populares.push("Buenos Aires");
console.log(ciudades_populares);

// Mostrar la lista
console.log(ciudades_populares[2]);

// Longitud de la lista
console.log(ciudades_populares.length);

// Eliminar elemento de la lista
console.log(ciudades_populares.splice(2, 2));
console.log(ciudades_populares);
