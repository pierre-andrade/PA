
import java.util.Scanner;

public class Bhaskara {
	public static void main(String[] args) {
		int a, b, c, delta;
		double x1, x2;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com o valor de a");
		a = leia.nextInt();
		
		System.out.println("Entre com o valor de b");
		b = leia.nextInt();
		
		System.out.println("Entre com o valor de c");
		c = leia.nextInt();
		
		delta = (b*b) - (4*a*c);
		
		System.out.println("O valor de delta é " + delta);
		
		if (delta <0) {
			System.out.println("Não existem raízes reais para a equação");
		}	else if (delta == 0) {
			x1 = (-b + Math.sqrt(delta)) / (2*a);
			System.out.println("Existe apenas uma raíz real para a equação" + "x1 = " + x1);
		}	else {
			x1 = (-b + Math.sqrt(delta)) / 2*a;
			x2 = (-b - Math.sqrt(delta)) / 2*a;
			System.out.println("Existem duas raízes para a equação " + "x1 = " + x1 + " x2 = " + x2);
		}
		
	}

}
