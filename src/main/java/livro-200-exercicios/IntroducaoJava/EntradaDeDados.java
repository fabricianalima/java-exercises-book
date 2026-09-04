package IntroducaoJava;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numeroInt = scanner.nextInt();

        System.out.println("Digite um número decimal: ");
        double numeroDouble = scanner.nextDouble();

        double soma = numeroInt + numeroDouble;
        System.out.println("A soma dos números é: " + soma);
    }
}
