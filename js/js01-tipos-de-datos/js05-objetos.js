console.log("js05 objetos");

// Un objeto es una colección de propiedades y métodos.
// Los valores de las propiedades pueder ser de cualquier tipo (incluso otros objetos)
// Una propiedad es una asociación entre un nombre(key) y un valor(value).

const celularSerch = { 
    propietario: "Serch",
    modelo : "Iphone 30SUltraMax",
    numSerie : "A1266830" ,
    IMEI: "HTY89910",
    color: "blanco",
    memoriaRamGb : 1024,
    memoriaInternaGb: 3000,
    precio: 100000,
    pantallaInch: 22 
};

console.table( celularSerch );
// Leer el IMEI del celular
console.log( celularSerch["IMEI"] ); // HTY89910
console.log( celularSerch.IMEI  ); // HTY89910

// Leer el atributo color
console.log(celularSerch.color);

// Modificar el atributo precio a $35000 e imprimir
celularSerch.precio = 35000;
console.log(celularSerch.precio);

// Que realizarías para almacenar varios objetos de celulares?

const celulares = [   celularSerch   ];

celulares.push(  { 
    propietario: "Mariana",
    modelo : "Iphone 12",
    numSerie : "A00981" ,
    IMEI: "HTY87777",
    color: "morado",
    memoriaRamGb : 16,
    memoriaInternaGb: 256,
    precio: 23000,
    pantallaInch: 12 
}  );

console.log( celulares );

// Agregar 2 celulares más
celulares.push( {  
    propietario: "Marbe",
    modelo : "W1000",
    numSerie : "A888321" ,
    IMEI: "NoLoRobe",
    color: "Azul",
    memoriaRamGb : 32,
    memoriaInternaGb: 128 ,
    precio: 15000,
    pantallaInch: 14, 
} );

celulares.push({
    propietario: "Susy",
    modelo : "SamsungGalaxyS24Ultra",
    numSerie : "A1266831",
    IMEI : "HTY89911",
    color : "Rosa",
    memoriaRamGb : 32,
    memoriaInternaGb : 1024,
    precio : 30000,
    pantallaInch : 7
});

celulares.push(  { 
    propietario: "Jaqui",
    modelo : "Iphone 2A2",
    numSerie : "A1264545" ,
    IMEI: "HTUI09090",
    color: "negro",
    memoriaRamGb : 8,
    memoriaInternaGb: 500,
    precio: 20000,
    pantallaInch: 32 
}  );

console.log( celulares );

// Mostrar la persona propietaria y el modelo de su celular
for (let i = 0; i < celulares.length; i++) {
    // const element = celulares[i];
    // console.log( element.propietario, element.modelo );
    console.log( celulares[i].propietario, celulares[i].modelo );    
}

// ==============================
const mesCumpleaños = (mes) =>{
  if ( mes === 12 || mes <= 2) {
    console.log("invierno");
  } else if ( mes >=3 && mes <= 5 ){  //(5 >= mes && mes >= 3) {
    console.log("primavera");
  } else if ( mes >= 6 && mes <= 8 ) {
    console.log("verano");
  } else if ( mes >= 9 && mes <= 11) {
    console.log("otoño");
  } else {
    console.log("error de entrada");
  }
}

mesCumpleaños(5);

// ======================
function obtenerEstacion(mes) {
    if( mes >= 1 && mes<=12 ){
    const estaciones = {
        12: "Invierno",
        1: "Invierno",
        2: "Invierno",
        3: "Primavera",
        4: "Primavera",
        5: "Primavera",
        6: "Verano",
        7: "Verano",
        8: "Verano",
        9: "Otoño",
        10: "Otoño",
        11: "Otoño",
    }; 
    return estaciones[mes];
} else {
    return "Error en el mes";
}
}
let mesDeCumpleanos = 7; 

let estacion = obtenerEstacion(mesDeCumpleanos);
console.log(estacion);

