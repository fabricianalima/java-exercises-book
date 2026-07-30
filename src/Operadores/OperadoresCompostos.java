package Operadores;

import java.util.Scanner;

public class OperadoresCompostos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro");
        int valor1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro");
        int valor2 = scanner.nextInt();

        valor1 += valor2;
        System.out.println("Após valor1 += valor2: " + valor1);

        valor1 -= valor2;
        System.out.println("Após valor1 -= valor2: " + valor1);

        valor1 *= valor2;
        System.out.println("Após valor1 *= valor2: " + valor1);

        valor1 /= valor2;
        System.out.println("Após valor1 /= valor2: " + valor1);

        valor1 %= valor2;
        System.out.println("Após valor1 %= valor2: " + valor1);
    }
}
