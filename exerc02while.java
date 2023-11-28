package repeticoes;
import java.util.Scanner;

public class exerc02while {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.print("Digite a quantidade de alunos: ");
		int quantAlunos = input.nextInt();
		int cont=1;
		double soma=0;
		
		while(cont <= quantAlunos) {
			System.out.print("Digite a nota: ");
			double notas = input.nextDouble();
			soma = soma + notas;
			cont++;
		}
		double media = soma/ quantAlunos;
		System.out.println("A media das notas dos alunos da sala e: " + media);
	}
}
