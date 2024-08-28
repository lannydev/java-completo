import java.util.Scanner;

public class ExerciciosPrimeiroModulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os numeros para a primeira soma");
		
		int num1;
		int num2;
		
		num1 = sc.nextInt();
		sc.nextLine();
		num2 = sc.nextInt();
		
		int soma = num1 + num2;
		
		System.out.println("Segue os dados: ");
		System.out.println(num1 + " +");
		System.out.println(num2);
		System.out.println("O resultado da soma dos dois numeros acima é: " + soma);
		
		
		
		sc.close();

	}

}
