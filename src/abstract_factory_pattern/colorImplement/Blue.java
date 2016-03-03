package abstract_factory_pattern.colorImplement;

import abstract_factory_pattern.Color;

public class Blue implements Color {
	@Override
	public void fill() {
		System.out.println("Inside Blue::fill() method.");
	}
}