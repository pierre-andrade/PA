import java.util.Scanner;

public class RelacaoDivisores {
	public static void main (String [] args) {
		int a [], i = 0, j = 1;
		final int TAM = 10;
		a = new int [TAM];
		
		Scanner leia = new Scanner (System.in);
		
		for(i = 0; i < TAM; i++) {
			System.out.println("Digite o " + (i + 1) + "º valor de A");
			a[i] = leia.nextInt();
		}
		
		for (i = 0; i < TAM; i ++) {
			for (j = 1; j <= a[i]; j++) {
				if (a[i] % j == 0) {
					System.out.print(j + " ");
				}
			}
			System.out.println(" ");
		}
		
		
	}
}
