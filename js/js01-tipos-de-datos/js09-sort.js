
const nombres = ["Diana", "alma","Estefania", "Arantxa", "Yoli"]

nombres.sort();

console.log( nombres ); 
// [ 'Arantxa', 'Diana', 'Estefania', 'Yoli', 'alma' ]

const numbers = [12, 322, 34, 2, 9];
numbers.sort( (a,b)=>{
    if(a<b) return -1;
    else if(b>a) return 1;
    else return 0;
});
// [ 2, 9, 12, 34, 322 ]
console.log( numbers );