package com.bbva.sucursal;

import java.util.ArrayList;

import com.bbva.encapsulado.Atm;

public class SucursalTest {

	public static void main(String[] args) {
		
		// Realizar un ArrayList con 5 Atm
		ArrayList<Atm> cajeros = new ArrayList<>();
		cajeros.add( new Atm("GT23", 50_000) ); // 0
		cajeros.add( new Atm("GT23", 50_000) ); // 1
		cajeros.add( new Atm("GT23", 50_000) ); // 2
		cajeros.add( new Atm("GT25", 50_000) ); // 3
		cajeros.add( new Atm("GT25", 50_000) ); // 4

		// Mostrar los datos del ATM indice 2 de la colección
		// Num Serie, Amount, Modelo
		System.out.println( cajeros.get(2).getModel() );
		System.out.println( cajeros.get(2).getAmount() );
		System.out.println( cajeros.get(2).getSerialNumber() );
		
		// Mostrar el núm total de cajeros
		System.out.println("ATMs: " +  Atm.getCounter() );
		
		// Agregar un Atm con valores por default
		Atm cajeroDefault = new Atm();
		cajeros.add( cajeroDefault ); // index 5
		System.out.println("==== index 5 ======");
		System.out.println( cajeros.get(5).getModel() ); // T-800
		System.out.println( cajeros.get(5).getAmount() ); // 1000000
		System.out.println( cajeros.get(5).getSerialNumber() ); // 6
		
		cajeros.get(5).setAmount(2_000_000);
		
		cajeros.get(5).setAmount( "800000" );
		System.out.println( cajeros.get(5).getAmount() );
		
	}

}
