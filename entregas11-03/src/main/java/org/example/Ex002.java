package org.example;

import java.text.DecimalFormat;

public class Ex002 {
//    Entrada com a quantidade de cada pão;
//    Saída com o número de cada tipo e pão e seu respectivo valor de venda;
//    Saída com o valor total da compra supondo que um mesmo cliente comprou vários tipos de pães.

    static DecimalFormat df = new DecimalFormat("#.##");

    public static void main(String[] args) {



        var custoTotalPaoFrances = custoTotal(0.51,0.20,0.10);
        var custoTotalPaoIntegral = custoTotal(0.49,0.20,0.12);
        var custoTotalPaoDoceLiso = custoTotal(0.53,0.20,0.09);
        var custoTotalPaoDoceFarofa = custoTotal(0.55,0.20,0.10);
        var custoTotalPaoShibata = custoTotal(0.45,0.20,0.08);

        System.out.println("Pao Frances - Valor De Venda: R$ " + valorVenda(custoTotalPaoFrances,20,9));
        System.out.println("Pao Frances - Custo Total: R$ " + df.format(custoTotalPaoFrances));

        System.out.println("Pao integral - Valor De Venda: R$ " + valorVenda(custoTotalPaoIntegral,20,8.5));
        System.out.println("Pao integral - Custo Total: R$ " + df.format(custoTotalPaoIntegral));

        System.out.println("Pao Doce Liso - Valor De Venda: R$ " + valorVenda(custoTotalPaoDoceLiso,20,12));
        System.out.println("Pao Doce Liso - Custo Total: R$ " + df.format(custoTotalPaoDoceLiso));

        System.out.println("Pao Doce Farofa - Valor De Venda: R$ " + valorVenda(custoTotalPaoDoceFarofa,20,11));
        System.out.println("Pao Doce Farofa - Custo Total: R$ " + df.format(custoTotalPaoDoceFarofa));

        System.out.println("Pao Shibata - Valor De Venda: R$ " + valorVenda(custoTotalPaoShibata,20,10));
        System.out.println("Pao Shibata - Custo Total: R$ " + df.format(custoTotalPaoShibata));
    }

    public static double custoTotal(double ingredientes, double maoDeObra, double despesasFixas){
        return  (ingredientes + maoDeObra + despesasFixas);
    }

    public static String valorVenda(double custoTotal, int lucroDesejadoPorcent, double margemSegurancaPorcent){
        return  df.format((custoTotal + ((custoTotal /100) * lucroDesejadoPorcent) + ((custoTotal / 100) * margemSegurancaPorcent)));
    }
}
