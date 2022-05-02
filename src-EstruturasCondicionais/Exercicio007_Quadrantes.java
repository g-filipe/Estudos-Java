/*
URI 1041 - Java

* Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano.
* A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem
 (x = y = 0).
* Se o ponto estiver na origem, escreva a mensagem “Origem”.
* Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.

                                        | Y
                                        |
                                   Q2   |  Q1     X
                               ---------|----------
                                   Q3   |  Q4
                                        |
                                        |
Exemplos:

Entrada:      Saída:

4.5 -2.2      Q4
0.1 0.1       Q1
0.0 0.0       Origem

 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio007_Quadrantes {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o eixo X: ");
        double eixoX = sc.nextDouble();
        System.out.println("Digite o eixo X: ");
        double eixoY = sc.nextDouble();

        if (eixoX == 0 && eixoY == 0) {
            System.out.println("Origem");
        } else if (eixoX == 0) {
            System.out.println("Eixo Y");
        } else if (eixoY == 0) {
            System.out.println("Eixo X");
        } else if (eixoX > 0 && eixoY > 0) {
            System.out.println("Q1");
        } else if (eixoX > 0 && eixoY < 0) {
            System.out.println("Q4");
        } else if (eixoY < 0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q2");
        }
        sc.close();
    }
}
