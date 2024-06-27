const pensamientoMariana = "Quiero comer una galleta chips Ahoy";
const pensamientoArlette = "Se me antojan unos hotcakes";
const miPensamiento = "Pensé en la sesión de hoy";

const myFunctionRubi = ()=> console.log("Rubí piensa que quiere dormir");

const berryDetails = { 
    nombre: "Mora",
    color: "café",
    talla: "mediana",
    ladrar: function(){
        return `${this.nombre} está ladrando`;
    },
    cortePelo: function(){
        return `A ${this.nombre} le están cortando su pelo color ${this.color}`;
    }
};

const tigerDetails = { 
    nombre: "Tiger",
    color: "atigrado",
    talla: "grande",
    ladrar: function(){
        return `${this.nombre} está ladrando`;
    },
    cortePelo: function(){
        return `A ${this.nombre} le están cortando su pelo color ${this.color}`;
    }
};

export { pensamientoMariana, miPensamiento, myFunctionRubi, berryDetails as detallesMora };
