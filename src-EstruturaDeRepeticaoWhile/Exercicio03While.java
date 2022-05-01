/*
URI 1134 - JAVA

Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.

Exemplo:

Entrada:        Saída:
8               MUITO OBRIGADO
1               Alcool: 1
7               Gasolina: 2
2               Diesel: 0
2
4
*/

import java.util.Scanner;

public class Exercicio03While {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acumuladorAlcool = 0, acumuladorGasolina = 0,
                acumuladorDiesel = 0;

        System.out.println("Bem-Vindo ao Posto GCombustíveis\n" );
        System.out.println("Pressione:\n 1 - Álcool\n 2 - Gasolina\n " +
                "3 - Diesel\n 4 - Encerrar a operação\n");
        System.out.print("Sua opção: ");
        int combustivelDesejado = sc.nextInt();

        while(combustivelDesejado != 4) {

            if (combustivelDesejado == 1) {
                acumuladorAlcool++;
            } else if (combustivelDesejado == 2) {
                acumuladorGasolina++;
            } else if (combustivelDesejado == 3) {
                acumuladorDiesel++;
            } else {
                System.out.println("Insira um Código Válido");
                System.out.println("Pressione:\n 1 - Álcool\n 2 - Gasolina\n " +
                        "3 - Diesel\n 4 - Encerrar a operação\n");
            }
            System.out.print("\nSua opção: ");
            combustivelDesejado = sc.nextInt();
        }

        System.out.println("\nMuito Obrigado");
        System.out.println("Alcool: " + acumuladorAlcool);
        System.out.println("Gasolina: " + acumuladorGasolina);
        System.out.println("Diesel: " + acumuladorDiesel);
        sc.close();
    }
}
