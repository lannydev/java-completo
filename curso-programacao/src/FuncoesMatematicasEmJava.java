import java.util.Scanner;

public class FuncoesMatematicasEmJava {

	public static void main(String[] args) {
		
		double delta;
		double x1;
		double x2;
		
		double a = 12.0;
		double b = 20;
		double c = 7.8;
		
		// Resolvendo a equação do segundo grau
		
		delta = Math.pow(b, 2.0) - 4 * a * c;
		
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		
		System.out.println("O valor de delta é: " + delta);
		System.out.printf("O valor de x1 é: %.2f%n", x1);
		System.out.printf("O valor de x2 é: %.2f%n", x2);
		
		
		// mostrando o valor absoluto de um valor com casas decimais
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o seu peso:");
		double peso;
		peso = sc.nextDouble();
		double pesoAbsoluto = Math.abs(peso);
		System.out.println("Resultado");
		System.out.println(peso);
		System.out.println(pesoAbsoluto);
		
		

	}

}
