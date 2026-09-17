import java.util.Scanner;

public class exercicio10 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1, numero2, numero3;
        System.out.print("Digite o primeiro número: ");
        numero1 = entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        numero2 = entrada.nextInt();
        System.out.print("Digite o terceiro número: ");
        numero3 = entrada.nextInt();

        if (numero1==numero2 && numero2==numero3) {
            System.out.println("Os números são iguais.");
        } else if (numero1>=numero2 && numero1>=numero3) {
            System.out.println("o maior número é: " + numero1);
        } else if (numero2>=numero1 && numero2>=numero3) {
            System.out.println("o maior número é: " + numero2);
        } else {
            System.out.println("o maior número é: " + numero3);
        }
        entrada.close();
    }
}