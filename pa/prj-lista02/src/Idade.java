
import java.util.Scanner;

public class Idade {
	
	public static void main(String[] args) {
		int anoA, anoN, idade;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o ano atual");
		anoA = leia.nextInt();
		
		System.out.println("Entre com o ano de nascimento");
		anoN = leia.nextInt();
		
		idade = anoA - anoN;
		
		System.out.println("Sua idade é " + idade);
		
		leia.close();
		
		if (idade<18){
			System.out.println("Você é menor de idade");
		}
		
		else {
			System.out.println("Você é maior de idade");
		}
	}

}
