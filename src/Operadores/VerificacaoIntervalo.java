package Operadores;

import java.util.Scanner;

public class VerificacaoIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int num = scanner.nextInt();

        if (num >= 10 && num <= 20){
            System.out.println("O número esta dentro do intervalo");
        } else{
            System.out.println("O número está fora do intervalo");
        }
    }
}
