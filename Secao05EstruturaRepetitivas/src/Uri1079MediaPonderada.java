import java.util.Locale;
import java.util.Scanner;

public class Uri1079MediaPonderada {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
				
		for (int i=1; i <= n; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			double soma = (a*2 + b*3 + c*5) /10;			
			System.out.printf("%.1f%n",soma);			
		}				
		sc.close();
	}
}
