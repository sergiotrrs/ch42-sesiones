import { pensamientoMariana, miPensamiento as pensamientoSerch, myFunctionRubi } from "./js08-oop-user.js"
import { detallesMora } from "./js08-oop-user.js";
import { Comestible } from "./js08-comestibles.js";

console.log("JS08 OOP");

const miPensamiento = "Que bonitas presentaciones"; // Susy
console.log( miPensamiento );
console.log( pensamientoMariana );
console.log( pensamientoSerch );
myFunctionRubi();

console.log( detallesMora.cortePelo() );
// llegamos al 16 de septimbre y Amay decide pintar a Mora de verde, blanco y rojo
detallesMora.color =  "verde, blanco y rojo";
console.log( detallesMora.cortePelo() );


// console.log( pensamientoArlette ); No se puede utilizar por que no
// está declarada la variable o no está importada, de hecho, no se puede
// importar la variable por que en js08-oop-user no está exportada.

// ============== Instanciar las clases para crear objetos
// const myArray = [];
// const myArray = new Array();
const myArray = new Array("Hola", "Piense bien", "El viernes temático");
console.log( myArray.length ); // 3
const phrase = myArray.join(" ");
console.log( phrase );

// ============== Instanciar la clase Comestible ==================
const papa = new Comestible();
const fresa = new Comestible("Fresa", "dulce" );
const mandarina = new Comestible("Tangerine", "deliciousa" );

console.log( fresa.mostrarCaducidad() );
console.log( mandarina.mostrarCaducidad() ); // la hora actual + 1 h.

console.log( mandarina.sabor  ); // deliciousa
mandarina.sabor = "citrico";
console.log( mandarina.sabor ); // citrico
mandarina.fechaCreacion = new Date("2024-07-02T07:00:00" );
console.log( mandarina.mostrarCaducidad() ); // 2024-07-02 08:00:00
