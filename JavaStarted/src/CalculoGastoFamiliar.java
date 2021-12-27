import java.util.Scanner;

public class CalculoGastoFamiliar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Double total = 0.0;
		
		System.out.println("Gastos Familiares do Mês");
		System.out.print("CPFL : ");
		total += sc.nextDouble();
		System.out.print("SABESP : ");
		total += sc.nextDouble();
		System.out.print("INTERNET : ");
		total += sc.nextDouble();
		System.out.print("ESCOLA : ");
		total += sc.nextDouble();
		System.out.print("CARTÃO : ");
		total += sc.nextDouble();
		System.out.print("ALIMENTAÇÃO : ");
		total += sc.nextDouble();
						
		System.out.print("TOTAL MENSAL : " + total);
		
		sc.close();
		
	}
	
}
