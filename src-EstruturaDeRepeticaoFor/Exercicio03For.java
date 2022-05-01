/*
URI 1079 - JAVA

Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.

Exemplo:

Entrada:         Saída:
3
6.5 4.3 6.2      5.7
5.1 4.2 8.1      6.3
8.0 9.0 10.0     9.3

*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03For {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a quantidade de testes a serem realizados: ");
        int quantidadeCasosTestes = sc.nextInt();

        double primeiroValorTeste, segundoValorTeste, terceiroValorTeste,
                mediaPonderadaValoresTeste = 0;


        for(int i = 1; i <= quantidadeCasosTestes; i++){
            System.out.println("------ Teste " + i + " ------");
            System.out.println();
            System.out.println("Insira o primeiro valor: ");
            primeiroValorTeste = sc.nextDouble();
            System.out.println("Insira o segundo valor: ");
            segundoValorTeste = sc.nextDouble();
            System.out.println("Insira o terceiro valor: ");
            terceiroValorTeste = sc.nextDouble();

            mediaPonderadaValoresTeste = (primeiroValorTeste * 2 + segundoValorTeste * 3 +
                    terceiroValorTeste * 5) / 10;
            System.out.println();
            System.out.printf("%s %d %s %.1f \n", "A média ponderada do Teste ", i, " é: ", mediaPonderadaValoresTeste);
            System.out.println();
        }
        sc.close();
    }
}

