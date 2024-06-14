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