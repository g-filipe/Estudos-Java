/*
Fazer um programa para ler três números inteiros e mostrar na tela o maior deles.

Exemplo:

Insira três números:
5
8
3
Maior Número = 8

*/

import java.util.Scanner;
public class Exercicio001_OMaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira três números:");
        System.out.println("Digite o primeiro número:");
        int numero1 = sc.nextInt();
        System.out.println("Digite o segundo número:");
        int numero2 = sc.nextInt();
        System.out.println("Digite o terceiro número:");
        int numero3 = sc.nextInt();

        int maiorDosNumeros = max(numero1, numero2, numero3);

        mostrarMaiorDosNumeros(maiorDosNumeros);

        sc.close();
    }
    public static int max(int num1, int num2, int num3) {
        int aux;
        if (num1 > num2 && num1 > num3) {
            aux = num1;
        } else if (num2 > num3) {
            aux = num2;
        } else {
            aux = num3;
        }
        return aux;
    }
    public static void mostrarMaiorDosNumeros(int value) {
        System.out.println("O maior número digitado é o " + value);
    }
}