package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex004 {

    public static void main(String[] args) {
        Integer escolha;
        do {
            menu();
            System.out.print("Escolha: ");
            escolha = scanner().nextInt();

            switch (escolha) {
                case 1 -> {
                    double custoTotal = custoTotal(0.50, 0.20, 0.10);
                    System.out.println("Valor de venda para a unidade do Pao Frances: R$ " + valorVenda(custoTotal, 20, 9));
                }
                case 2 -> {
                    double custoTotal = custoTotal(0.49, 0.20, 0.12);
                    System.out.println("Valor de venda para a unidade do Pao Integral: R$ " + valorVenda(custoTotal, 20, 8.5));
                }
                case 3 -> {
                    double custoTotal = custoTotal(0.53, 0.20, 0.09);
                    System.out.println("Valor de venda para a unidade do Pao Doce Liso: R$ " + valorVenda(custoTotal, 20, 12));
                }
                case 4 -> {
                    double custoTotal = custoTotal(0.55, 0.20, 0.10);
                    System.out.println("Valor de venda para a unidade do Pao Doce Farofa: R$ " + valorVenda(custoTotal, 20, 11));
                }
                case 5 -> {
                    double custoTotal = custoTotal(0.45, 0.20, 0.08);
                    System.out.println("Valor de venda para a unidade do Shibata: R$ " + valorVenda(custoTotal, 20, 9));
                }
                case 6 -> System.out.println("Até logo!");

                default -> System.out.println("Opção inválida!");
            }
        } while (!escolha.equals(6));
    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }

    public static void menu() {
        System.out.println("===== ESCOLHA UMA OPÇÃO =====");
        System.out.println("1 * Pao Frances");
        System.out.println("2 * Pao Integral");
        System.out.println("3 * Pao Doce Liso");
        System.out.println("4 * Pao Doce Farofa");
        System.out.println("5 * Shibata");
        System.out.println("6 * Fim da Compra");

    }

    public static double custoTotal(double ingredientes, double maoDeObra, double despesasFixas) {
        return (ingredientes + maoDeObra + despesasFixas);
    }

    public static String valorVenda(double custoTotal, int lucroDesejadoPorcent, double margemSegurancaPorcent) {
        return decimalFormat().format((custoTotal + ((custoTotal / 100) * lucroDesejadoPorcent) + ((custoTotal / 100) * margemSegurancaPorcent)));
    }

    public static DecimalFormat decimalFormat() {
        return new DecimalFormat("#.##");
    }

}
