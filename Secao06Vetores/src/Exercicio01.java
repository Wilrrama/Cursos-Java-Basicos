import java.util.Scanner;

public class Exercicio01 {

	//Fa�a um programa que leia N n�meros inteiros e armazene-os 
	//em um vetor. Em seguida, mostrar na tela todos os n�meros 
	//negativos lidos
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] vet = new int [n];
		
		for (int i=0; i<n; i++) {
			vet[i] = sc.nextInt();
		}
		
		for (int i=0; i<n; i++) {
			if (vet[i] <0) {
				System.out.println(vet[i]);
			}
		}		
		sc.close();
	}
}
