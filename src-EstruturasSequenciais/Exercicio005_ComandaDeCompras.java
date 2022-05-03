/*

URI 1010 - Java

Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

Exemplos:

Entrada:       Saída:

12 1 5.30      VALOR A PAGAR: = R$ 15.50
16 2 5.10
----------------------------------
13 2 15.30     VALOR A PAGAR: = R$ 51.40
161 4 5.20
----------------------------------
1 1 15.10     VALOR A PAGAR: = R$ 30.20
2 1 15.10

 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio005_ComandaDeCompras {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        System.out.println("Bem-Vindo a Stock Auto-Peças");
        System.out.println("Escolha duas peças para montagem do seu combo.");
        System.out.println("insira o Código da primeira Peça desejada:");
        int codigoPeca1 = sc.nextInt();
        System.out.println("Insira quantidade de peças:");
        int quantidadePecas1 = sc.nextInt();
        System.out.println("Insira o valor da peça:");
        double valorDaPeca1 = sc.nextDouble();

        System.out.println("");
        System.out.println("insira o Código da segunda Peça desejada:");
        int codigoPeca2 = sc.nextInt();
        System.out.println("Insira quantidade de peças:");
        int quantidadePecas2 = sc.nextInt();
        System.out.println("Insira o valor da peça:");
        double valorDaPeca2 = sc.nextDouble();

        double valorTotal = quantidadePecas1 * valorDaPeca1 + quantidadePecas2 * valorDaPeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);

        sc.close();
    }
}
