console.log("js07 async y await");

/*
 for each
 while
 do-while

*/
/**
let counter = 0;
while( confirm("¿Deseas obtener el 2x1?") ){
    counter++;
    console.log( "Número de veces que aceptas: " + counter);
}
console.log("Has salido de la promoción");
*/
for (let i = 1; i <= 10; i++) {
    console.log(i)    
}

// Realizar lo anterior utilizando el ciclo while ( while loop)
// mostrar del 1 al 10
let index = 1;
while (index <= 10) {
    console.log(index);
    index++;
};

const numbers = [2,3,4,6,10];
for (let index = 0; index < numbers.length; index++) {
    const element = numbers[index];
    console.log( element);    
}

// for of
for(let number of numbers ) {
    console.log( number )
}

// numbers.forEach( fncCallback  );
numbers.forEach( (number, index, array )=> console.log(number)  );

