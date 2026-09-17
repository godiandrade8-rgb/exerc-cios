import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        int num1 = scanner.nextInt();
        System.out.println("Digite outro numero");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("Os numeros são iguais");
        } else if (num1 > num2) {
            System.out.println("O maior numero é: " + num1);
        } else {
            System.out.println("O maior numero é: " + num2);
        }
        scanner.close();
    }
}   
    

