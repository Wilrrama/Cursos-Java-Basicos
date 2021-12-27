import java.util.Scanner;

public class VerificacaoAposentadoria {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite sua idade: ");
		Integer idade = sc.nextInt();
		System.out.print("Digite anos de contribuição: ");
		Integer anos = sc.nextInt();
		
		System.out.println();
		
		if (idade >= 55 && anos >= 25) {
			System.out.println("Opa, já pode aponsetar!");
		} else {
			System.out.println("Não hein..., vai ter que contribuir mais até chegar aos 25 anos de contribuição ou aos 55 de idade.");
		}
		
		
		sc.close();
		
		
	}
}
