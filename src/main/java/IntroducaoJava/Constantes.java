package IntroducaoJava;

public class Constantes {
    public static void main(String[] args) {

        final double VELOCIDADE_DA_LUZ = 299792458; // em metros por segundos

        System.out.println("Velocidade da luz: " + VELOCIDADE_DA_LUZ + "m/s");

        //Esta linha causará um erro de compilação, ao declarar uma constante usando final,
        // o valor dela não pode ser alterado após a inicialização
        //  VELOCIDADE_DA_LUZ = 300000000;
    }
}
