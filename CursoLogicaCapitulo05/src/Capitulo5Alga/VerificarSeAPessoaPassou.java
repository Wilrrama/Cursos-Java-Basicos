package Capitulo5Alga;

import java.util.Scanner;

public class VerificarSeAPessoaPassou {
	public static void main(String[] args) {
	System.out.println("***Verificar se a Pessoa Passou No Concurso***");
	System.out.println();
	
	Scanner sc = new Scanner (System.in);
	
	System.out.print("Digite o Valor dos seu Pontos na Prova de Portugu�s 0 a 100: ");
	Integer pontosPortugues = sc.nextInt();
	
	System.out.print("Digite o Valor dos seu Pontos na Prova de Matem�tica 0 a 100: ");
	Integer pontosMatematica = sc.nextInt();

	Boolean minimoPortugues = pontosPortugues >= 60;
	Boolean minimoMatematica = pontosMatematica >= 60;
	
	Integer pontosTotal = pontosMatematica + pontosPortugues ;
	
	Boolean pontosNescessarios = pontosTotal >= 150;
	
	System.out.println();
	
	if (minimoMatematica && minimoPortugues && pontosNescessarios) {
		System.out.println("Parab�ns Wilson meu caramada, voce atingiu a meta de pontos e est� contratado!");
	} else {
		System.out.println("Que pena Wilson, n�o foi desse vez, mas foi por pouco, reconhecemos seu empenho "
				+ "nos estudos, continue assim, voce est� no caminho certo!");
	}
		
	sc.close();
	}
	
		
}
