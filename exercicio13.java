// Diogo de Oliveira de Andrade 

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double numero1, numero2, resultado;
        char operação;

        System.out.println("digite o primeiro numero:");
        numero1 = entrada.nextDouble();

        System.out.println("digite o segundo numero:");
        numero2 = entrada.nextDouble();

        System.out.println("digite a operação (+, -, *, /):");
        operação = entrada.next().charAt(0);

        } if (operação == '+') {
            resultado = numero1 + numero2;
            System.out.println("o resultado" + resultado1);
        } else if (operação == '-') {
            resultado = numero1 - numero2;
            System.out.println("o resultado" + resultado1);
        } else if (operação == '*') {
            resultado = numero1 * numero2;
            System.out.println("o resultado" + resultado1);
        } else if (operação == '/') {
            if (numero2 == 0) {
                System.out.println("erro: divisão por zero");
            } else {
                resultado = numero1 / numero2;
                System.out.println("o resultado" + resultado1);
            }
        } else  {
            System.out.println("nao foi possível dividir");
        } else {
        System.out.println("sinal inválido");
        }

    }
}