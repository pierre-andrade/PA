import java.util.Scanner;

public class Tabuada {
		public static void main(String[] args) {
			final int TAM = 5;
			int a[], i, j = 1, n, r;
			a = new int [TAM];
			
			Scanner leia = new Scanner (System.in);
			
			for(i = 0; i < TAM; i++) {
				System.out.println("Digite um número e descubra sua tabuada");
				a[i] = leia.nextInt();
				}
			
			for(i=0; i < TAM; i++) {
				n = a[i];
				j = 1;
				System.out.println(" ");
				while(j<=10) {
					r = n * j;
					System.out.println(n + " X " + j + " = " + r);
					j++;
				}
			}
			
		}
}
