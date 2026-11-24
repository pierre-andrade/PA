import java.util.Scanner;

public class Banco {
	public static void main (String[] args) {
		double valor, total, juros = 0, parcela;
		int meses;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o valor a ser emprestado:");
		valor = leia.nextDouble();
		
		System.out.println("Digite a quantidade de meses:");
		meses = leia.nextInt();
		
		total = valor;
		
		for (int i=1; i<=meses; i++) {
			total = total + total*2.5/100;
			juros = total - valor;
			System.out.println("Mês " + i + ": valor com juros: " + total + " - valor do juros: " + juros);
		}
		
		parcela = total/meses;
		
		System.out.println("Valor total pago: R$" + total);
		System.out.println("Valor total de juros: R$" + juros);
		System.out.println("Valor da parcela mensal: R$" + parcela);
		
		leia.close();
	}
}
