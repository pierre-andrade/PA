import java.util.Scanner;

public class idade {
	public static void main (String [] args) {
		int anoN, anoA, id, i=1;
		
		while(i<6) {
		
			Scanner leia = new Scanner (System.in);
			
			System.out.println("Entre com o ano atual");
			anoA = leia.nextInt();
			
			System.out.println("Entre com o ano do nascimento");
			anoN = leia.nextInt();
			
			id = anoA - anoN;
			
			System.out.println("Sua idade é  "+ id);
			
			i++;
				
		}
		
	}
	
}
