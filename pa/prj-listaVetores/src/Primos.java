import java.util.Scanner;

public class Primos {
		public static void main(String[] args) {
			int contadorP = 0, i, j = 1, a[];
			final int TAM = 10;
			a = new int [TAM];
				
			Scanner leia = new Scanner (System.in);
				
			for(i = 0; i < TAM; i++) {
				System.out.println("Digite o " + (i+1) + " valor de a");
				a[i] = leia.nextInt();
			}
				
			for (i = 0; i < TAM; i++) {
				j = 1;
				contadorP = 0;
					while (j <= a[i]) {
					if(a[i] % j == 0) {
						contadorP++;
					}
					j++;
				}
			if(contadorP < 3) {
				System.out.println(a[i] + " é um número primo");
			} else {
				System.out.println(a[i] + " não é um número primo");
			}
			
			}
		}
}

