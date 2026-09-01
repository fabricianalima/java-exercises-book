package Operadores;

import java.util.Scanner;

public class ComparacaoStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira string: ");
        String string1 = scanner.nextLine();

        System.out.println("Digite a segunda string: ");
        String string2 = scanner.nextLine();

        if (string1.equals(string2)){
            System.out.println("As strings são iguais.");
        } else{
            System.out.println("As strings são diferentes.");
        }
    }
}
