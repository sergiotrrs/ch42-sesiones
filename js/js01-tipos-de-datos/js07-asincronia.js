console.log("JS07- asincronia");

/*
 La asincronía en JavaScript es un concepto clave que permite 
 que el lenguaje maneje operaciones que toman tiempo 
 (como solicitudes de red, lectura/escritura de archivos, temporizadores, etc.) 
 sin bloquear la ejecución del programa. Esto es crucial para mantener 
 la aplicación receptiva y eficiente.
*/



/*
 Programación síncrona
 Se ejecuta una tarea después de otra, de manera secuencial.
 Si una tarea tarda mucho tiempo en completarse, puede bloquear
 la ejecución de otra tarea.
*/

const primerPaso = () => console.log("01-primer paso");
const segundoPaso = () => {
    for(let i = 0; i < 1_000_000_000; i++  ) i * 2;
    console.log("02-desarrollo de mi programa");
}
const tercerPaso = () => console.log("03-fin de mi programa");

//primerPaso();
//segundoPaso();
//tercerPaso();

/*
 Programación asíncrona.
 Las tareas no se bloquean entre sí.
 La programación asíncrona es fundamental en JavaScript para
  realizar operaciones no bloqueantes, como peticiones HTTP, 
  operaciones de lectura/escritura de archivos, etc., 
  lo que mejora el rendimiento y la capacidad de respuesta 
  de las aplicaciones.

*/

/*
  Función setTimeout()
   Establece un temporizador que ejecuta una función de callback
   una vez que expire el temporizador

   sintaxis:
     setTimeout( fncCallback, tiempo_ms, argumentos_fnc );
     setTimeout( ()=>{}  , tiempo_ms );

*/

const saludoAsincrono = ( name ) => {
    //setTimeout( ()=>console.log(name)  ,   3000   );
    setTimeout( (nombre)=>console.log(nombre), 3000, name );
}
primerPaso();
saludoAsincrono("Rubi");
tercerPaso();

// setInterval()
// Ejecuta una función de manera reiterada con un tiempo de retardo fijo
const saludos = [
    "Hola",
    "Hello", 
    "Que transita por tus venas",
    "Konnichiwua", 
    "Ciao",
    "Hallo",
    "Hej",
    "Bonjour",
    "Olá"
];

const enviarSaludo = ( saludos ) =>{
    let indice = 0;
    const title = document.getElementById("app-title");
    setInterval( ()=>{
        if( indice >= saludos.length ) indice = 0;
        title.innerHTML = saludos[indice];
        indice++;
    } , 3000 );
}
enviarSaludo( saludos );