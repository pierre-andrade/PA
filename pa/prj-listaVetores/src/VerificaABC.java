import java.util.Scanner;

public class VerificaABC {
	public static void main(String[] args) {
		int a[], b[], c[], i;
		final int TAM = 10;
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		Scanner leia = new Scanner (System.in);
		
		for (i = 0; i < TAM; i ++) {
			System.out.println("Digite o " + (i + 1) + "º valor de A");
			a[i] = leia.nextInt();
		}
		
		for (i = 0; i < TAM; i ++) {
			System.out.println("Digite o " + (i + 1) + "º valor de B");
			b[i] = leia.nextInt();
		}
		
		for (i = 0; i < TAM; i ++) {
			if (a[i] > b[i]) {
				c[i] = 1;
			} else if (a[i] == b[i]) {
				c[i] = 0;
			} else {
				c[i] = -1;
			}
		}
		
		System.out.print("\n A = [ ");
		for (i = 0; i < TAM; i++) {
			System.out.print(a[i] + " ");
		}	
		System.out.print("]");
		
		System.out.print("\n B = [ ");
		for (i = 0; i < TAM; i++) {
			System.out.print(b[i] + " ");
		}	
		System.out.print("]");
		
		System.out.print("\n C = [ ");
		for (i = 0; i < TAM; i++) {
			System.out.print(c[i] + " ");
		}	
		System.out.print("]");
	}

}
