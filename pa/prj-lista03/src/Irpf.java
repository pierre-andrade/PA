
import java.util.Scanner;

public class Irpf {
	public static void main(String[] args) {
		double sal, irpf;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Informe o valor do seu salário");
		sal = leia.nextDouble();
		
		if (sal < 1434.59) {
			System.out.println("Sem desconto");
		} else if (sal < 2150.00) {
			irpf = sal * 75/100 - 107.59;
			System.out.println("O valor do irpf é: " + irpf);
		} else if (sal < 2866.70) {
			irpf = sal * 15/100 - 268.84;
			System.out.println("O valor do irpf é: " + irpf);
		} else if (sal < 3582.00) {
			irpf = sal * 22.5/100 - 483.84;
			System.out.println("O valor do irpf é: " + irpf);
			}  else {
				irpf = sal * 27.5/100 - 662.94;
				System.out.println("O valor do irpf é: " + irpf);
				}
		leia.close();
		
	}
}
