import java.util.Scanner;

public class Intersecao {
	public static void main(String[] args) {
		int a[], b[], c[], i, j, k = 0;
		final int TAM = 10;
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		Scanner leia = new Scanner (System.in);
		
		for (i = 0; i < TAM; i++) {
			System.out.println("Digite o " + (i + 1) + "º valor de A");
			a[i] = leia.nextInt();
		}
		
		for (j = 0; j < TAM; j++) {
			System.out.println("Digite o " + (j + 1) + "º valor de B");
			b[j] = leia.nextInt();
		}
		
		for(i = 0; i < TAM; i ++) {
			for(j = 0; j < TAM; j++) {
				if (a[i] == b[j]) {
					c[k] = a[i];
				}
			}
			k++;
		}
		
		System.out.print("\n A = [ ");
		for(i = 0; i < TAM; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.print("]");
		
		System.out.print("\n B = [ ");
		for(j = 0; j < TAM; j++) {
			System.out.print(b[j] + ", ");
		}
		System.out.print("]");
		
		System.out.print("\n C = [ ");
		for(k = 0; k < TAM; k++) {
			System.out.print(c[k] + ", ");
		}
		System.out.print("]");
		
		
	}

}
