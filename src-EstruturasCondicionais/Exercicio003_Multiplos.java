/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos",
indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem crescente
ou decrescente.

Exemplos:

Entrada:      Saída:

6 24          Sao Multiplos
6 25          Nao sao Multiplos
24 6          Sao Multiplos

 */

import java.util.Scanner;

public class Exercicio003_Multiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira dois números inteiros e descubra se eles são múltiplos entre si!");
        System.out.println("Insira o primeiro número: ");
        int numeroDigitado1 = sc.nextInt();
        System.out.println("Insira o segundo número: ");
        int numeroDigitado2 = sc.nextInt();

        if (numeroDigitado1 % numeroDigitado2 == 0 || numeroDigitado2 % numeroDigitado1 == 0) {

            System.out.println("Os números " + numeroDigitado1 + " e " + numeroDigitado2 + " são Múltiplos entre si!");
        } else {
            System.out.println("Os números " + numeroDigitado1 + " e " + numeroDigitado2 + " não são Múltiplos " +
                    " entre si!");
        }

        sc.close();
    }
}
