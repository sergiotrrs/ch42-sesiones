console.log("Sesion JS 03 con Remy");

const changeImage = ( imageID, imagePath) => 
    document.getElementById( imageID ).src = imagePath ;

// ==================== Array ================
/*
 El tipo array es un tipo de Objeto especial
 ya que cuenta con diferentes atributos y métodos
 para realizar diferentes operaciones.

 Un Array permite almacenar múltiples valores.

*/

// Definir un array
["Remy", 1, true ];

// Crear un array de nombres y asignarlo a una variable
const nombres = ["Dulce", "Karina", "Diana"];

const primerCaracter = "Ayer soñe que..".charAt(0);
console.log( primerCaracter ); // A

const primerNombre = nombres[0];
console.log( primerNombre );

// Imprimir directamente a Diana
console.log( nombres[2]  ); // Diana

// Los arrays son mutables
console.log(nombres ); //  ['Dulce', 'Karina', 'Diana']
nombres[1] = "Kari";
console.log(nombres); //  ['Dulce', 'Kari', 'Diana']

// Agregar un elemento, en un índice que no existe
nombres[3] = "Yoli";
console.log(nombres); // ['Dulce', 'Kari', 'Diana', 'Yoli']

// Agregar un elemento, en un índice que no existe
nombres[10] = "Ale"; 
console.log( nombres ); // ['Dulce', 'Kari', 'Diana', 'Yoli', empty × 6, 'Ale']
console.log( nombres [9] ); // undefined

// Verifica el número de elementos de un arreglo
console.log( nombres.length  ); // 11
// ['Dulce', 'Kari', 'Diana', 'Yoli', undefined, undefined, undefined, undefined, undefined, undefined, 'Ale'] 

// =============================
const panes = [];

// contar núm de elementos de un arreglo:
console.log( panes.length ); // 0

// Agregar un elemento indicando el índice
panes[0] = "Pan de ajo";

// push() : Agregar uno o más elementos
//  retorno: la longitud del arreglo
console.log( panes.push("Dona de Chocolate") ); // 2
console.log( panes );
console.log( `Total de elementos en panes : ${ panes.push("Bolillo", "Roles")}` ); // 4
console.log( panes );

// pop() : Eliminar el último elemento
//  retorna: El elemento eliminado
console.log( panes.pop() ); // Roles
console.log( panes );

// unshift() : Agregar uno o más elementos al inicio del arreglo
//  retorna: la longitud del arreglo
console.log( panes.unshift("Cacahuate", "Concha") ); // 5
console.log( panes ); // ['Cacahuate', 'Concha', 'Pan de ajo', 'Dona de Chocolate', 'Bolillo']

// shift: Eliminar el primer elemento de mi arreglo
//  retorna: El elemento eliminado
console.log( panes.shift() ); // Cacahuate
console.log( panes ); // ['Concha', 'Pan de ajo', 'Dona de Chocolate', 'Bolillo']

// =============================
// PEPS : Primero en Entrar, Primero en Salir
// FIFO : First Input First Output
const frutas = ["Mango", "Piña"];
frutas.push( "Melón" );
frutas.shift(); // Mango
console.log( frutas );

// LIFO : Last Input First Output
const eliminados = ["Hamburguesa", "Chiles rellenos"];
eliminados.push("Tacos");
console.log( eliminados );
eliminados.pop(); // Tacos
console.log( eliminados );

// Buscar elementos en el arreglo.
// indexOf: Buscar el índica de la primera aparición de un elemento
//  retorna: el índice del elemento, si no se encuentra retorna -1
console.log( panes );
const numIndiceDelElemento = panes.indexOf("Pan de ajo");
console.log(`Índice el elemento encontrado: ${numIndiceDelElemento}`)

if (numIndiceDelElemento !== -1 ){
    console.log("Yuju, tu pan si lo tenemos");
} else {
    console.log("Lo siento, tu pan no lo tengo registrado")
}

// slice: extrae una sección de un array y devuelve los elementos extraidos.
//        slice no modifica el arreglo original
//  retorna: nuevo array con los elementos extraidos.

// Hacer un arreglo de edades, las edades deben ser de 18 a 40 años, 10 elementos.
// *** investigar, crea aleatoriamente las edadades(18-40), 100 elementos.
// Math.random() // genera aleatorio de 0 al 1 (sin incuir el 1)

const ages = [18, 25, 30, 22, 35, 28, 40, 19, 27, 32];

//const bloqueAges = ages.slice(1); // Entrega del índice 1 hasta el final del arreglo
                // [25, 30, 22, 35, 28, 40, 19, 27, 32];

const bloqueAges = ages.slice(1, 5); // Se entrega del índice 1 al 5(sin incluir el 5)              
console.log( bloqueAges ); // [25, 30, 22, 35];

const bloqueAges2 = ages.slice(5,8);
console.log( bloqueAges2 ); // [28, 40, 19]

// Slice también sirve como alternativa para copiar(clonar) un arreglo.


// Pase por valor
let edadTan = 26;
let edadDiana = edadTan;
edadTan = 25;

const reiniciaEdad = (edad) => edad = 0;

reiniciaEdad( edadTan  ); // 0
console.log( edadTan ); // 25

// pase por referencia
let autos = ["Mazda", "Vochito"];
let cars = autos;
autos.push("Jeepeta");
console.log( autos ); //  ['Mazda', 'Vochito', 'Jeepeta']
console.log( cars ); //  ['Mazda', 'Vochito', 'Jeepeta']

const eliminarAuto = ( autos  ) => autos.pop(); // [ 'Mazda', 'Vochito' ]

eliminarAuto( autos );
console.log( autos ); // [ 'Mazda', 'Vochito' ]
console.log( cars ); // [ 'Mazda', 'Vochito' ]

eliminarAuto( panes );
console.log( panes ); // ['Concha', 'Pan de ajo', 'Dona de Chocolate']

// Una función impura puede modificar variables fuera de su
// ámbito, alterar el estado del programa, realizar operaciones de entrada/salida.

const apellidos = ["López", "Cabrera", "Hernandez"];
const lastName = apellidos.slice();
lastName.pop();
console.log( lastName ); // ['López', 'Cabrera']
console.log( apellidos ); // ['López', 'Cabrera', 'Hernandez']

// una función es un objeto de tipo function.
const retornaA = () => "a";
const retornaB = () => "b";
const retornaC = () => "c";

console.log( typeof retornaA ); // function
console.log( typeof retornaB ); // function
console.log( typeof retornaC ); // function

const imprimeValor = ( fncCallBack ) => console.log( fncCallBack() );
imprimeValor( retornaA   );


