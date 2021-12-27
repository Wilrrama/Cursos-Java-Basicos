import java.util.Scanner;

public class Vetores1Dimensao {

	public static void main(String[] args) {
//		String [] cardapio = new String[] { "Calabresa", "Atum", "Queijo", "Presunto" };
//		
//		System.out.println("Escolha o Sabor:");
//		
//		for ( int i = 0; i < cardapio.length; i++) {
//			System.out.println("["+i+"]"+cardapio[i]);
//						
//		}		
//		Scanner sc = new Scanner (System.in);
//		
//		System.out.print("Digite o numero referente ao sabor:");
//		Integer saborEscolhido = sc.nextInt();
//		
//		System.out.println("Voce escolheu o sabor:" + cardapio[saborEscolhido]);
//				
//		sc.close();
	
//		String [] cardapio = new String[] { "Calabresa", "Atum", "Queijo", "Presunto" };
//		
//		cardapio [3] = "Frango";
//		for ( int i = 0; i < cardapio.length; i++) {
//		System.out.println(cardapio[i]);
		
		String [] cardapio = new String[4000];
		cardapio [0]="Calabresa";
		cardapio [1]="Atum";
		cardapio [2]="Queijo";
		cardapio [3]="Presunto";
				
		for ( int i = 0; i < cardapio.length; i++) {
			System.out.println(cardapio[i]);
				
		}
	}

}
