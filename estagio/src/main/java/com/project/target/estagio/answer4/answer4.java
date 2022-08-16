package com.project.target.estagio.answer4;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class answer4 {

    public static void main(String args[]) {

        double sp = 67836.43, rj = 36678.66, mg = 29229.88, es = 27165.48, outros = 19849.53;
        double total = sp + rj + mg + es + outros;

        Locale ptBr = new Locale("pt", "BR");
        String valorString = NumberFormat.getCurrencyInstance(ptBr).format(total);

        System.out.println("O Faturamento total no mês foi de: " + valorString + ".");

        double m = ((sp * 100 ) /  total);
        double n = ((rj * 100 ) /  total);
        double o = ((mg * 100 ) /  total);
        double p = ((es * 100 ) /  total);
        double q = ((outros * 100 ) /  total);


        System.out.println("\nO percentual de Faturamento mensal de cada estado foi de: "
                + "\nSP = " + new DecimalFormat("#,##0.00").format(m) + "%"
                + "\nRJ = " + new DecimalFormat("#,##0.00").format(n) + "%"
                + "\nMG = " + new DecimalFormat("#,##0.00").format(o) + "%"
                + "\nES = " + new DecimalFormat("#,##0.00").format(p) + "%"
                + "\nOutros Estados = " + new DecimalFormat("#,##0.00").format(q) + "%");




    }

}

/**
 Dado o valor de Faturamento mensal de uma distribuidora, detalhado por estado:
 SP – R$67.836,43
 RJ – R$36.678,66
 MG – R$29.229,88
 ES – R$27.165,48
 Outros – R$19.849,53
 Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.
 **/

