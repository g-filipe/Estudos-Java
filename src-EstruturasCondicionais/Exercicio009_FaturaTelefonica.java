/*
Problema - JAVA

Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos de telefone. Cada minuto
que exceder a franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a quantidade de minutos que uma pessoa
consumiu, daí mostrar o valor a ser pago.

Entrada         Saída
22              Valor a pagar: R$ 50.00
103             Valor a pagar: R$ 56.00

 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio009_FaturaTelefonica {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valorPlanoDeTelefonia = 50.0;
        int franquiaDeMinutosPlanoDeTelefonia = 100;
        double excedenteMinutosFranquia = 0;
        double valorTotalExcedenteFranquia = 0;
        double valorPorMinutoExcedente = 2.0;
        double valorDaFaturaAtual = 50.0;

        System.out.println("Simule o valor da sua Fatura Telefônica (Plano Brasil Total 100)");
        System.out.println("Insira a quantidade de munutos utilizados em ligações até o momento:");
        int minutosUtilizadosEmLigacoes = sc.nextInt();

        if(minutosUtilizadosEmLigacoes > 100){
            excedenteMinutosFranquia =  minutosUtilizadosEmLigacoes - franquiaDeMinutosPlanoDeTelefonia;
            valorTotalExcedenteFranquia = excedenteMinutosFranquia * valorPorMinutoExcedente;
            valorDaFaturaAtual += valorTotalExcedenteFranquia;
        }

        System.out.println("Detalhamento da Fatura");
        System.out.println("-----------------------------");
        System.out.printf("Valor do Plano Total 100: R$%.2f%n", valorPlanoDeTelefonia);
        System.out.println("Minutos utilizados:" + minutosUtilizadosEmLigacoes);
        System.out.println("Minutos excedentes da Franquia (Plano Total 100 minutos): " + excedenteMinutosFranquia);
        System.out.printf("Valor excedente a pagar (R$2.00 por Minuto Excedente): R$ %.2f%n", valorTotalExcedenteFranquia);
        System.out.printf("Valor a pagar: R$ %.2f%n", valorDaFaturaAtual);

        sc.close();
    }
}

