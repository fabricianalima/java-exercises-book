package Operadores;

public class AtribuicaoSimples {
    public static void main(String[] args) {
        int valor = 10;

        valor +=5;
        System.out.println("Após valor +=5: " + valor);

        valor -=3;
        System.out.println("Após valor -=3: " + valor);

        valor *=2;
        System.out.println("Após valor *=2: " + valor);

        valor /=4;
        System.out.println("Após valor /=4: " + valor);

        valor %=3;
        System.out.println("Após valor %=3: " + valor);
    }
}
