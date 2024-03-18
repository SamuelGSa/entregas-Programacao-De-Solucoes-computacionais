package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex001 {
//    Entrada com a quantidade de cada pão;
//    Saída com o número de cada tipo e pão e seu respectivo valor de venda;
//    Saída com o valor total da compra supondo que um mesmo cliente comprou vários tipos de pães.

    static DecimalFormat df = new DecimalFormat("#.##");

    public static void main(String[] args) {

        var custoTotalPaoIntegral = custoTotal(0.50,0.20,0.10);
        var custoTotalPaoDoceLiso = custoTotal(0.50,0.20,0.10);
        var custoTotalPaoDoceFarofa = custoTotal(0.50,0.20,0.10);
        var custoTotalPaoShibata = custoTotal(0.50,0.20,0.10);

        System.out.println("Pao integral - Valor De Venda: R$ " + valorVenda(custoTotalPaoIntegral,20,10));
        System.out.println("Pao integral - Custo Total: R$ " + df.format(custoTotalPaoIntegral));

        System.out.println("Pao Doce Liso - Valor De Venda: R$ " + valorVenda(custoTotalPaoDoceLiso,20,10));
        System.out.println("Pao Doce Liso - Custo Total: R$ " + df.format(custoTotalPaoDoceLiso));

        System.out.println("Pao Doce Farofa - Valor De Venda: R$ " + valorVenda(custoTotalPaoDoceFarofa,20,10));
        System.out.println("Pao Doce Farofa - Custo Total: R$ " + df.format(custoTotalPaoDoceFarofa));

        System.out.println("Pao Shibata - Valor De Venda: R$ " + valorVenda(custoTotalPaoShibata,20,10));
        System.out.println("Pao Shibata - Custo Total: R$ " + df.format(custoTotalPaoShibata));
    }

    public static Scanner scanner(){
        return new Scanner(System.in);
    }
    public static double custoTotal(double ingredientes, double maoDeObra, double despesasFixas){
        return  (ingredientes + maoDeObra + despesasFixas);
    }

    public static String valorVenda(double custoTotal, int lucroDesejadoPorcent, int margemSegurancaPorcent){
        return  df.format((custoTotal + ((custoTotal /100) * lucroDesejadoPorcent) + ((custoTotal / 100) * margemSegurancaPorcent)));
    }
}
