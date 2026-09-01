package Operadores;

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro");
        int num2 = scanner.nextInt();

        System.out.println("Digite o terceitro número inteiro");
        int num3 = scanner.nextInt();

        double media = (num1 + num2 + num3) / 3.0;

        System.out.println("A média aritmetica é: " + media);
    }
}
