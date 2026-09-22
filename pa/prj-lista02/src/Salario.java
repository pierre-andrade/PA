import java.util.Scanner;

public class Salario {
	public static void main(String[]args) {
		double salario, salarioM;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("qual o valor do seu salário?");
		salario = leia.nextDouble();
		
		salarioM = 1621;
		
		if(salario<salarioM){
			System.out.println("você está sendo violado pela sua empresa");

		}
		
		else {
			System.out.println("seu salário esta em conformidade com a lei");
		}
		
	}

}
