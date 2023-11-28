package repeticoes;
import java.util.Scanner;

public class exerc05while {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um numero para saber se seus antecessores são pares ou impares: ");
		int num = input.nextInt();
		int x = 1;
		
		System.out.println("impares: ");
		while (x <= num) {
			if (x % 2 != 0) {
				System.out.print(x);
			} 
			x++;
		}
		System.out.println("\n");
		System.out.println("pares: ");
		x = 1;
		while (x <= num) {
			if (x % 2 == 0) {
				System.out.print(x);
			}
			x++;
		}
	}
}
