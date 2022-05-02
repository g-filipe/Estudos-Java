/*

URI 1003 - Java

Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.

Exemplos:

Entrada:    Saída:

10
30          SOMA = 40

-30
10          SOMA = -20

-30
10          SOMA = 0

 */

import java.util.Scanner;

public class Exercicio001_SomaDeDoisNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculando a soma de dois números inteiros");
        System.out.println("Insira o primeiro número:");
        int numeroDigitado1 = sc.nextInt();
        System.out.println("Insira o segundo número:");
        int numeroDigitado2 = sc.nextInt();

        int soma = numeroDigitado1 + numeroDigitado2;

        System.out.println("SOMA = " + soma);

        sc.close();
    }
}
