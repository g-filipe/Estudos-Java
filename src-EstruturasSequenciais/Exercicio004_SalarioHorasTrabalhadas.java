/*

URI 1008 - Java

Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.

Exemplos:

Entrada:       Saída:

25            NUMBER = 25
100           SALARY = U$ 550.00
5.50
----------------------------------
1             NUMBER = 1
200           SALARY = U$ 4100.00
20.50
----------------------------------
6             NUMBER = 6
145           SALARY = U$ 2254.75
15.55

 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio004_SalarioHorasTrabalhadas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora de Salário de Funcionários (com base nas horas trabalhadas/mês)");
        System.out.println("insira o Número de Identificação do Funcionário:");
        int idFuncionario = sc.nextInt();
        System.out.println("Insira as horas trabalhadas no mês:");
        int horasTrabalhadas = sc.nextInt();
        System.out.println("Insira o valor pago por hora de trabalho:");
        double valorPorHoraTrabalhada = sc.nextDouble();

        double salario = horasTrabalhadas * valorPorHoraTrabalhada;

        System.out.println("NUMBER = " + idFuncionario);
        System.out.printf("SALARY = U$ %.2f", salario);

        sc.close();
    }
}
