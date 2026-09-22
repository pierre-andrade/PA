import java.util.Scanner;

public class Imc {
	public static void main(String[] args) {
		int f1 = 0, f2 = 0, f3 = 0, f4 = 0, i = 0;
		double p, a, imc;
		
		Scanner leia = new Scanner (System.in);
		
		for(; i<15; i++) {
			System.out.println("Entre com o peso");
			p = leia.nextInt();
			
			System.out.println("Entre com a altura");
			a = leia.nextInt();
			
			imc = p / (a*a);
			
			if (imc < 22) {
				f1++;
			} else if (imc < 28) {
				f2++;
			} else if (imc <31) {
				f3++;
			} else {
				f4++;
			}
		}
		
		System.out.println("A quantidade de pessoas de baixo peso é de " + f1);
		System.out.println("A quantidade de pessoas de peso normal é de " + f2);
		System.out.println("A quantidade de pessoas com sobrepeso é de " + f3);
		System.out.println("A quantidade de pessoas obesas é de " + f4);
		
		leia.close();
	}

}
