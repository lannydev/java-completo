import java.util.Locale;
import java.util.Scanner;

public class LeituraDados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome, nome2, cor, idioma;
		int idade;
		double peso;
		char x;
		
		nome = sc.next();
		nome2 = sc.nextLine();
		cor = sc.nextLine();
		idioma = sc.nextLine();
		sc.nextLine();
		idade = sc.nextInt();
		peso = sc.nextDouble();
		x = sc.next().charAt(0);
		
		System.out.println("DADOS DIGITADOS");
		System.out.println(nome);
		System.out.println(nome2);
		System.out.println(cor);
		System.out.println(idioma);
		System.out.println(idade);
		System.out.println(peso);
		System.out.println(x);
		
		
		sc.close();

	}

}
