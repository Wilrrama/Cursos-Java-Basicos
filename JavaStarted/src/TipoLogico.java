
public class TipoLogico {

	public static void main(String[] args) {
		boolean varVerdadeira = true;
		System.out.println("Vari�vel verdadeira: " + varVerdadeira);
		
		boolean varFalsa = false;
		System.out.println("Vari�vel Falsa: " + varFalsa);
	
		System.out.println("-----------------------");
		
		int idade = 18;
		
		Boolean podeTirarCarteira = idade >= 18;
		
		//System.out.println("Pode tirar carteira? " + podeTirarCarteira);
		
		if (podeTirarCarteira) {
			System.out.println("Sim! Ele(a) pode tirar carteira.");
		} else {
			System.out.println("N�o! Ele(a) n�o pode tirar carteira.");
		}
				
	}
}
