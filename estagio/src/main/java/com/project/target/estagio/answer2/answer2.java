package com.project.target.estagio.answer2;

import java.util.Arrays;
import java.util.Scanner;

public class answer2 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número desejado e tecle enter.");
        long n = leitor.nextLong();

        long[] a = new long[(int) (n + 2)]; //tive que colocar (*2) pq o array tem o tamanho de n, se digitar 3 o array fica pequeno e não chega a calcular até o número 3

        int m = 0, b = 1, c;

        if (n == 0 || n == 1) {
            System.out.println("O número " + n + " pertence a Sequência de Fibonacci. ");
        } else {

            for (int k = 0; k < a.length; k++) {
                a[k] = m;
             //   System.out.println(a[k]); imprime todos os valores calculados
                c = m;
                m = b + c;
                b = c;
            }

            boolean val = contains(a, n);

            if (val == true) {
                System.out.println("O número " + n + " pertence a Sequência de Fibonacci. ");

            } else {
                System.out.println("O número " + n + " não pertence a Sequência de Fibonacci. ");

                leitor.close();
            }

        }
    }

    public static boolean contains(final long[] a, final long n) {
        return Arrays.stream(a).anyMatch(i -> i == n);


    }
}

/* 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores
anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado
um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não
a sequência.

IMPORTANTE:
Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;   */


/* 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores
anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado
um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não
a sequência.

IMPORTANTE:
Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;   */
