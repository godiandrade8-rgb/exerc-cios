import java.util.Scanner;
public class exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a senha:");
        String senha = scanner.nextLine();
        if(senha.equals("R10p5")) {
            System.out.println("Senha correta!");
        } else {
            System.out.println("Senha incorreta!");
        }
        scanner.close();
    }
}
