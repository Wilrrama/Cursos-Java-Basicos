import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculadora Simples");
		System.out.print("Digite o primeiro Numero: ");
		Double n1 = sc.nextDouble();
		System.out.print("Digite a opera��o: 1-Adi��o, 2-Subtra��o, 3-Multiplica��o, 4-Divis�o: ");
		Integer op = sc.nextInt();
		System.out.print("Digite o segundo Numero: ");
		Double n2 = sc.nextDouble();
		
		Double resultado = null;
				
		if (op.equals(1)) {
			resultado = n1 + n2;
		}
		
		if (op.equals(2)) {
			resultado = n1 - n2;
		}
		
		if (op.equals(3)) {
			resultado = n1 * n2;
		}
		
		if (op.equals(4)) {
			resultado = n1 / n2;
		}
		
		System.out.println("Resultado: " + resultado);
		
			sc.close();
				
	}
}
