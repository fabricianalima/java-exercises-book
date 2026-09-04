package Operadores;

public class PrePosIncremento {
    public static void main(String[] args) {
        int valorPrePos = 10;

        System.out.println("Valor inicial:" + valorPrePos);

        int preIncremento = ++valorPrePos;
        System.out.println("Após pré-incremento(++valor):" + preIncremento);

        int posIncremento = valorPrePos++;
        System.out.println("Após pós-incremento(valor++):" + posIncremento);

        System.out.println("Valor final após pós-incremento." + valorPrePos);
    }
}
