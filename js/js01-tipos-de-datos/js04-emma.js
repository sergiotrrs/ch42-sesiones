console.log("Ejercicio propuesto por Emma");

const opciones = [11, 17, 14, 4, 8, 3, 16 ];

// Obtener la referencia de "arreglo-botones"
const arregloBotones = document.getElementById("arreglo-botones");

const imprimirTablaDeMultiplicar = (number) => {
    for (let i = 1; i <= 10; i++) {
      console.log(`${number} x ${i} = ${number * i}`);
    }
  };

const multiplica = (value) => imprimirTablaDeMultiplicar(value);

const crearBoton = ( number ) => {
    return `
        <div class="col-6 col-sm-4 col-md-2 my-2"> 
            <button 
                onclick="multiplica(${number})" 
                type="button" 
                class="btn btn-info"
                >
                    ${number}
            </button> 
        </div>
        `
};

const crearArregloBotones = ( opciones ) =>{
    let arregloFinalBotones =  "";
    for(let i = 0; i < opciones.length; i++ ){
        arregloFinalBotones = arregloFinalBotones + crearBoton( opciones[i] );
    }
    console.log( arregloFinalBotones );
    return arregloFinalBotones; // string
};

arregloBotones.innerHTML = crearArregloBotones( opciones );


// arregloBotones.innerHTML = "<h4> Quieres ver algo genial? </h4>";
// arregloBotones.innerHTML = `<h4> Quieres ver algo genial? </h4>`;
/* arregloBotones.innerHTML = `
<div class="col-6 col-sm-4 col-md-2"> ${ opciones[0] } </div>
<div class="col-6 col-sm-4 col-md-2"> ${ opciones[1] } </div>
<div class="col-6 col-sm-4 col-md-2"> ${ opciones[2] } </div>
<div class="col-6 col-sm-4 col-md-2"> ${ opciones[3] } </div>
<div class="col-6 col-sm-4 col-md-2"> ${ opciones[4] } </div>
`; */

/*
arregloBotones.innerHTML = `
<div class="col-6 col-sm-4 col-md-2"> <button type="button" class="btn btn-info">Info</button> </div>
<div class="col-6 col-sm-4 col-md-2"> <button type="button" class="btn btn-info">Info</button> </div>
<div class="col-6 col-sm-4 col-md-2"> <button type="button" class="btn btn-info">Info</button> </div>
<div class="col-6 col-sm-4 col-md-2"> <button type="button" class="btn btn-info">Info</button> </div>
<div class="col-6 col-sm-4 col-md-2"> <button type="button" class="btn btn-info">Info</button> </div>
`;
*/

/*
arregloBotones.innerHTML = `
<div class="col-6 col-sm-4 col-md-2"> 
    <button onclick="multiplica(${opciones[0]})" type="button" class="btn btn-info">${opciones[0]}</button> 
</div>
<div class="col-6 col-sm-4 col-md-2"> 
    <button onclick="multiplica(${opciones[1]})" type="button" class="btn btn-info">${opciones[1]}</button> 
</div>
<div class="col-6 col-sm-4 col-md-2"> 
    <button onclick="multiplica(${opciones[2]})" type="button" class="btn btn-info">${opciones[2]}</button> 
</div>
<div class="col-6 col-sm-4 col-md-2"> 
    <button onclick="multiplica(${opciones[3]})" type="button" class="btn btn-info">${opciones[3]}</button> 
</div>
<div class="col-6 col-sm-4 col-md-2"> 
    <button onclick="multiplica(${opciones[4]})" type="button" class="btn btn-info">${opciones[4]}</button> 
</div>
`;*/