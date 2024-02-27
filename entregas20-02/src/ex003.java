import java.util.Scanner;

public class ex003 {
//    Leia uma temperatura dada na escala Celcius (C) e imprima o equivalente em Fahrenheint (F)
//    (Formula: F = 9/5 * C +32).

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperadura que deseja converter C: ");
        double temperatura = scanner.nextDouble();

        double fahrenheint = (temperatura * 9/5) + 32;
        System.out.println("A temperatura convertida é: " + fahrenheint + "F");
    }
}
