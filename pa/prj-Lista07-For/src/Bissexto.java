import java.util.Scanner;

public class Bissexto {

	public static void main(String[] args) {
		int ai, af, quantA = 0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Informe um ano inicial");
		ai = leia.nextInt();
		
		System.out.println("Informe um ano final");
		af = leia.nextInt();
		
		for (; ai <= af; ai++) {
			if (ai % 4 == 0 && ai % 100 != 0) {
				System.out.print(ai + ", ");
				quantA++;
				} else if (ai % 400 == 0) {
					System.out.print(ai + ", ");
					quantA++;
				}
				
		}
		
		System.out.println("A quantidade de anos bissextos é de " + quantA);
		
		leia.close();
 
	}

}
