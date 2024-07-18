package org.generation.shapes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class ShapeTest {

	Square square; // contenedor
	
	@BeforeEach
	void setUp() {
		square = new Square("SpongeBob SquarePants", 20 );
	}
	
	@Test
	@DisplayName("Verificar el área del cuadrado")
	void areaTest() {
		assertEquals( 400, square.getArea(), "Tiene que dar 400" );
	}
	
	@Test
	@DisplayName("Modificar el nombre del cuadrado")
	void changeNameTest() {
		square.setName("Bob Esponja");
		assertEquals( "Bob Esponja", square.getName() );
	}
	
	@Test
	@DisplayName("Modificar el valor del lado del cuadrado")
	void changeSideTest() {
		square.setSide( 50 );
		assertEquals( 50, square.getHeight(), "Verificar la altura" );
		assertEquals( 50, square.getWidth(), "Verificar el ancho" );
		assertEquals( 50, square.getSide(), "Verificar el lado" );		
		assertEquals( 2_500, square.getArea(), "Verificar el área" );
	}

}
