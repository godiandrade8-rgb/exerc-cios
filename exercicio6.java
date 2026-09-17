//Diogo de Oliveira de Andrade
import java.util.Scanner;

public class exercicio6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite sua altura em metros: ");
		double altura = entrada.nextDouble();

		System.out.print("Digite seu sexo (M/F): ");
		char sexo = entrada.next().toUpperCase().charAt(0);
        
		double pesoIdeal;
		if (sexo == 'M') {
			pesoIdeal = 72.7 * altura - 58;
		} else {
			pesoIdeal = 62.1 * altura - 44.7;
		}

		System.out.printf("Seu peso ideal e %.2f kg%n", pesoIdeal);

		entrada.close();
   }
}
