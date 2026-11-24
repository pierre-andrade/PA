import java.util.Random;

public class Somatoria {
	public static void main(String[] args) {
		int i = 0, j = 0, soma = 0;
		int matriz [][] = new int [3][4];
		
		Random randola = new Random();
		
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {
				matriz[i][j] = randola.nextInt(51);
			}
		}
		
		for (i = 0; i < 3; i++) {
			j = 0;
			if (j == 0) {
				soma = matriz[i][j];
				j++;
			}
			for (; j < 4; j++) {
				if (j == 3) {
					matriz[i][j] = soma;
				}
				else {
					soma = soma + matriz[i][j];
				}
			}
		}
		
		for (i = 0; i < 3; i++) {
			System.out.println();
			for (j = 0; j < 4; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}

	}

}
