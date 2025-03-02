package string;

public class OperacaoSplit {

	public static void main(String[] args) {
		String frase = "Me chamo Elaine";
		
		String[] vetor = frase.split(" ");
		
		String primeiraPalavra = vetor[0];
		String segundaPalavra = vetor[1];
		String terceiraPalavra = vetor[2];
		
		
		System.out.println(primeiraPalavra);
		System.out.println(segundaPalavra);
		System.out.println(terceiraPalavra);
		

	}

}
