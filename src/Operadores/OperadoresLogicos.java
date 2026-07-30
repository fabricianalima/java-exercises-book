package Operadores;

import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro");
        int num2 = scanner.nextInt();

        System.out.println("Digite o terceiro número inteiro");
        int num3 = scanner.nextInt();

        if (num1 > 10 || num2 > 10 || num3 > 10){
            System.out.println("Pelo menos um dos números é maior que 10.");
        } else{
            System.out.println("Nenhum dos números é maior que 10");
        }

        if(num1 > 10 && num2 > 10 && num3 > 10){
            System.out.println("Todos os números são maiores que 10.");
        }else{
            System.out.println("Nem todos os números são maiores que 10.");
        }
    }
}
