import java.util.Random;
import java.util.Scanner;

public class Bingo {
	public static void main(String[] args) {
		int i = 0, j = 0, k = 0, l = 0, cantado = 0, conta = 0, rodadas = 0, acertos = 0;
		int cartela[][] = new int [4][4];
		
		Scanner leia = new Scanner (System.in);
		Random randola = new Random();
		
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				cartela[i][j] = randola.nextInt(76);
			}
		}
		
		
		System.out.println("Sua cartela é :");
		
		for (i = 0; i < 4; i++) {
			System.out.println();
			System.out.print("[ ");
			for (j = 0; j < 4; j++) {
				System.out.print(cartela[i][j] + ", ");
			}
			System.out.print("]");
		}
		
		
		System.out.println("\n");
		
		/*Blocao do BINGO*/
		for (k = 0; k < 76; k++) {
			
			/*Leitura do número cantado*/
			System.out.println("Informe o número cantado:");
			cantado = leia.nextInt();
			
			/*Verificando se bate com a cartela*/
			for (i = 0; i < 4; i++) {
				for (j = 0; j < 4; j++) {
					if (cantado == cartela[i][j]) {
						acertos++;
						j = 4;
						i = 4;
						System.out.println("A cartela possui esse número");
					} else {
						conta++;
						if (conta == 16) {
							System.out.println("A cartela não possui esse número");
						}
					}
				}
			}
			
			rodadas++;
			
			if (acertos == 16) {
				k = 76;
			}
		}	
			
		
		System.out.println("BINGO!");
		System.out.println("\n Você demorou " + rodadas + " rodadas para bingar.");
	

	}
		
}
	

