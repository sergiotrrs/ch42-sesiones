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




