package org.example;

import java.util.Scanner;

public class Ex001 {
//    Entrada com a quantidade de cada pão;
//    Saída com o número de cada tipo e pão e seu respectivo valor de venda;
//    Saída com o valor total da compra supondo que um mesmo cliente comprou vários tipos de pães.

    public static void main(String[] args) {

        var custoTotalPaoIntegral = custoTotal(0.50,0.20,0.10);
        var custoTotalPaoDoceLiso = custoTotal(0.50,0.20,0.10);
        var custoTotalPaoDoceFarofa = custoTotal(0.50,0.20,0.10);
        var custoTotalPaoShibata = custoTotal(0.50,0.20,0.10);

        System.out.println("Pao integral - Valor De Venda: " + valorVenda(custoTotalPaoIntegral,20,10));
        System.out.println("Pao integral - Custo Total: " + custoTotalPaoIntegral);

        System.out.println("Pao Doce Liso - Valor De Venda: " + valorVenda(custoTotalPaoDoceLiso,20,10));
        System.out.println("Pao Doce Liso - Custo Total: " + custoTotalPaoDoceLiso);

        System.out.println("Pao Doce Farofa - Valor De Venda: " + valorVenda(custoTotalPaoDoceFarofa,20,10));
        System.out.println("Pao Doce Farofa - Custo Total: " + custoTotalPaoDoceFarofa);

        System.out.println("Pao Shibata - Valor De Venda: " + valorVenda(custoTotalPaoShibata,20,10));
        System.out.println("Pao Shibata - Custo Total: " + custoTotalPaoShibata);
    }

    public static Scanner scanner(){
        return new Scanner(System.in);
    }
    public static double custoTotal(double ingredientes, double maoDeObra, double despesasFixas){
        return  (ingredientes + maoDeObra + despesasFixas);
    }

    public static double valorVenda(double custoTotal,int lucroDesejadoPorcent,int margemSegurancaPorcent){
        return  (custoTotal + ((custoTotal /100 * lucroDesejadoPorcent)) + ((custoTotal / 100 * margemSegurancaPorcent)));
    }
}
