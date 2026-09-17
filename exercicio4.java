//Diogo de Oliveira de Andrade 
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dois numeros de ponto flutuante:");
        
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.println("Ordem decrescente: " + Math.max(num1, num2) + " " + Math.min(num1, num2));
        scanner.close();
    }
    
}
