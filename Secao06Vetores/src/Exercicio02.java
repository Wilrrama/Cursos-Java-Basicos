import java.util.Locale;
import java.util.Scanner;

//Fa�a um programa que leia N n�meros reais e armazene-os em um vetor. 
//Em seguida:
//- Imprimir todos os elementos do vetor
//- Mostrar na tela a soma e a m�dia dos elementos do vetor

public class Exercicio02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] vet = new double[N];
		for (int i=0; i<N; i++) {
		vet[i] = sc.nextDouble();
		}
		for (int i=0; i<N; i++) {
		System.out.print(vet[i] + " ");
		}
		System.out.println();
		double soma = 0.0;
		for (int i=0; i<N; i++) {
		soma = soma + vet[i];
		}
		System.out.printf("%.2f%n", soma);
		double media = soma / N;
		System.out.printf("%.2f%n", media);
		sc.close();
		}
		}

