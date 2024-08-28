import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor do raio.");
		
		double raio;
		raio = sc.nextDouble();
		
		double pi = Math.PI;
		double area = pi * (Math.pow(raio, 2.0));
		
		System.out.println("Saída: ");
		System.out.println("Valor digitado" + raio);
		System.out.println("valor de pi " + pi);
		System.out.printf("O valor da área é %.4f", area);
		
		
		sc.close();


	}

}
