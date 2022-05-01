/*
Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

Exemplos:

Entrada:    Saída:

12          PAR
-27         IMPAR
0           PAR

 */

import java.util.Scanner;

public class Exercicio002_ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número inteiro e descubra se ele é Par ou Ímpar!");
        int numeroDigitado = sc.nextInt();

        if (numeroDigitado % 2 == 0) {
            System.out.println("O número " + numeroDigitado + " é PAR!");
        } else {
            System.out.println("O número " + numeroDigitado + " é ÍMPAR!");
        }

        sc.close();
    }
}
