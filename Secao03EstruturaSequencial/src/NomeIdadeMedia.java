import java.util.Scanner;

public class NomeIdadeMedia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome1 = sc.next();
		int idade1 = sc.nextInt();
		
		String nome2 = sc.next();
		int idade2 = sc.nextInt();
		
		double media = (double) (idade1 + idade2) /2;
		
		System.out.printf("A idade m�dia de %s e %s � %.1f anos%n", nome1, nome2, media);
						
		sc.close();
				
	}
}
