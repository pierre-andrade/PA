import java.util.Scanner;

public class ProgMedia {
	public static void main (String []args) {
		double n1, n2, n3, m, nm = 0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com a 1º nota");
		n1 = leia.nextDouble();
		
		System.out.println("Entre com o 2º valor");
		n2 = leia.nextDouble();
		
		m = (n1+n2)/2;
		
		System.out.println("Sua média é: " + m);
		
		if (m <= 3) {
			System.out.println("Reprovado");
		} else if (m < 6) {
			System.out.println("Você está em exame");
			System.out.println("Entre com a nota do exame");
			n3 = leia.nextDouble();
			nm = (n3+m)/2;
			if (nm < 6) {
				System.out.println("Reprovado: " +  nm );
			} else {
				System.out.println("Aprovado: " + nm);
			} 
		} else {
			System.out.println("Aprovado: " + nm);
		}
	}
	
}
	 