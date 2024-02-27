import java.util.Scanner;

public class ex002 {
//    Escreva um algoritmo para calcular o valor de Y como função de x,
//    segundo a função y(x) = 3x + 2, num dominio real

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero real: ");
        double numero = scanner.nextDouble();

        double y = 3*numero + 2;

        System.out.println("O valor de Y é: " + y);
    }

}
