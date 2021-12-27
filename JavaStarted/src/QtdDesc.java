import java.util.Scanner;

public class QtdDesc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o Valor do Produto: ");
		double valor = sc.nextDouble();
		System.out.print("Digite a Quantidade:");
		int qtd = sc.nextInt();
		
		double total = qtd * valor;
		
		boolean acimaDez = qtd >= 10;
		
		double desc = 0.0;
		
		if (acimaDez) {
			desc = 	total * 10 /100;	
			total = total - desc ;
					
		}
						
		System.out.print("Total a pagar:"+ total);
				
				
		sc.close();
		
		
	}
}
