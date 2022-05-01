/*
URI 1067 - JAVA

Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.

Exemplo:

Entrada:        Saída:
8               1
                3
                5
                7
*/

import java.util.Scanner;

public class Exercicio01For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número inteiro de 1 à 1000");
        int numeroInteiro = sc.nextInt();

        System.out.println("Os números ímpares de 1 até " + numeroInteiro);

        for(int i = 1; i <= numeroInteiro; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
