import java.util.Scanner;

public class Somatoria {
	public static void main(String[] args) {
		int a[], b[], i, j;
		final int TAM = 10;
		a = new int [TAM];
		b = new int [TAM];
		
		Scanner leia = new Scanner (System.in);
		
		for(i = 0; i < TAM; i++) {
			a[i] = leia.nextInt();
		}
		
		for(i = 0; i < TAM; i++) {
			b[i] = a[i];
			j = 0;
			for (; j <= 10; j++) {
				b[i] = b[i] + j;
			}
		}
		
		System.out.print("\n B = [ ");
		for(i = 0; i < TAM; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.print("]");
	}

}
