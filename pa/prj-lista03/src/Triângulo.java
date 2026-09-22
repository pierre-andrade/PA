import java.util.Scanner;

public class ProgTriangulo {
	public static void main (String [] args) {
		int a, b, c;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com o valor de a");
		a = leia.nextInt();
		
		System.out.println("Entre co o valor de b");
		b = leia.nextInt();
		
		System.out.println("Entre com o valor de c");
		c = leia.nextInt();
		
		if (a>b+c && b>a+c && c>b+a) {
			System.out.println("Não é um triângulo");
		} else if (a == b && b == c) {
			System.out.println("É um triângulo equilátero");
		} else if (a!=b && b!=c) {
			System.out.println("É um triângulo escaleno");
		} else {
			System.out.println("É um triângulo isósceles");
		}
	}
	

}
