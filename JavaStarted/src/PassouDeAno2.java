import java.util.Scanner;

public class PassouDeAno2 {
	
	static final int Nota_Para_Ser_Aprovado = 70;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
			
		System.out.print("Digite sua nota: ");
		int nota = sc.nextInt();
		
		boolean notaAprovada = nota >= Nota_Para_Ser_Aprovado;
		
		if (notaAprovada) {
			System.out.println("Parab�ns, voc� Passou !");
		} else {
			System.out.println("Voc� n�o Passou !");
		}		
		
		sc.close();
	}
}
