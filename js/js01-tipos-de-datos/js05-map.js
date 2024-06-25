
console.log("Sesión de método map()");

/*
 Dado el arreglo [1, 2, 4, 10, 15] 
 Obtener un nuevo arreglo con el doble
 de valor del arreglo original: [ 2, 4, 8, 20, 30]
 */
               // [1, 2, 4, 10, 15] 
 const duplicarValor = ( array ) => {
    const newArray = [];
    for(let i = 0; i<array.length; i++ ){
      newArray.push( array[i] * 2 );
    }
    return newArray;
 };

 const myArray = [1, 2, 4, 10, 15] ;
 console.log(  duplicarValor( myArray )   ); // [2, 4, 8, 20, 30]

 /*
Método map() de los arreglos.

Este método crea un nuevo array con los resultados de aplicar 
una función a cada uno de los elementos del array original. 
Es una herramienta muy poderosa para transformar datos 
de manera funcional y concisa.

Sintaxis:
arr.map(function callback(currentValue, index, array) )

*/
const duplicarEdad = ( currentValue, index, array )=>{
    console.log(index, currentValue * 2 , array);
    return currentValue * 2;
}

const ages = [1, 2, 4, 10, 15] ;

const dobleAges = ages.map(  duplicarEdad  );
console.log( dobleAges );

//===========================================================

const numeros = [1, 2, 4, 10, 15] ;
// const duplicarNumeros = numeros.map( function doble(currentValue){ return currentValue*2} );
// const duplicarNumeros = numeros.map( currentValue => currentValue*2 );
const duplicarNumeros = numeros.map( number => number*2 );
console.log( duplicarNumeros );

//============== REDUCE =======================
const monedas = [5, 10, 5, 1, 50];

// Obtener la sumatoria de todos los valores
const sumarMonedas = ( array ) => {
    let sumatoria = 0;
    for (let index = 0; index < array.length; index++) {
        sumatoria = sumatoria + array[index];
    }
    return sumatoria;
}
console.log( sumarMonedas(  monedas  ) );

console.log( monedas.reduce( (sumatoria, currentValue)=> sumatoria + currentValue , 100 ) );