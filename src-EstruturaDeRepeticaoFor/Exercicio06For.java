/*
URI 1157 - JAVA

Ler um número inteiro N e calcular todos os seus divisores.

Exemplo:

Entrada:         Saída:
6                1
                 2
                 3
                 6
*/

import java.util.Scanner;

public class Exercicio06For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número para descobrir todos os seus divisores");
        int dividendo = sc.nextInt();

        System.out.println("Os divisores de " + dividendo + " são:");

        for (int i = 1; i <= dividendo; i++){

            if(dividendo % i == 0){
                System.out.println(i);
            }
        }
    }
}
