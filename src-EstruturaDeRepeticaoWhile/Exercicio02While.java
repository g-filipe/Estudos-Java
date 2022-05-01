/*
URI 1115 - JAVA

Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

Exemplo:

Entrada:        Saída:
2  2            primeiro
3 -2            quarto
-8 -1           terceiro
-7  1           segundo
0  2
*/

import java.util.Scanner;

public class Exercicio02While {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a coordenada X: ");
        int x = sc.nextInt();
        System.out.print("Insira a coordenada Y: ");
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro Quadrante");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo Quadrante");
            } else if (x < 0) {
                System.out.println("Terceiro Quadrante");
            } else {
                System.out.println("Quarto Quadrante");
            }
            System.out.println();
            System.out.print("Insira a coordenada X: ");
            x = sc.nextInt();
            System.out.print("Insira a coordenada Y: ");
            y = sc.nextInt();
        }
        sc.close();
    }
}
