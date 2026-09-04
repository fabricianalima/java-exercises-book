package Operadores;

import java.util.Scanner;

public class ComparacaoSimples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();


        if (num1 > num2) {
            System.out.println("O primeiro número é maior que o segundo");
        } else if (num1 < num2) {
            System.out.println("O segundo número é maior que o primeiro");
        } else {
            System.out.println("Os dois números são iguais");
        }


    }
}