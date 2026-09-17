import java.util.Scanner;

public class exercicio7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o salario: ");
		double salario = scanner.nextDouble();

		System.out.print("Digite a quantidade de anos trabalhados: ");
		int anosTrabalhados = scanner.nextInt();

		double percentualBonus;
		if (anosTrabalhados >= 5) {
			percentualBonus = 20.0;
		} else {
			percentualBonus = 10.0;
		}

		double bonus = salario * percentualBonus;
		System.out.printf("O valor do bonus e R$ %.2f%n", bonus);

		scanner.close();
	}


}
