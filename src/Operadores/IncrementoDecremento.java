package Operadores;

import java.sql.SQLOutput;

public class IncrementoDecremento {

    public static void main(String[] args) {
        int numero = 15;

        System.out.println("Valor inicial:" + numero);

        numero++;
        System.out.println("Após incremento (++numero):" + numero);

        numero--;
        System.out.println("Após decremento(--numero)" + numero);
    }
}
