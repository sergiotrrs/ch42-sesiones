import { pensamientoMariana, miPensamiento as pensamientoSerch, myFunctionRubi } from "./js08-oop-user.js"
import { detallesMora } from "./js08-oop-user.js";

console.log("JS08 OOP");

const miPensamiento = "Que bonitas presentaciones"; // Susy
console.log( miPensamiento );
console.log( pensamientoMariana );
console.log( pensamientoSerch );
myFunctionRubi();

console.log( detallesMora.cortePelo() );

// console.log( pensamientoArlette ); No se puede utilizar por que no
// está declarada la variable o no está importada, de hecho, no se puede
// importar la variable por que en js08-oop-user no está exportada.