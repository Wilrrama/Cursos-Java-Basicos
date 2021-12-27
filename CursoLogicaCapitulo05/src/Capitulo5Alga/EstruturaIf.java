package Capitulo5Alga;

public class EstruturaIf {
	public static void main(String[] args) {
		System.out.println("***Emprestimo Bancário***");
		System.out.println();
		
		Double emprestimo = 4000.0;
		Double movimentacaoMedia = 2000.0;
		
		Boolean movimentaPeloMenosMetadeDoValor = (movimentacaoMedia * 2) >= emprestimo;
		Boolean aContaTemTempoSuficienteDeAbertura = true;
		Boolean temNomeLimpo = true;
		
		Boolean liberarEmprestimo = movimentaPeloMenosMetadeDoValor &&
				aContaTemTempoSuficienteDeAbertura &&
				temNomeLimpo;
		
		if (liberarEmprestimo) {
			System.out.println("Sim! Pode liberar empréstimo.");
		}
		
	}
	
}
