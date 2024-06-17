console.log("sesion js02");

// =======================================================================

/*
https://developer.mozilla.org/es/docs/Web/JavaScript/Guide/Functions

Función: Conjunto de instrucciones que realiza una tarea o calcula un valor.
  Código que se puede reutilizar.


  ----------- Funciones declaradas --------------
    (function declaration, function statement)
Una característica de las funciones declaradas es que tien hoisting.

sintaxis:
    function nombreFuncionCamelCase ( parámetros ){
        //cuerpo de la función
        instrucciones;
    }

hoisting: comportamiento en JS que permite a las declaración de variables(var)
o funciones se eleven al comienzo de su ámbito antes de que se ejecute el código.

*/
console.log(  greeting()  );


function greeting(){
    return "Hola Ch42, extrañamos a Tan y Nan";
}


/*
 ------------ Funciones expresadas -----------------------
            (function expressions)
Son funciones declaradas dentro de la asignación de una variable.
Estas funciones pueden ser anónimas ( no tienen nombre ).
Las funciones expresadas no tiene hoisting, porque no se
carga en memoria hasta que se utilice.

sintaxis:
    const nombreVariable = function nombreFuncion (parámetros){
        instrucciones;
    };
*/

const saludo = function greeting2( name ){
    return `Hola, me llamo ${name} y tengo hambre`;
} ;

console.log( saludo("Sergio") );

// Realizar una función que reciba un palabra y retorne la palabra en minúscula
// Realizar dos versiones de función:  función declarada y función expresada.

/** Realizar la función acá */
//Función declarada
function wordToLowerCase(phrase){
    return phrase.toLowerCase();
}
//Función expresada
const wordToLowerCase2 = function (phrase){
    return phrase.toLowerCase();
}


// uso de la función
console.log( wordToLowerCase("YUPI YUPI El MUÑECO CHUKY") ); // yupi yupi el muñeco chuky
