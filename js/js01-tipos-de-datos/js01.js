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