package factory_pattern.shapImplment;

import factory_pattern.Shape;

public class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}