import java.util.Scanner;

public class Uri1113CrescenteEDecescente {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in)	;
	
	int x, y;
	
	x = sc.nextInt();
	y = sc.nextInt();
	
	while( x != y) {
		
		if( x < y) {
			System.out.println("Crescente");
		
		} else {
			System.out.println("Decrescente");
		}
		
		x = sc.nextInt();
		y = sc.nextInt();
	}	
	sc.close();
	}
}
