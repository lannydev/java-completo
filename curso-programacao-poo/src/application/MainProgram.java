package application;

import java.util.Locale;
import java.util.Scanner;

import model.Triangulo;

public class MainProgram {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new  Scanner(System.in);
		
		
		Triangulo triangulo1 = new Triangulo();
		System.out.println("Informe o tamanho dos lados do primeiro triângulo");
		triangulo1.ladoA = sc.nextDouble();
		triangulo1.ladoB = sc.nextDouble();
		triangulo1.ladoC = sc.nextDouble();
		
		double areaTriangulo1 = triangulo1.area();
		System.out.printf("A área do primeiro triangulo é %2f%n", areaTriangulo1);
		
		
		Triangulo triangulo2 = new Triangulo();
		System.out.println("Informe o tamanho dos lados do segundo triângulo");
		triangulo2.ladoA = sc.nextDouble();
		triangulo2.ladoB = sc.nextDouble();
		triangulo2.ladoC = sc.nextDouble();
		
		double areaTriangulo2 = triangulo2.area();
		System.out.printf("A área do primeiro triangulo é %2f%n", areaTriangulo2);
		

		if(areaTriangulo1 > areaTriangulo2) {
			System.out.printf("O Trangulo com maior área é o primeiro triângulo com área de  %.4f%s%n", areaTriangulo1, "cm");
		}else {
			System.out.printf("O Trangulo com maior área é o segundo triângulo com área de %.4f%s%n", areaTriangulo2, "cm");
		}
		
		
		
		sc.close();

	}

}
