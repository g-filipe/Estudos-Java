/*

URI 1007 - Java

Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

Exemplos:

Entrada:       Saída:

5              DIFERENCA= -26
6
7
8
-----------------------------------
5              DIFERENCA= 86
6
-7
8

 */

import java.util.Scanner;

public class Exercicio003_DiferencaEntreProdutos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculando a diferença entre produtos de números inteiros");
        System.out.println("Insira o primeiro número:");
        int numeroDigitado1 = sc.nextInt();
        System.out.println("Insira o segundo número:");
        int numeroDigitado2 = sc.nextInt();
        System.out.println("Insira o terceiro número:");
        int numeroDigitado3 = sc.nextInt();
        System.out.println("Insira o quarto número:");
        int numeroDigitado4 = sc.nextInt();

        int diferencaDosProdutos = numeroDigitado1 * numeroDigitado2 - numeroDigitado3 * numeroDigitado4;

        System.out.println("DIFERENCA DOS PRODUTOS = " + diferencaDosProdutos);

        sc.close();
    }
}
