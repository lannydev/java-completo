package condicional;

import java.util.Scanner;

public class CondicionalTernaria {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble();
		double desconto = (valor < 20.0) ? valor * 0.05 : valor * 0.1;
		
		double valorFinal = valor-desconto;
		
		System.out.println(valor);
		System.out.println(desconto);
		System.out.println(valorFinal);
		
		
		sc.close();
		
	}

}
