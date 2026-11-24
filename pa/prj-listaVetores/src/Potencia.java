import java.util.Scanner;

public class Potencia {
	public static void main(String[] args) {
		int a[], i, j = 1, r;
		final int TAM = 11;
		a = new int [TAM];
		
		Scanner leia = new Scanner (System.in);
		
		for (i = 0; i < TAM; i++) {
			a[i] = 2;
		}
		
		for (i = 0; i < TAM; i++) {
			j = 1;
			for (; j < i; j++) {
				a[i] = a[i] * 2;
			}
			if (i == 0) {
				a[i] = 1;
			}
		}
		
		System.out.print("\n A = [");
			for (i = 0; i < TAM; i++) {
				System.out.print(a[i] + " ");
			}
		System.out.println("]");	
	}

}
