import java.util.Scanner;

public class CadastrandoTarefas {
public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	
	String [] tarefas = new String[5];
	
	for (int i=0; i<5;i++) {
		System.out.print("Tarefa "+i+": ");
		tarefas[i] = sc.nextLine();
	}
	System.out.println("Suas tarefas são: ");
	for (int i =0; i < tarefas.length; i++) {
		System.out.println(i+":"+ tarefas[i]);
	}
		
	sc.close();
		
	}
	
}
