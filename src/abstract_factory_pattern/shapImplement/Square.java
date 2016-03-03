package abstract_factory_pattern.shapImplement;

import abstract_factory_pattern.Shape;

public class Square implements Shape {
	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}