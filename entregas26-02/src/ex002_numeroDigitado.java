import java.util.Scanner;

public class ex002_numeroDigitado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("O numero digitado foi: " + numero);
        System.out.println("O dobro dele é: " + (numero*2));

    }
}
