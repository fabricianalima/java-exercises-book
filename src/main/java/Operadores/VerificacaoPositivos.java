package Operadores;

import java.util.Scanner;

public class VerificacaoPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro");
        int num2 = scanner.nextInt();

        System.out.println("Digite o terceiro número inteiro");
        int num3 = scanner.nextInt();

        int positivos = 0;

        if(num1 > 0) positivos ++;
        if(num2 > 0) positivos ++;
        if(num2 > 0) positivos ++;

        if (positivos >= 2) {
            System.out.println("Pelo menos dois dos números são positivos.");
        }else{
            System.out.println("Menos de dois dos números são positivos.");
        }
   }
}
