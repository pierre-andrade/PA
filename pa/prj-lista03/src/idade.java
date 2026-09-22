
import java.util.Scanner;

public class idade {
	
	
	public static void main(String []args) {
		int aa, an, id;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o ano atual ");
		aa = leia.nextInt();
		
		System.out.println("Entre com o ano de nascimento");
		an = leia.nextInt();
		
		id = aa - an;
		
		System.out.println("Sua idade é " +id);
		
		if (id<10){
			System.out.println("Criança!");
			}
		else if(id<18) {
			System.out.println("Adolescente!");
		} else if(id<60) {
			System.out.println("Adulto!");
		} else {
			System.out.println("idoso!");
		}
	}
	

}
