/*
URI 1153 - JAVA

Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.

Exemplo:

Entrada:         Saída:
4                24
1                1
5                120
0                1

*/

import java.util.Scanner;

public class Exercicio05For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int resultadoFatorial = 1;
        StringBuilder multiplicador = new StringBuilder();

        System.out.println("Insira um número para descobrir seu respectivo Fatorial:");
        int fatorialDoNumero = sc.nextInt();

        while (fatorialDoNumero < 0) {
            System.out.println("Não é possível calcular o fatorial de números negativos!");
            System.out.println("Insira um número maior ou igual a zero para descobrir seu respectivo Fatorial:");
            fatorialDoNumero = sc.nextInt();
        }

        for (int i = fatorialDoNumero; i > 1; i--) {
            resultadoFatorial *= i;
            multiplicador.append(i).append(" x ");
        }

        if (fatorialDoNumero == 0) {
            System.out.println(fatorialDoNumero + "! = " + resultadoFatorial);
        } else if (fatorialDoNumero == 1){
            System.out.println(fatorialDoNumero + "! = " + resultadoFatorial);
        } else {
            System.out.println(fatorialDoNumero + "! = " + multiplicador + "1 = " + resultadoFatorial);
        }

        sc.close();
    }
}
