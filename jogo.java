import java.util.Scanner;

public class jogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero de pontos do jogador 1 na fase 1.");
        double pontos = scanner.nextDouble();

        if (pontos >= 100) {
            System.out.println("Parabéns! Você passou para a próxima fase.");
        } else {
            System.out.println("Você não passou para a próxima fase. Tente novamente.");
        }
    
        scanner.close();
    }
}