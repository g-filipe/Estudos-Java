/*
URI 1143 - JAVA

Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo.

Exemplo:

Entrada:         Saída:
5                1 1 1
                 2 4 8
                 3 9 27
                 4 16 64
                 5 25 125
*/

import java.util.Scanner;

public class Exercicio07For {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo: ");
        int numeroInteiroPositivo = sc.nextInt();

        while (numeroInteiroPositivo <= 0){
            System.out.println("Número Inválido. Insira um número igual ou maior do que 1");
            System.out.println("Digite um número inteiro positivo: ");
            numeroInteiroPositivo = sc.nextInt();
        }

        for (int i = 1; i <= numeroInteiroPositivo; i++) {

            int quadradoNumeroInteiroPositivo = (int) Math.pow(i, 2),
                    cuboNumeroInteiroPositivo = (int) Math.pow(i, 3);

            System.out.printf("%d %d %d\n", i, quadradoNumeroInteiroPositivo, cuboNumeroInteiroPositivo);

        }

    }
}
