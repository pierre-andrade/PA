import java.util.Scanner;

public class RotinaPesquisa {
	public static void main(String[] args) {
		int a[], i, j, x;
		final int TAM = 10;
		a = new int [TAM];
		
		Scanner leia = new Scanner (System.in);
		
		for (i = 0; i < TAM; i++) {
			System.out.println("Digite o " + (i + 1) + "º valor de A");
			a[i] = leia.nextInt();
		}
		
		for (j = 0; j < TAM; j++) {
			System.out.println("Digite um valor X e veja se ele está em A");
			x = leia.nextInt();
			for (i = 0; i < TAM; i++) {
				if (x == a[i]) {
					System.out.println("O valor de X digitado está armazenado no " + (i + 1) + "º espaço de A:" + " X = " + x + "   A = " + a[i]);
				} else {
					System.out.println("O valor de X digitado não está no " + (i + 1) + "º espaço de A");
				}
			}	
		} 
	}

}
