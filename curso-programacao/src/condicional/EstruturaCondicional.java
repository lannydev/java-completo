package condicional;

import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int anoAtual = 2024;
		
		System.out.println("Informe seu ano de nascimento: ");
		
		int anoNascimento;
		anoNascimento = sc.nextInt();
		
		
		int idade = anoAtual - anoNascimento;
		
				
		if(idade < 18) {
			System.out.println("Menor de idade!");
		}else {
			if(idade <= 20) {
				System.out.println("Maior idade penal, porém ainda pode ser dependente!");
			}
			else {
				System.out.println("maior de idade!");
			}
		}
		
		System.out.println("Obrigada pela atenção!");

	}

}
