//Diogo de Oliveira de Andrade 
import java.util.Scanner;

public class exercicio9 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salariobruto, prestacao, limiteprestacao;
        System.out.print("Digite o salário bruto: ");
        salariobruto = entrada.nextDouble();

        System.out.print("Digite o valor da prestação: ");
        prestacao = entrada.nextDouble();

        limiteprestacao = salariobruto * 0.3;
        if (prestacao <= limiteprestacao) {
            System.out.println("Empréstimo aprovado.");
        } else {
            System.out.println("Empréstimo negado.");
        }
        entrada.close();
    }
}
