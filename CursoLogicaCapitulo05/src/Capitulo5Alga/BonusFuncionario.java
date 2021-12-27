package Capitulo5Alga;

import java.util.Scanner;

public class BonusFuncionario {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite o valor da Meta: ");
		Double meta = sc.nextDouble();
		
		System.out.print("Digite o valor do Faturamento: ");
		Double faturamento = sc.nextDouble();
		
		System.out.print("Digite o valor da Media Salarial: ");
		Double media = sc.nextDouble();
		
		Double oitentaPorCentoDaMeta = (meta * 80) / 100;
		
		Boolean bateuAMeta = faturamento >= meta; 
		
		Boolean faturouPeloMenosOitentaPorCento = faturamento >= oitentaPorCentoDaMeta;
		
		if (bateuAMeta) {
			System.out.print("Bonus de 100%! Ser� de :"+media);
		} else if (faturouPeloMenosOitentaPorCento) {
			Double oitentaPorCentoDaMediaSalarial = (media * 80) / 100;
			System.out.print("Bonus de 80%! Ser� de :"+oitentaPorCentoDaMediaSalarial);
		} else {
			System.out.println("Infelizemnte, esse ano n�o tem b�nus!");
		}
		
		
		sc.close();
		
	}
	
}
