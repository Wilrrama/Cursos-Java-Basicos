package Capitulo5Alga;

import java.util.Scanner;

public class IfEncadeado {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	System.out.println("***Categoria do Lutador***");
	System.out.println();
	
	System.out.print("Digite o peso: ");
	Double peso = sc.nextDouble();
	
	Boolean pesoLeve = peso <= 60 && peso >0 ;
	Boolean pesoMedio = (peso > 60) && (peso <= 90);
	Boolean pesoPesado = peso > 90;
	
	if (pesoLeve) {
		System.out.println("O lutador(a) é peso leve!");
	} else if (pesoMedio) {
		System.out.println("O lutador(a) é peso medio!");
	} else if (pesoPesado) {
		System.out.println("O lutador(a) é peso pesado!");
	} else {
		System.out.println("O lutador(a) está indefinido");
	}
	
	sc.close();
		
	}
}
