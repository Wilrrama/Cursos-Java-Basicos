import java.util.Scanner;

public class DescontoAcimaDeCem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o Valor do Produto: ");
		Double valorProduto = sc.nextDouble();
		Boolean precisaCobrarFrete = valorProduto < 100 ;
		
		Double valorFinal = valorProduto;
		
		if (precisaCobrarFrete) {
			valorFinal += 15.0;
		}
		
		System.out.println("Valor final " + valorFinal);
				
		
		sc.close();
		
	}
		
}
