
import java.util.Scanner;

public class ProgCrescente {
	public static void main (String[] args) {
		double a, b, c;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com o valor de a");
		a = leia.nextDouble();
		
		System.out.println("Entre com o valor de b");
		b = leia.nextDouble();
		
		System.out.println("Entre com o valor de c");
		c = leia.nextDouble();
		
		if (a<=b && a<=c) {
			System.out.println("O menor número é: " + a);
		} else if (b<=a && b<=c) {
			System.out.println("O menor número é: " + b);
		} else {
			System.out.println("O menor número é: " + c);
		}
		
		if (b <= a && a <= c || c <= a && a <= b ) {
			System.out.println("O número intermediário é: " + a);
		} else if (a <= b && b <= c || c <= b && b <= a) {
			System.out.println("O número intermediário é: " + b);
		} else {
			System.out.println("O número intermediário é: " + c);
		}
		
		if (a >= b && a >= c) {
			System.out.println("O número maior é: " + a);
		} else if (b >= a && b >= c) {
			System.out.println("O número maior é: " + b); 
		} else {
			System.out.println("O número maior é: " + c);
		}
	}

}
