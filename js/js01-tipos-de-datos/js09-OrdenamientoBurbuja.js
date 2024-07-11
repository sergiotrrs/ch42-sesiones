const numbers = [20,16,8,1];
 // i=0 j=0      16,20,8,1
 // i=0 j=1      16,8,20,1
 // i=0 j=2      16,8,1,20
 // i=1 j=0      8,16,1,20
 // i=1 j=1      8,1,16,20
 // i=2 j=0      1,8,16,20
 // i=3 j=0      ---------
  
function ordenamientoBurbuja( numbers){
    for (let i = 0; i < numbers.length ; i++) {        
        for (let j = 0; j < numbers.length - 1 - i; j++) {
            if( numbers[j] > numbers[j+1]  ){                
                /*const temporalValue = numbers[i];
                numbers[j] = numbers[j+1];
                numbers[j+1] =  temporalValue;*/
                [numbers[j], numbers[j+1]] = [numbers[j+1], numbers[j]];
            } 
            console.log(`i:${i} - j:${j} : ${numbers}`);
        }        
    }

}

console.log("Desordenado", numbers);
ordenamientoBurbuja( numbers );
console.log("Ordenado",numbers);

// Desestructuración
let a = 2;
let b = 5;
[a,b] = [b,a];

const [varA, , , varB] = [23,5,7,9,4];

const datos = {
    firstName: "Dulce",
    lastName: "Karina",
    cohorte: 42
}

const {firstName:nombre, lastName} = datos;
nombre;
lastName;