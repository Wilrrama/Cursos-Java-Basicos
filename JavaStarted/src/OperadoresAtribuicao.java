
public class OperadoresAtribuicao {

	public static void main(String[] args) {
		Integer numero = 7;
		
		numero = numero + 4;
		System.out.println("numero7 + 4 : " +numero);
		
		numero = numero += 4;
		System.out.println("numero7 += 4 : " +numero);
		
		numero = numero -= 4;
		System.out.println("numero7 -= 4 : " +numero);
		
		numero = numero %= 4;
		System.out.println("numero7 %= 4 : " +numero);
		
	}
}
