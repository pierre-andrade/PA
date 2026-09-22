import java.util.Scanner;

public class Somatoria {
	public static void main(String[] args) {
		int n, i = 1, soma = 0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Insira um número");
		n = leia.nextInt();
		
		for (; i <= n ; i++) {
			System.out.print(i + ", ");
			soma = soma + i;
		}
		
		System.out.println("A somatória é " + soma);
		
		leia.close();
	}
}
