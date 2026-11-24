import java.util.Scanner;

public class Palindromo {
	public static void main(String[] args) {
		int a[], b[], i, j = 9;
		final int TAM = 10;
		a = new int [TAM];
		b = new int [TAM];
		
		Scanner leia = new Scanner (System.in);
		
		for (i = 0; i < TAM; i++) {
			System.out.println("Digite o " + (i + 1) + "º valor de A");
			a[i] = leia.nextInt();
			b[i] = a[i];
		}
		
		for (i = 0; i < TAM; i++) {
			if (a[i] == b[j]) {
				System.out.println("É um palíndromo");
			} else {
				System.out.println("Não é um palíndromo");
			}
			j--;
		}
		

	}
	
}	
