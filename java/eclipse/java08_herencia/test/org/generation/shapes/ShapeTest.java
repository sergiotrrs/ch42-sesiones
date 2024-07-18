package org.generation.shapes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShapeTest {

	Shape square;
	
	@BeforeEach
	void setUp() {
		square = new Square("SpongeBob SquarePants", 20 );
	}

}
