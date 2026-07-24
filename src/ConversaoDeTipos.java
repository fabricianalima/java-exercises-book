public class ConversaoDeTipos {
    public static void main(String[] args) {

        double valorDouble = 9.99;
        int valorInt = (int) valorDouble; //Conversão explícita de double para int

        int numero = 10;
        double numeroConvertido = numero; // Conversão implícita de int para double

        System.out.println("Valor double: " + valorDouble);
        System.out.println("Valor convertido para int: " + valorInt);
        System.out.println("Número int: " + numero);
        System.out.println("Número convertido para double: " + numeroConvertido);
    }   }

