/*

URI 1012 - Java

Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B

Exemplos:

Entrada:            Saída:

3.0 4.0 5.2         TRIANGULO: 7.800
                    CIRCULO: 84.949
                    TRAPEZIO: 18.200
                    QUADRADO: 16.000
                    RETANGULO: 12.000
--------------------------------------------
12.7 10.4 15.2      TRIANGULO: 96.520
                    CIRCULO: 725.833
                    TRAPEZIO: 175.560
                    QUADRADO: 108.160
                    RETANGULO: 132.080
--------------------------------------------

 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio006_AreaFigurasGeometricas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double PI = 3.14159;

        System.out.println("Insira três valores para descobrir as áreas de diversas figuras geométricas.");
        System.out.println("Insira a medida A:");
        double medidaA = sc.nextDouble();
        System.out.println("Insira a medida B:");
        double medidaB = sc.nextDouble();
        System.out.println("Insira a medida C:");
        double medidaC = sc.nextDouble();

        System.out.println();
        System.out.println("Resultados:");

        double areaTrianguloRetangulo = medidaA * medidaC / 2;
        System.out.printf("A área do triângulo retângulo é: %.3f%n", areaTrianguloRetangulo);

        double areaCirculo = PI * Math.pow(medidaC,2);
        System.out.printf("A área do triângulo retângulo é: %.3f%n", areaCirculo);

        double areaTrapezio = (medidaA + medidaB) * medidaC /2;
        System.out.printf("A área do trapézio é: %.3f%n", areaTrapezio);

        double areaQuadrado = Math.pow(medidaB, 2);
        System.out.printf("A área do quadrado é: %.3f%n", areaQuadrado);

        double areaRetangulo = medidaA * medidaB;
        System.out.printf("A área do retângulo é: %.3f%n", areaRetangulo);

        sc.close();
    }
}
