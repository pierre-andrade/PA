
public class Par {
	public static void main(String[] args) {
		int i = 0;
		
		do {
			if (i % 10 == 0) {
				System.out.println(i + " é multiplo de 10");
			} else {
				System.out.println(i);
			}
			i = i+2;
		} while (i < 500); 
	} 
}
