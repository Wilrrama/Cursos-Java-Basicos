package Capitulo5Alga;

import java.util.Scanner;

public class DiaDaSemana {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o dia Semana: ");
		Integer dia = scanner.nextInt();

		String diaDaSemana; 
		
		switch (dia) {
		case 1: diaDaSemana = "Domingo";
			break;
		case 2: diaDaSemana = "Segunda";
			break;
		case 3: diaDaSemana = "Terça";
			break;
		case 4: diaDaSemana = "Quarta";
			break;
		case 5: diaDaSemana = "Quinta";
			break;
		case 6: diaDaSemana = "Sexta";
			break;
		case 7: diaDaSemana = "Sábado";
			break;
		default:
			diaDaSemana = "Digite uma dia valido";
			break;
		}
		
		System.out.println("O Dia escolhido foi: "+diaDaSemana);
		
		
		scanner.close();
		
	}

}
