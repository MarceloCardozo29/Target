package com.project.target.estagio.answer5;

import java.util.Scanner;

public class answer5 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a palavra desejada e tecle enter.");

        String entrada = leitor.nextLine();
        String saida = "";
        if (entrada == null || entrada.equals(" ")){
            System.out.println("Foi inserido nulo ou vazio. " + entrada);
        }

        for (int i = entrada.length() - 1; i >= 0; i--){
            saida += entrada.charAt(i);        // concatenando todos os caracteres do final pro começo na minha saida
        }

        System.out.println(saida);

        leitor.close();
    }
}
/**
 5) Escreva um programa que inverta os caracteres de um string.
 IMPORTANTE:
 a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
 b) Evite usar funções prontas, como, por exemplo, reverse;
 **/

