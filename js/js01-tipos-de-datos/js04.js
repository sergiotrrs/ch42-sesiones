console.log("Sesion JS04");

/*
 El ciclo for en JavaScript es una estructura de control 
 que permite repetir un bloque de código un número específico 
 de veces. Es una de las formas más comunes de iteración 
 en JavaScript y es especialmente útil cuando 
 se trabaja con arrays o cuando se necesita 
 repetir una operación varias veces. 

 sintaxis:

    for( inicialización; condición; expresión final) {
       // instrucciones
    }
 */

for( let counter = 0; counter < 5; counter = counter + 1  ) {
    console.log("El valor de counter es: " + counter );
}

// imprimir 10 veces "Hola Ch42";
/*
for( let counter = 0; counter < 10; counter = counter + 1 ){
    console.log("Hola Ch42");
}
*/
for( let counter = 0; counter < 10; counter++ ){
    console.log("Hola Ch42");
}

const names =  ["Mariana", "Silvia", "Susy", "Marbe"];
/*
console.log( names[0] );
console.log( names[1] );
console.log( names[2] );
console.log( names[3] );
*/
for(let index = 0; index <  names.length ; index++ ){
    console.log( index, names[index] );
}

// ========================== 21 /06 /2024 ==================
/*
const signosZodiacales = [];

for( let i = 0; i < signosZodiacales.length ; i++ ){
    console.log( i, signosZodiacales[i] );
}


 A) 1 vez
 B) 0 veces
 C) Marca error
 D) Ciclo infinito
*/

const signosZodiacales = 100;

for( let i = 0; i < signosZodiacales.length ; i++ ){
    console.log( i, signosZodiacales[i] );
}

/*
A) 5 veces
B) 0 veces
C) Marca error 
D) Ciclo infinito
*/

let index = 0;

for(  ; index < 5 ; ){
    console.log( index );
    index++;
}
/*
A) 5 veces
B) 0 veces
C) Marca error 
D) Ciclo infinito
*/

// Uso de break
// Se usa en ciclos(for, while, do-while) y switch. Su función es salir
// del ciclo actual o bloque case(casos) antes de que haya terminado de ejecutar todos
// sus iteraciones o casos.

// Respuesta: 6 veces, la instrucción console.log se va a ejcutar
// cuando la variable i es igual a 0, 1, 2 3, 4, y 5.
for( i = 0; i < 10 ; i++ ){
    console.log(`Núm de iteración ${i}`);
    if( i === 5){
        break;
    }
}
/*
A) 10 veces
B) 6 veces
C) 5 veces
D) 0 veces
*/

const signosCh42 = ["Acuario", "Geminis", "Escorpio", "Sagitario", "Sagitario", "Escorpio"]

// Imprimir los signos de la varible SignosCh42
// y dejar de imprimir cuando se encuentre a un "Escorpio"
// salida: 
//    Acuario
//    Geminis
//    Escorpio      
for( let i = 0; i < signosCh42.length; i++ ){
    console.log(i, signosCh42[i] );
    if( signosCh42[i] === "Escorpio" ) break;        
}

// Imprimir en consola la tabla del 8
/*
   8 x 1 = 8
   8 x 2 = 16
   8 x 3 = 24
   8 x 4 = 
   8 x 5 = 
   8 x 6 = 
   8 x 7 = 
   8 x 8 = 
   8 x 9 = 
   8 x 10 = 
*/

const imprimirTablaDeMultiplicar = (number) => {
  for (let i = 1; i <= 10; i++) {
    console.log(`${number} x ${i} = ${number * i}`);
  }
};


// Imprimir la del 3, 6 y 7
/*
imprimirTablaDeMultiplicar( 3 );
imprimirTablaDeMultiplicar( 6 );
imprimirTablaDeMultiplicar( 7 );
*/

// Imprimir las tablas de multiplicar de los diferentes valores
// que pueda seleccionar un usuario.

const numerosSeleccionados = [18, 20, 15, 1.5];
/*
for(let i=0; i<numerosSeleccionados.length;i++){
    // console.log(numerosSeleccionados[i])
    imprimirTablaDeMultiplicar( numerosSeleccionados[i]  );
}
*/

// Realizar lo anterior, sin usar la llamada a una función.
for(let i=0; i<numerosSeleccionados.length;i++){
    const number = numerosSeleccionados[i];
    for (let j = 1; j <= 10; j++) {
        console.log(`${number} x ${j} = ${number * j}`);
      }
}