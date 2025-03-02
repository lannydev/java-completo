package string;

public class FuncaoString {

	public static void main(String[] args) {
		
		String nomeCompleto = "Elaine Cristina Cruz de Jesus ";
		
		// converte tudo em letra minuscula
		String nomeAtual = nomeCompleto.toLowerCase();
				
		// converte toda a string em latra maiúscula
		String nomeMaiusculo = nomeCompleto.toUpperCase();
				
		// retira o espaço no final da string
		String s4 = nomeCompleto.trim();
		
		// retina determinada quantidade de caracteres da string
		String s5 = nomeCompleto.substring(3);
		
		// retira caracteres entre as posições informadas
		String s6 = nomeCompleto.substring(4, 10);
		
		
		// substitui os caracteres
		String s7 = nomeCompleto.replace('a', 'x');
		
		// substitui substring
		String s8 = nomeCompleto.replace("ai", "xy");
		
		// revela a primeira posição de um item da string
		int s9 = nomeCompleto.indexOf("Cr");
		
		// revela a primeira posição de um item da string
		int s10 = nomeCompleto.lastIndexOf("Cr");
		
		System.out.println("Original: -" + nomeCompleto + "-");
		System.out.println("ToLowercase: -" + nomeAtual + "-");
		System.out.println("ToUpperCase: -" + nomeMaiusculo + "-");
		System.out.println("Trm: -" + s4 + "-");
		System.out.println("Sub String: -" + s5 + "-"); 
		System.out.println("Sub String: -" + s6 + "-");
		System.out.println("Replace: -" + s7 + "-");
		System.out.println("Replace: -" + s8 + "-");
		System.out.println("Index Of: -" + s9 + "-");
		System.out.println("Last Index Of: -" + s10 + "-");
		
	}

}
 