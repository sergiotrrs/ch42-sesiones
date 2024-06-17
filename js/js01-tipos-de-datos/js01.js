console.log("Sesion JS01, tipos de datos");

/*
 Tipos de datos de JavaScript:
 - Objetos y primitivos
 - Los datos primitivos:
    * string
    * boolean
    * number
    * null
    * undefined
    * bigint
    * symbol
    > son inmutables, no tienen atributos ni métodos

- Objetos:
     tipo object
    {clave: valor, edad: 25, name: "pitufina"}
     tipo array
    [element_1 , element_2 , "Pitufinas", 38, {}, {}  ]
*/

// ================= Datos primitivos ==================
/*
  Tipo de datos string: "hola", "Ya mero es la 1", 'Día azul'
   - String template literals ` ` (backtick) 
   Es una forma más flexible y legible de trabajar con cadenas 
   de texto. Utilizan comillas invertidas (``) en lugar de 
   comillas simples o dobles y permiten incrustar expresiones
    dentro de la cadena utilizando la interpolación ${}.
*/
console.log( typeof "hola" ); // "string"
console.log( typeof "" ); // "string" (empty string)
console.log( "El resultado de 3 * 4 = " + (3 * 4) + " pesos" );
/*
  La interpolación con ${} en JavaScript es una característica 
  de los Template Literals que permite insertar variables y 
  expresiones dentro de cadenas de texto. 
  Esto se hace envolviendo las expresiones en ${} dentro de 
  una cadena delimitada por comillas invertidas (``).
*/
console.log( `El resultado de 3 * 4 = ${ 3*4 } pesos` );

/*
 Tipos de datos number.

 - números positivos: 100, 1, 0.258
 - números negativos: -1 , .50.35
 - valores que no pueden ser representados numéricamente: NaN
 - número infinitos: +Infinity, -Infinity
*/

console.log( typeof 3.141592 ); // number
console.log( typeof (3*3)  ); // number
//           typeof 9
console.log( typeof (3*"pitufo alegre") ); // number
//            typeof NaN
console.log( typeof +Infinity ); // number
console.log( typeof (-8/0) ); // number
//           typeof -Infinity
console.log( typeof ( 3 + "Viernes temático" ) ); // string
//           typeof "3Viernes temático"

/*
 Cuando se realizan operaciones que exceden los límites
 de MAX_SAFE_INTEGER se produce una pérdida de precisión.

 Perdida precisión: No se pueden representar exactamente ciertos valores.
  típicamente en operaciones de números de punto flotate.
*/
console.log( `Pérdida de precisión: 0.1 + 0. 2 = ${ 0.1 + 0.2 }`) //  0.30000000000000004
console.log( `Valor entero seguro en JavaScript: ${Number.MAX_SAFE_INTEGER} `) // 9007199254740991
console.log( `MAX_SAFE_INTEGER + 1: ${Number.MAX_SAFE_INTEGER + 1 }`); 
console.log( `MAX_SAFE_INTEGER + 2: ${Number.MAX_SAFE_INTEGER + 2 }`); 
console.log( `MAX_SAFE_INTEGER + 3: ${Number.MAX_SAFE_INTEGER + 3 }`); 
console.log( `MAX_SAFE_INTEGER + 4: ${Number.MAX_SAFE_INTEGER + 4 }`); 
console.log( `MAX_SAFE_INTEGER + 5: ${Number.MAX_SAFE_INTEGER + 5 }`); 

/*
 Tipos de datos BigInt
 Sirve para representar valores numéricos enteros, de los que el
 tipo number no pueda representar o no es seguro.

 Las operaciones con un bigInt se debe hacer con otro bigInt

*/
const myBigInt = 9007199254740991n;
console.log( typeof myBigInt ); // bigint
console.log( `Resultado de myBigInt + 1n: ${ myBigInt + 1n }  `); // 9007199254740992n

/*
 Tipo de dato undefined
  - Una variable que es declarada, pero el tipo de datos
   no es definido.
*/

let myName;

console.log( typeof myName ); // "undefined"

