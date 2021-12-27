
public class Operadores {

	public static void main(String[] args) {
		Integer adicao = 1+1;
		System.out.println("Adição: "+adicao);
		
		Integer subtracao = 1 - 1;
		System.out.println("Subtração: "+ subtracao );
		
		Integer multiplicacao = 2 * 2;
		System.out.println("Multiplicação: "+multiplicacao);
		
		Integer divisao = 4 / 2;
		System.out.println("Divisão: "+divisao);
		
		Integer modulo = 7 % 4;
		System.out.println("Módulo: "+modulo);
		
		Integer precedencia01 = 1+1*5;
		System.out.println("Precedencia 01: "+precedencia01);
		
		Integer precedencia02 = (1+1)*5;
		System.out.println("Precedencia 02: "+precedencia02);
		
		Integer precedencia03 = (1+1)*5 + 2;
		System.out.println("Precedencia 03: "+precedencia03);
		
		Integer precedencia04 = 5*((1+1)+ 2);
		System.out.println("Precedencia 04: "+precedencia04);
	
		Integer cinco = 5;
		int um = 1;
	
		Integer precedencia05 = cinco*((um+um)+ 2);
		System.out.println("Precedencia 05: "+precedencia05);
	
	}
	
}
