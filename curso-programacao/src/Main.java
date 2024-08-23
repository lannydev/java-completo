import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		System.out.println("Hello World!");
		
		double qualquerCoisa = 32.2564789654125365541;
		
		System.out.printf("%.2f%n", qualquerCoisa);
		
		Locale.setDefault(Locale.US );
		System.out.printf("%.4f%n", qualquerCoisa);
		
		
		
		String nome = "Elaine";
		int idade = 37; 
		double altura = 1.65;
		
		//Concatenação
		
		System.out.println("Meu nome é " + nome + ", e tenho " + idade + " anos");
		System.out.printf("Me chamo %s, tenho %d anos e %.2f de altura", nome, idade, altura);
		

	}

}
