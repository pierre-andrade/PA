
import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		int n, m, i=1;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Insira um número e descubra sua tabuada");
		n = leia.nextInt();
		
		while (i < 11) {
			m = n*i;
			System.out.println(n + "x" + i + "=" + m);
			i++;
		}
	}

}
