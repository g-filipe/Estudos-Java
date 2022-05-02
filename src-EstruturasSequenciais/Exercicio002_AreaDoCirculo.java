/*

URI 1002 - Java

Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.

Fórmula da área: area = π . raio2

Considere o valor de π = 3.14159

Exemplos:

Entrada:       Saída:

2.00           A=12.5664
100.64         A=31819.3103
150.00         A=70685.7750


 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio002_AreaDoCirculo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double PI = 3.14159;

        System.out.println("Calculando a área de um círculo");
        System.out.println("Insira a medida do raio do circulo que deseja saber a respectiva área:");
        double raioDoCirculo = sc.nextDouble();

        double areaDoCirculo = PI * Math.pow(raioDoCirculo,2);

        System.out.printf("ÁREA DO CÍRCULO = %.4f", areaDoCirculo);

        sc.close();
    }
}
