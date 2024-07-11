
const nombres = ["Diana", "alma","Estefania", "Arantxa", "Yoli"]

nombres.sort( (a,b)=> a.toLowerCase().localeCompare(b.toLowerCase()) );

console.log( nombres ); 
// [ 'alma', 'Arantxa', 'Diana', 'Estefania', 'Yoli' ]

const numbers = [12, 322, 34, 2, 9];
numbers.sort( (a,b)=> b-a );
// [ 2, 9, 12, 34, 322 ]
console.log( numbers );