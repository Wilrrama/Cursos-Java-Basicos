import java.util.Scanner;

public class PassouDeAno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
						
		System.out.print("Digite sua nota: ");
		int nota = sc.nextInt();
		
		boolean notaAprovada = nota >= 70;
		
		if (notaAprovada) {
			System.out.println("Parabéns, você Passou !");
		} else {
			System.out.println("Você não Passou !");
		}		
		
		sc.close();
	}
}
