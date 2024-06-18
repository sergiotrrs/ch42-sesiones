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
console.log(greeting());

function greeting() {
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

const saludo = function greeting2(name) {
  return `Hola, me llamo ${name} y tengo hambre`;
};

console.log(saludo("Sergio"));

// Realizar una función que reciba un palabra y retorne la palabra en minúscula
// Realizar dos versiones de función:  función declarada y función expresada.

/** Realizar la función acá */
//Función declarada
function wordToLowerCase(phrase) {
  return phrase.toLowerCase();
}
//Función expresada
const wordToLowerCase2 = function (phrase) {
  return phrase.toLowerCase();
};

// uso de la función
console.log(wordToLowerCase("YUPI YUPI El MUÑECO CHUKY")); // yupi yupi el muñeco chuky

/*
 ------------ Funciones flecha -----------------------
             (arrow functions)
Funciones similares a las funciones expresadas pero:
 - No requiere la palabra reservada function
 - Si tiene una solo instrucción no requiere las llaves {}
 - Si la instrucción es el mismo retorno, no requiere la palabra return

sintaxis:
    const nombreVariable = (parametros) => instrucción;

    Si en una arrow function se utilizan las {} se debe
    de agregar explicitamente la palabra returno para retornar
    un valor.

    const nombreVariable = (parametros) => {
        instrucción;
        return expresión;
    }
*/

// Realizar una función expresada para calcular el área de un rectángulo.
/** TODO: crear la función */
const areaRectangle = function area(base, altura) {
  return base * altura;
};

const calculoAreaRectangulo = (base, altura) => base * altura;

const calculoAreaRectanguloVer2 = (base, altura) => {
  return base * altura;
};

// uso de la función
console.log(`El área de rectángulo es ${areaRectangle(6, 4)}`); // 24

// Realizar una Arrow function que calcule el impuesto de un valor
/** TODO calcular el impuesto de un valor */
const calcularImpuesto = (valor, impuesto) => valor * impuesto;

// caso de uso:
console.log(`El impuesto de los calcetines es: ${calcularImpuesto(100, 0.16)}`); // 16

// ==================================================================
// Ejercicios: Convertir las siguientes funciones a Arrow functions.

/** Función 1: Sumar dos números */
/*function sumar(a, b) {
    return a + b;
}*/
const sumar = (a, b) => a + b;

console.log(`La suma de 100 + 5 = ${sumar(100, 5)}`); // 105

/** Función 2: Verificar si un número es par */
/*function esPar(num) {
    return num % 2 === 0;
}*/
const esPar = (num) => num % 2 === 0;

console.log(`El número 18 es par? ${esPar(18)}`); // true
console.log(`El número 23 es par? ${esPar(23)}`); // false

/** Función 3: Verificar si tres números terminan con el mismo dígito */
/* function mismosUltimosDigitos(num1, num2, num3) {
    const ultimoDigito1 = num1 % 10;
    const ultimoDigito2 = num2 % 10;
    const ultimoDigito3 = num3 % 10;
    return ultimoDigito1 === ultimoDigito2 && ultimoDigito1 === ultimoDigito3;
} */
/*const mismosUltimosDigitos = (num1, num2, num3) =>{
    const ultimoDigito1 = num1 % 10; // 3
    const ultimoDigito2 = num2 % 10; // 3
    const ultimoDigito3 = num3 % 10; // 3
    return ultimoDigito1 === ultimoDigito2 && ultimoDigito1 === ultimoDigito3;

    };*/
const mismosUltimosDigitos = (num1, num2, num3) =>
  num1 % 10 === num2 % 10 && num1 % 10 === num3 % 10;

const  mismosUltimosDigitosMariana = (num1, num2, num3) => (num1, num2, num3) % 10 === 3;

console.log(  `23, 203 y 1013 terminan 3? ${mismosUltimosDigitos(23, 203, 1013)}`);
console.log(  `24, 203 y 1013 terminan 3? ${mismosUltimosDigitos(24, 203, 1013)}`);
console.log(  `25, 205 y 1015 terminan 5? ${mismosUltimosDigitos(25, 205, 1015)}`);


// =============================================================
/*
 ------------ Funciones de Callback -----------------------
 Es una función(definida, expresada, arrow, anónima) que se pasa 
 a otra función como argumento.
 Se pasa en el argumento como referencia ( sin parentesis).
 */

 // Hacer con arrow function una función que reciba un texto e imprima en consola
 const printToConsole = (text) => console.log(text);

 printToConsole("Kari le gusta el color verde");
 // Hacer con arrow function una función que reciba un texto e imprima en alert
 const printToAlert = (text) => alert(text);

 // Hacer con arrow function una función que reciba un texto e imprima en H1 "app-title"
 const printToH1 = (text) => document.getElementById("app-title").innerHTML = text;

// Realizar una función(arrow function) que reciba un texto
// y que pueda imprimir en consola, alert y quizá en el futuro
// se agregue otra salida para imprimir. 

const printMessage = (text, optionToPrint ) => {
    if ( optionToPrint === "console"){
        printToConsole(text);
    } else if( optionToPrint === "alert" ){
        printToAlert(text);
    } else if( optionToPrint === "h1" ){
        printToH1(text);
    } else {
        console.error("Que transa!, te equivocaste de opción");
    }
};

printMessage("Hola, amigas", "h1");
printMessage("No, no, (se rie en bolillense)", "console");
printMessage("Tres tristes tigres", "CONSOLE"); // envía un error
