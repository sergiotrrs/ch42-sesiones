import { pensamientoMariana, miPensamiento as pensamientoSerch, myFunctionRubi } from "./js08-oop-user.js"
import { detallesMora } from "./js08-oop-user.js";
import { Comestible, Enlatado } from "./js08-comestibles.js";

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

// ======== Usando una clase heredada =================
 const duraznosAlmibar = new Enlatado("Duraznos en Almibar");
 console.log( duraznosAlmibar.mostrarCaducidad() );


 // ============ solución del ejercicio 4 ===============
/*
Exercise #4 (sugerencia filter() e includes() )
let student1Courses = ['Math', 'English', 'Programming'];
let student2Courses = ['Geography', 'Spanish', 'Programming'];
Create a program that loops over the 2 arrays; if there are any common courses print them out to the console.

*/
const student1Courses = ['Math', 'English', 'Programming', 'Esto me hace llorar', 'Ciencias ocultas'];

const student2Courses = ['Geography', 'Spanish', 'Programming', 'Ciencias ocultas'];

const commonCourses = [];
for (let course1 of student1Courses ){
    console.log( course1 ); 
    for(let course2 of student2Courses ){
        if( course1 === course2) commonCourses.push( course1 );
    }
}
console.log("Cursos en común: " +  commonCourses.join(", ")  );

// ========== resolviendo con filter e include
const commonCourse2 = student1Courses.filter( course1 =>  student2Courses.includes(course1) );
console.log( commonCourse2 );

// =============== pregunta de entrevista ===============
/*
 Dado el siguiente texto: "Ya vámonos"
 Mostrar la frase al revés: "sonomáv aY" 
*/
const phrase2 = "Ya vámonos";
let reversePhrase = "";
for(let i = phrase2.length - 1 ;  i >= 0 ; i-- ){
    reversePhrase = reversePhrase + phrase2.charAt(i);
}
console.log( reversePhrase );

console.log(  phrase2.split("").reverse().join("")   );