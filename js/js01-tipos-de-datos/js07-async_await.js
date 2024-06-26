console.log("js07 async y await");

/*
En JavaScript, async y await son palabras clave que se utilizan 
para trabajar con promesas de una manera más sencilla y legible. 
Estas características fueron introducidas en ECMAScript 2017 (ES8)
y permiten escribir código asíncrono de forma que se parezca más 
al código síncrono. 

La palabra clave async se utiliza para declarar una función asíncrona. 
Una función asíncrona es una función que siempre devuelve una promesa. 
Incluso si la función no retorna explícitamente una promesa, 
JavaScript envolverá el valor de retorno en una promesa resuelta.

La palabra clave await se utiliza dentro de las funciones async 
para esperar a que una promesa se resuelva. 
await hace que JavaScript espere hasta que la promesa devuelva 
un resultado. Solo se puede usar await dentro de funciones 
declaradas con async.

*/

async function myFunction(){

}

const getPersonajes = async ( url ) => {
    console.log("inicia mi async-await");
    const resolve =  await fetch(url);
    const data = await resolve.json();
    const personajes = data.results;
    console.log( personajes );

    console.log("termina mi async-await");

}

/*
    En JavaScript, try y catch son bloques utilizados para 
    manejar errores. Permiten controlar el flujo de ejecución 
    del código cuando ocurren excepciones, lo que ayuda a evitar 
    que los errores detengan abruptamente el programa.

    sintaxis:
       try{

       } catch( exception) {

       }
  */
const setUp = async ()=>{
    console.log("Inicio la configuración de la app");
    try{
        await getPersonajes( "https://rickandmortyapi.com/api/character/?page=10" );    
    } catch( exception ){
        console.error("Ay nanita, algo salió mal" , exception);
    }
    console.log("Finalizo la configuración de la app");
}
setUp();