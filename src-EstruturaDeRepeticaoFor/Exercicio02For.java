/*
URI 1072 - JAVA

Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

Exemplo:

Entrada:        Saída:
5                2 in
14               3 out
123
10
-25
32

*/

import java.util.Scanner;

public class Exercicio02For {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerosInteirosDigitados, numerosInteirosDentroIntervalo10_20 = 0,
                numerosInteirosForaIntervalo10_20 = 0;


        System.out.println("Digite a quantidade de números que você deseja inserir:");
        int quantidadeNumerosInteiros = sc.nextInt();

        for (int i = 0; i < quantidadeNumerosInteiros; i++) {
            System.out.println("Insira um número inteiro: ");
            numerosInteirosDigitados = sc.nextInt();

            if (numerosInteirosDigitados >= 10 && numerosInteirosDigitados <= 20) {
                numerosInteirosDentroIntervalo10_20++;
            } else {
                numerosInteirosForaIntervalo10_20++;
            }
        }

        System.out.println(numerosInteirosDentroIntervalo10_20 + " in");
        System.out.println(numerosInteirosForaIntervalo10_20 + " out");

        sc.close();
    }
}
