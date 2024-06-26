const buttonSection = document.getElementById("arreglo-botones");

const insertarTarjetas = ( users) =>{
    const cards = users.map(  user => `
     <div class="col-lg-3 col-md-4 col-sm-5">
        <div class="card m-2">
        <img src="${user.image}" class="card-img-top" alt=${user.name}>
            <div class="card-body">
               ${user.name}
            </div>
        </div>                
    </div>
        ` );
    return cards.join("");
}

const getPersonas = ( url ) =>{
    console.log("inicia mi fetch");
    fetch( url )
        .then( (resolve)=> resolve.json() ) 
        .then( (data)=> {            
            console.log( data );            
            buttonSection.innerHTML =  insertarTarjetas( data.results );
        } )           
        .catch( (error)=> console.log(error)  );
    console.log("Termina mi fetch");
};

// getPersonas( "https://rickandmortyapi.com/api/character");
getPersonas( "https://rickandmortyapi.com/api/character/?page=1");
