import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		int a[], b[], i, j = 0, par = 0, impar = 0, k = 0;
		final int TAM = 10;
		a = new int [TAM];
		b = new int [TAM];
		
		Scanner leia = new Scanner (System.in);
		
		for (i = 0; i < TAM; i ++) {
			System.out.println("Digite o " + (i + 1) + "º valor de A");
			a[i] = leia.nextInt();
			
			if(a[i] % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		
		for(i = 0; i < TAM; i++) {
			if (a[i] % 2 == 0) {
				b[j] = a[i];
				j++;			
			}
		}
		
		for(i = 0; i < TAM; i++) {
			if (a[i] % 2 == 0) {
				k++;
			} else {
				b[j] = a[i];
				j++;
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
		
	}

}
