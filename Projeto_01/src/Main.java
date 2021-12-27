import com.dankicode.utilidades.utils;

public class Main {

		
	public static void main (String[] args ) {
		utils utils = new utils();
		utils.printHelloWorld();
		System.out.println(utils.numero);
	
		utils utils2 = new utils();
		utils2.numero = 10;
		System.out.println(utils2.numero);
	
	}
	
}
