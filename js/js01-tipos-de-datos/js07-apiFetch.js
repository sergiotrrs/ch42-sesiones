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

const getPersonas = ( url ) =>{

   // fetch( url ).then( ).catch();
    fetch( url )
        .then( (resolve)=> resolve.json() ) // Convierte de JSON a object
        .then( (personas)=> console.log(personas)   )
        .catch( (error)=> console.log(error)  );

};
getPersonas( "http://3.87.106.38/api/v1/users" );
getPersonas( "https://rickandmortyapi.com/api/character" );