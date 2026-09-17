import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite um numero ");
        int num1= entrada.nextInt();

        if (num1 > 20) {
            System.out.println(num1 / 2);
        } else if (num1 < 20) {
            System.out.println("Digite um numero maior que 20");
        }

        entrada.close();
    }
}