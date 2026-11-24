import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		int cont, aluno;
		double n1, n2, media;
		String condicao;
		
		Scanner leia = new Scanner (System.in);
		
		do {
			cont = 0;
			System.out.println("Informe a quantidade de alunos que serão avaliados");
			aluno = leia.nextInt();
			do {
				System.out.println("Informe a 1ª nota:");
				n1 = leia.nextInt();
				
				System.out.println("Informe a 2ª nota");
				n2 = leia.nextInt();
				
				media = (n1+n2)/2;
				
				if (media < 7) {
					System.out.println("Aluno reprovado");
				} else {
					System.out.println("Aluno aprovado");
				}
				
				cont = cont + 1;
			} while (cont < aluno);
			
			System.out.println("Deseja continuar? Digite S para sim ou N para não");
			condicao = leia.next();
		} while (condicao.equalsIgnoreCase("S"));
		
		leia.close(); 
	}
}
