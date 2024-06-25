console.log( "js07 apiFetch" );

/*
 API: Application Programming Interface
   Permite la comunicación entre dos aplicaciones de software
   a travéz de un conjunto de reglas.

 La API Fetch nos ayuda a acceder y manipular 
 peticiones HTTP (DELETE, GET, POST, PUT).
 
 Sintaxis:
    fetch(resource, options)

*/

/**
 * Solicitud de personas usando
 * la apiFetch con then() y catch()
 * 
 */
const getSopita = ( url )=>{
    // then y catch son métodos para manejar promesas.
    fetch( url ).then( fncCallback ).catch();
    
    fetch( "https://vips/pedirServicio" )
    .then( (sopita)=> {  // promesa cumplida
        soplarSopita( sopita );
        ponerLimon( sopita );
        chopearTortilla( sopita );
        comerSopa( sopita);
    } )
    .catch( (error)=>{ // promesa rechazada
        explica( error );
        ponerseTriste();
        reclararMesero();
    } );
}


const convertirDeDuendeMalita = ( data )=> data.map( user=> ({name: user.firstName }) );
const convertirDeRickAndMorty = ( data )=> data.results.map( user=> ({name: user.name }) );
const insertarTarjetas = ( users) =>{
    const cards = users.map(  user => `
     <div class="col-lg-4 col-md-6 col-sm-10">
        <div class="card m-2">
            <div class="card-body">
               ${user.name}
            </div>
        </div>                
    </div>
        ` );
    return cards.join("");
}

const buttonSection = document.getElementById("arreglo-botones");

const getPersonas = ( url, convertirAUsuarios ) =>{

   // fetch( url ).then( ).catch();
    fetch( url )
        .then( (resolve)=> resolve.json() ) // Convierte de JSON a object
        .then( (data)=> {
            // console.log(data);
            const users = convertirAUsuarios( data );
            console.log( users );            
            buttonSection.innerHTML = insertarTarjetas( users );
        } )           
        .catch( (error)=> console.log(error)  );

};
getPersonas( "http://3.87.106.38/api/v1/users", convertirDeDuendeMalita );
//getPersonas( "https://rickandmortyapi.com/api/character", convertirDeRickAndMorty );



/*
 Las promesa es un patrón asincrónico que se utiliza
 para manejer operaciones asíncronas.

 Las promesas permite realizar tareas asíncronas y
 manejar los resultados (éxito o error) en un momento posterior.

 Las promesas tiene 3 estados:

 1.- Pending: El estado inicial de una promesa antes de que se resuelva o rechace
 2.- Resolved: La promesa se resuelve con un valor
 3.- Rejected: La promesa se rechaza con un razón

Resolve y reject con funciones de callback.
Para crear una promesa se usa el constructor de la clase Promise.

sintaxis:
    const pinkyPromise = new Promise ( fncCallBack );

*/