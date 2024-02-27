import java.util.Scanner;

public class ex003_seuNome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Seu sobrenome é: " + sobrenome);
    }
}
