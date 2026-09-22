
import java.util.Scanner;

public class ProgImc {
	public static void main(String[] args) {
		double peso, altura, imc;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com o peso");
		peso = leia.nextDouble();
		
		System.out.println("Entre com a altura");
		altura = leia.nextDouble();
		
		imc = peso / altura*altura;
		
		System.out.println("Seu imc é " + imc);
		
		if (imc<18.5) {
			System.out.println("Excesso de magreza");
		} else if (imc<25) {
			System.out.println("Peso normal");
		} else if (imc<30) {
			System.out.println("Excesso de peso");
		} else if (imc<35) {
			System.out.println("Obesidade Grau I");
		} else if (imc<40) {
			System.out.println("Obesidade Grau II");
		} else {
			System.out.println("Obesidade Grau III");
		}
	}
	
}
