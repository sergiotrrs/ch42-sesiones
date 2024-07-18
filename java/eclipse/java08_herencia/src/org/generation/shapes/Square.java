package org.generation.shapes;

public class Square extends TwoDimensionalShape {

	protected Square(String name, double side) {
		super(name, side, side);		
	}

	/**
	 *  Sobreescritura de métodos (Override)
	 *  
	 *  Para que un método sea sobreescrito, este debe tener la misma
	 *  firma del método de la clase superior. La sobreescritura permite
	 *  personalizar el comportamiento heredado.
	 *  
	 *  @Override: Anotación que indica que el método está sobreescribiendo
	 *  el comportamiento de una método de la clase heredada.
	 *  Su propósito es hacer una validación en tiempo de
	 *  compilación para asegurarse que la subclase está
	 *  sobreescribiendo correctamente y coincide
	 *  con la firma del método.
	 */
	@Override
	public double getArea() {
		return super.getWidth() * super.getHeight();
	}

	@Override
	public double getPerimeter() { 
		return super.getHeight() * 4;
	}
	
	public void setSide(double side) {
		super.setWidth(side);
		super.setHeight(side);
	}
	
	public double getSide() {
		return super.getHeight();
	}
	
	
}
