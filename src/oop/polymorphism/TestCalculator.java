package oop.polymorphism;

public class TestCalculator {

	public static void main(String[] args) {
		
		
		Calculator cal = new Calculator();
		System.out.println(cal.landOfArea(5, 10));
		System.out.println(cal.landOfArea(5, 10, 15));
		System.out.println(cal.landOfArea(5, 10, 15, 20));
		
		
		ModernCalculator mc = new ModernCalculator();
		System.out.println(mc.landOfArea(5, 10, 15, 20));

	}

}
