package org.generation.shapes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {

	@Test
	void test() {
		Square square = new Square("Cuadradin", 41);
		assertEquals( 1_681 , square.getArea() );
	}
	
	@Test
	void doubleNumberTest() {
		Square square = new Square("Rubik", 9.9995 );
		assertEquals( 99.99000025 , square.getArea() );
		
		square.setSide( 0.01 );
		assertEquals( 0.0001 , square.getArea(), 0.00001 );

		square.setSide( 0.1 );
		assertEquals( 0.01 , square.getArea(), 0.001 );
		
		square.setSide( 0.2 );
		assertEquals( 0.04 , square.getArea(), 0.001 );
		
		square.setSide( 0.3 );
		assertEquals( 0.09 , square.getArea(), 0.001 );
	}

}