/*
 Tipo de dato null
  - Una variable que intensionalmente se borra el tipo de dato

  */
 let myAge;
 console.log(`Tipo de dato en myAge ${ typeof myAge}`); // undefied
 myAge = 20;
 console.log(`Tipo de dato en myAge ${ typeof myAge}`); // number
 myAge = null; //intensionalmente se borra el tipo de dato
 
 // NO es correcto usar typeof con un dato null
 console.log(`Tipo de dato en myAge ${ typeof myAge}`); // object 
 console.log(`myAge es null?  ${ myAge === null } `);// true

 /*
 Tipo de dato boolean
 Tiene dos estados: true y false

 */
 const isActive = true;
 
 // --------------------------------------------------------------
 /*
   Conversion explícita de datos (coerción de tipo)

 */
// Conversión a String
const edadMascota = 10; // number
// Conversion implícita
console.log("Edad de mi mascota " + edadMascota); // "Edad de mi mascota: 10"
// Conversión explícita
const edadMascotaString = String( edadMascota ); // "10"
                                               // "Edad de mi mascota en String 10"
console.log("Edad de mi mascota en String " + edadMascotaString ); 

// Conversión a number
const costo = "100";
// Conversión implícita
const costoConIVA = costo * 1.16; // 116.00

// Conversión explícita
const precioCroquetas = "1000.50"; // string
const precioJabon = "25"; // string
const precioPapel = "40"; // string
const precioPapelNumber = parseInt(precioPapel); // 40 (number)
console.log( typeof (precioPapel ), typeof(precioPapelNumber) ); // string, number

const total = precioCroquetas + precioJabon + precioPapel; // 1000.502540 (string)

const totalCorrecto = parseFloat( precioCroquetas ) + parseInt( precioJabon )  //(number)
                      + Number(precioPapel);

/*
 Number() Vs parseInt()
  - Number convierte enteros y decimales
  - parseInt convierte solo pa larte entera
*/
console.log( parseInt("10.456")); // 10
console.log( parseFloat("10.456")); // 10.456
console.log( Number("10.456")); // 10.456
// - Number devuelve NaN si la cadena contiene algùn catacter no numérico
// - parseInt y parseFlotat realiza la conversión hasta encontrar un caracter
//   no numérico
// - con parseInt y parseFloat, si la entrada comienza con un valor no numérico
//   devuelve NaN
console.log( parseInt("10-25")); // 10
console.log( Number("10-25")); // NaN

// Para convertir un tipo boolean a number se debe utilizar Number()
console.log( Number( true )); // 1
console.log( Number( false )); // 0
console.log( parseInt( true )); // NaN

// Conversión a tipo boolean
// En la conversión a boolean los siguientes valores son false:
// ""(empty string), 0, null, undefined
console.log( Boolean(1) ); // true 
console.log( Boolean(1000) ); // true 
console.log( Boolean(-1000) ); // true
console.log( Boolean("Ya mero terminamos, me duele la cabeza") ); // true
console.log( Boolean("") ); // false
console.log( Boolean(" ") ); // true
console.log( Boolean("0")); // true
console.log( Boolean( Number("0")) ); // false
          // Boolean( 0 );

// Resumen:

// Number()
// [] (empty array) -> 0, [30]-> 30, [30,30]->NaN, false-> 0, true-> 1

// String()
// [] -> "", [12,2]->"12,2", function(){}-> "function(){}"
// {} ->"[object,object]", {clave:valor, age:17} ->"[object,object]"

// Para convertir un obejeto a string, la forma correcta es usar
// el método JSON.stringyfy( objeto );



console.log(   2 < 10    ); // true
console.log(  "22" < 10 ); // false
         //    22  < 10
// Cuando los dos operandos sean string, se evalua cada caracter
// por su posición en la tabla unicode. Se compara el primer caracter del op1
// con el primer caracter del op2, si son iguales se continua con el segundo operando        
console.log(  "22" > "3"  );  // false 
        //    50   >  51   
console.log(  "221" > "24" ); // false
        //     50("2") >  52("4")

console.log(  "Mar" > "Dulce" ); // true
        //     77   >   68
console.log(  "Mar" > "Maricela" ); // false

console.log(  "marbe" > "Maricela" ); // true
       //      m > M
console.log(  "marbe".toLowerCase() > "Maricela".toLowerCase() );
      //       b > i     false
      //      98 > 105   false


