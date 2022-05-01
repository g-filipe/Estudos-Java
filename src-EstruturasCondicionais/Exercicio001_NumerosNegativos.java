/*
Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

Exemplos:

Entrada:    Saída:

-10         NEGATIVO
8           POSITIVO
0           NEUTRO

 */

import java.util.Scanner;

public class Exercicio001_NumerosNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número inteiro e descubra se ele é Negativo ou Positivo!");
        int numeroDigitado = sc.nextInt();

        if (numeroDigitado == 0) {
            System.out.println("O número " + numeroDigitado + " não é positivo nem negativo. Ele é um número NEUTRO!");
        } else if (numeroDigitado > 0) {
            System.out.println("O número " + numeroDigitado + " é POSITIVO!");
        } else {
            System.out.println("O número " + numeroDigitado + " é NEGATIVO!");
        }

        sc.close();
    }
}
