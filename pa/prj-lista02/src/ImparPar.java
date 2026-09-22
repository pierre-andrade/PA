
import java.util.Scanner;

public class ImparPar {
	public static void main(String[]args) {
		int n, par, impar;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("insira um número inteiro");
		n = leia.nextInt();
		
		System.out.println(n);
		
		if (n % 2 == 0) {
			
			par = n;
					
			System.out.print(par + " é um número par");
			
		}
		
		else {
			
			impar = n;
			
			System.out.println(impar + " é um numero ímpar");
		}
	}

}
