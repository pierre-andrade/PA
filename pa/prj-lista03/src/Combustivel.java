
import java.util.Scanner;

public class Combustivel {
	public static void main (String [] args) {
		double km, tanque, gasto;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com o a distância percorrida");
		km = leia.nextDouble();
		
		System.out.println("Entre com a capacidade do tanque");
		tanque = leia.nextDouble();
		
		gasto = km/tanque;
		
		System.out.println("O gasto é de " +gasto+ " km/h");
		
		if (gasto>=10) {
			System.out.println("Seu consumo é econômico");
		}
		
		else {
			System.out.println("Seu consumo é não econômico");
		}
		
	}
}
