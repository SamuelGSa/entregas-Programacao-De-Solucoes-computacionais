package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int int1,int2;
        double real1,real2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero inteiro: ");
        int1 = scanner.nextInt();

        System.out.print("Digite o segundo numero inteiro: ");
        int2 = scanner.nextInt();

        System.out.print("Digite o primeiro numero real: ");
        real1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero real: ");
        real2 = scanner.nextDouble();

        int somaInt = int1 + int2;

        double somaReal = real1 + real2;

        double prodReal =  real1 * real2;

        double divReal = real1 / real2;

        System.out.println("Operação A: " + somaInt);
        System.out.println("Operação B: " + somaReal);
        System.out.println("Operação C: " + prodReal);

        if (real2 != 0) System.out.println("Operação D: " + divReal);
        else System.out.println("Operação D: Divisão Impossivel");


    }
}