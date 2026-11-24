import java.util.Random;

public class MaiorMenor {
	public static void main(String[] args) {
		int i = 0, j = 0, linhaMaior = 0, linhaMenor = 0, colunaMaior = 0, colunaMenor = 0, maior = 0, menor = 0;
		int matriz[][] = new int [3][4];
		
		Random randola = new Random();
		
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {
				matriz[i][j] = randola.nextInt(51);
			}
		}
		
		for (i = 0; i < 3; i++) {
			j = 0;
			if (i == 0 && j == 0) {
				maior = matriz[i][j];
				menor = matriz[i][j];
				j++;
			}
			for (; j < 4; j ++) {
				if (maior < matriz[i][j]) {
					maior = matriz[i][j];
					linhaMaior = i;
					colunaMaior = j;
				}
			}
		}
		
		for (i = 0; i < 3; i++) {
			j = 0;
			if (i == 0 && j == 0) {
				j++;
			}
			for (; j < 4; j ++) {
				if (matriz[i][j] < menor) {
					menor = matriz[i][j];
					linhaMenor = i;
					colunaMenor = j;
				}
			}
		}
		
		for(i = 0; i < 3; i++) {
			System.out.println();
			for (j = 0; j < 4; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}
		
		System.out.println("\n");
		
		System.out.println("O maior valor é " + maior + " E está na " + ( colunaMaior + 1) + "º coluna da " + (linhaMaior + 1) + "º linha.");
		System.out.println("O menor valor é " + menor + " E está na " + ( colunaMenor + 1) + "º coluna da " + (linhaMenor + 1) + "º linha.");

	}

}
