package com.bbva;

public class AtmTest {

	public static void main(String[] args) {
		
	 Atm cajero01 = new Atm("GT23", 50_000 );
	 System.out.println( cajero01.serialNumber);
	 System.out.println( cajero01.model);
	 System.out.println( cajero01.balance);
	 
	 // Instanciar Atm y asignar a la variable cajero02
	 Atm cajero02 = new Atm("BX98", 64_000);
	 System.out.println(cajero02.serialNumber);
	 System.out.println(cajero02.model);
	 System.out.println(cajero02.balance);
	 
	 // Mostrar atributos estáticos
	 System.out.println( cajero01.bankName ); // BBVA
	 System.out.println( cajero02.bankName ); // BBVA
	 // Se recomienda acceder al atributo estático
	 // usando el nombre de la clase.
	 Atm.bankName = "Bancomer";	 
	 System.out.println( Atm.bankName); // Bancomer
	 System.out.println( Atm.bankName); // Bancomer
	 // Librerías de utilidad
	 System.out.println( Math.PI );
	 System.out.println( Math.sin(1) );
	 
	 Atm cajero03 =  new Atm("MT45", 99_000);
	 Atm cajero04 =  new Atm("MT45", 99_000);
	 Atm cajero05 =  new Atm("MT45", 99_000);
	 
	 System.out.println("Núm. cajeros: " + Atm.size() );
	 
	 
	 
	 
	}

}
