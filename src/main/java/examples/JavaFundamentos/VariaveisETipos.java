package examples.JavaFundamentos;

public class VariaveisETipos {

    public static void main(String[] args) {

        // Variáveis

        int idade = 20;
        double altura = 1.65;
        boolean estudante = true;
        char inicial = 'M';
        String nome = "Maria";

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Estudante: " + estudante);
        System.out.println("Inicial: " + inicial);

        byte numeroByte = 100;
        short numeroShort = 1000;
        int numeroInt = 10000;
        long numeroLong = 100000L;

        float numeroFloat = 10.5F;
        double numeroDouble = 10.5;

        char caractere = 'A';
        boolean ativo = true;

        // String não é um tipo primitivo.
// É uma classe da API do Java.
        String linguagem = "Java";

        final double PI = 3.14159;

        System.out.println("PI: " + PI);

        int numeroInteiro = 10;
        double numeroDecimal = numeroInteiro;

        System.out.println(numeroDecimal);

        int numeroPrimitivo = 10;

        Integer numeroWrapper = numeroPrimitivo;

        int numeroNovamentePrimitivo = numeroWrapper;
    }
}