public class Dobro {

	public static void main(String[] args) {
		int i = 0, j = 0, valor = 0;
		int matriz[][] = new int [4] [4];
		
		for ( i = 0; i < 4; i ++) {
			j = 0;
			if (i == 0 && j == 0) {
				matriz[0][0] = 2;
				valor = matriz[0][0];
				j++;
			}
			for (; j < 4; j++) {
				matriz[i][j] = valor * 2;
				valor = matriz[i][j];
			}
		}
		
		for (i = 0; i < 4; i ++) {
			System.out.println();
			for (j = 0; j < 4; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}
	}
}
	

	


