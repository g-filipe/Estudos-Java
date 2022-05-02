/*
URI 1037 - Java

Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

Exemplos:

Entrada:       Saída:

25.01          Intervalo (25,50]
25.00           Intervalo [0,25]
100.0          Intervalo (75,100]
-25.02         Fora de Intervalo

 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio006_Intervalos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número: ");
        double numeroDigitado = sc.nextDouble();

        if (numeroDigitado < 0 || numeroDigitado > 100) {
            System.out.println("Fora de intervalo");
        } else if (numeroDigitado <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (numeroDigitado <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (numeroDigitado <= 75) {
            System.out.println("Intervalo (50,75]");
        } else {
            System.out.println("Intervalo (75,100]");
        }

        sc.close();
    }
}
