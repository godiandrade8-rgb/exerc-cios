import java.util.Scanner;

public class exercicio12 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        double salario, desconto;

        System.out.print("Digite o salario do funcionário em reais: ");
        salario = entrada.nextDouble();

        if (salario <= 600.00) {
            desconto = 0;
        } else if (salario <= 1200.00) {
            desconto = salario * 0.20;
        } else if (salario <= 2000.00) {
            desconto = salario * 0.25;
        } else {
            desconto = salario * 0.30;
        }
        System.out.printf("O desconto do funcionário é de: R$ %.2f", desconto);
        
        entrada.close();
    }
}