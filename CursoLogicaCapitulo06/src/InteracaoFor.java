public class InteracaoFor {

public static void main(String[] args) {
	
//	//	for (int i = 0; i <= 5 ; i= i++) {
//			
//			System.out.println( "Uma Frase Qualquer.");
//			}

//		Double[] carrinhoDeCompras = new Double [] {51.0,52.0,53.0};
//		Double total = 0.0;
//		for (int i = 0; i < carrinhoDeCompras.length; i++) {
//			System.out.println("Itera��o " + i + ", Total: " + total);
//			total = total + carrinhoDeCompras[i];
//			}
//		System.out.println("Total: " + total);
		
//		for ( int i =0; i <10; i++) {
//			
//			if (i == 7) {
//				System.out.println("Vair parar");
//				break;
//			}
//			
//			System.out.println("Itera��o: " + i);
//		}
	
//	for ( int i =0; i <10; i++) {
//		
//		if (i == 5) {
//			System.out.println("Vair continuar");
//			continue;
//		}			
//		
//		System.out.println("Itera��o: " + i);
//	}
	
		Integer [] produtos = new Integer [] {100,225,300};
		
		for (int i = 0; i < produtos.length; i++) {
			Integer produto = produtos[i];
			
			System.out.println("Produto de c�digo: " + produto);
						
			if ( produto.equals(255)) {
				System.out.println("Produto encontrado");
				break;				
			}
		}
	}
}