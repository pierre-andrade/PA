import java.util.Scanner;

public class RelacaoPar {

	public static void main(String[] args) {
		int a[], i, j = 0, k = 0;
		final int TAM = 10;
		a = new int [TAM];
		
		Scanner leia = new Scanner (System.in);
		
		for(i = 0; i < TAM; i++) {
			System.out.println("Digite o " + (i+1) + "º valor de A");
			a[i] = leia.nextInt();
		}
		
		for (i=0; i < TAM; i++) {
			if (a[i] % 2 == 0) {
				for(j = 0; j <= a[i]; j = j + 2) {
					System.out.print(j + ", ");
			}
		} else {
			for(k = 0; k < a[i]; k++) {
				if (k % 2 == 0) {
					System.out.print(k + ", ");
				}
			}
			System.out.print(a[i]);
		}
			
		System.out.println(" ");
	}

}
	
}