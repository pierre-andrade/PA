
import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {
		int aa, an, id, i = 0;
		String resposta;
		
		Scanner leia = new Scanner (System.in);
		
		do {
			
			i = 0;
			
			do {
				System.out.println("Informe o ano atual");
				aa = leia.nextInt();
				
				System.out.println("Informe o ano de nascimento");
				an = leia.nextInt();
				
				id = aa - an;
				
				if (id < 18) {
					System.out.println("Você é menor de idade");
				} else {
					System.out.println("Você é maior de idade");
				}
				
				i = i+1;
				
				} while(i < 2);
			System.out.println("Deseja continuar? Digite S para sim e N para não");
			resposta = leia.next();
		} while(resposta.equalsIgnoreCase("S"));
	}
}
