/*
URI 1116 - JAVA

Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.

Exemplo:

Entrada:         Saída:
3
3  -2            -1.5
-8  0            Divisão impossível
0   8            0.0

*/

import java.util.Scanner;
import java.util.Locale;

public class Exercicio04For {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas divisões deseja realizar?");
        int quantidadeDeDivisoes = sc.nextInt();
        double dividendo, divisor, resultadoDaDivisao;

        for (int i = 1; i <= quantidadeDeDivisoes; i++){
            System.out.println("------ Divisão nº " + i + " ------");
            System.out.println();
            System.out.println("Insira o dividendo:");
            dividendo = sc.nextDouble();
            System.out.println("Insira o divisor:");
            divisor = sc.nextDouble();
            System.out.println();

            if (divisor != 0){
                resultadoDaDivisao = dividendo / divisor;
                System.out.printf("%s %.1f %s %.1f %s %.1f \n", "O resultado da divisão ",
                        dividendo, " / ", divisor, " = ", resultadoDaDivisao);
                System.out.println();
            } else {
                System.out.println("Divisão impossível. O divisor é igual a zero!");
                System.out.println();
            }

        }
        sc.close();
    }
}
