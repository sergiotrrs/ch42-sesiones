const pensamientoMariana = "Quiero comer una galleta chips Ahoy";
const pensamientoArlette = "Se me antojan unos hotcakes";
const miPensamiento = "Pensé en la sesión de hoy";

const myFunctionRubi = ()=> console.log("Rubí piensa que quiere dormir");

const detallesMora = { 
    nombre: "Mora",
    color: "café",
    talla: "mediana",
    ladrar: function(){
        return `${detallesMora.nombre} está ladrando`;
    },
    cortePelo: function(){
        return `A ${detallesMora.nombre} le están cortando su pelo color ${detallesMora.color}`;
    }
};

export { pensamientoMariana, miPensamiento, myFunctionRubi, detallesMora };
