/*
URI 1046 - Java

Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

Exemplos:

Entrada:      Saída:

6 24          Sao Multiplos
6 25          Nao sao Multiplos
24 6          Sao Multiplos

 */

import java.util.Scanner;

public class Exercicio004_DuracaoDoJogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int duracaoDoJogo;

        System.out.println("Descubra a duração de um jogo");
        System.out.println("Insira a hora do início do jogo (Formato 24h): ");
        int horaInicioJogo = sc.nextInt();
        System.out.println("Insira a hora do término do jogo (Formato 24h): ");
        int horaTerminoJogo = sc.nextInt();

        if (horaInicioJogo >= horaTerminoJogo) {
            duracaoDoJogo = 24 - horaInicioJogo + horaTerminoJogo;
            System.out.println("O jogo durou " + duracaoDoJogo + " hora(s)");
        } else {
            duracaoDoJogo = horaTerminoJogo - horaInicioJogo;
            System.out.println("O jogo durou " + duracaoDoJogo + " hora(s)");
        }

        sc.close();
    }
}
