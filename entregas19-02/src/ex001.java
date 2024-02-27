import java.util.Scanner;

public class ex001 {

    public static void main(String[] args) {
        imprimirMeuNome();
        dobrar(25.5);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("A sua idade é: " + idade);

    }

    static void imprimirMeuNome() {
        System.out.println("Nome: Samuel Martins");
    }

    static void dobrar(double numero) {
        double dobro = numero * 2 ;
        System.out.println("O Valor de: " + numero + " dobrado é: " + dobro);
    }

}