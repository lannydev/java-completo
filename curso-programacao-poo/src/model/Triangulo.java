package model;

public class Triangulo {
	
	public double ladoA;
	public double ladoB;
	public double ladoC;
		
	
	
	public double calcularAreaTriangulo(double ladoA, double ladoB, double ladoC) {
		
		double p = (ladoA + ladoB + ladoC)/2;
		
		double area = Math.sqrt(p*(p - ladoA) * (p - ladoB) * (p - ladoC));
		
		System.out.printf("A área do triangulo é: %.4f%n ", area);
		
		return area;
		
		
	}
	

}
