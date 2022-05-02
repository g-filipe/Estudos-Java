/*
URI 1038 - Java

Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.

------------------------------------------------------
CÓDIGO  |       ESPECIFICAÇÃO        |   PREÇO
------------------------------------------------------
   1    |       Cachorro Quente      |   R$4.00
------------------------------------------------------
   2    |       X-Salada             |   R$4.50
------------------------------------------------------
   3    |       X-Bacon              |   R$5.00
------------------------------------------------------
   4    |      Torrada Simples       |   R$2.00
------------------------------------------------------
   5    |      Refrigerante          |   R$1.50
------------------------------------------------------


Exemplos:

Entrada:      Saída:

3 2          Total: R$ 10.00
2 3          Total: R$ 13.50

 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio005_ComandaLanchonete {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double precoDoProdutoEscolhido = 0, totalAPagar;
        String itemSelecionado = "";

        System.out.println("Olá, seja bem-vindo a Fast Lanches!");
        System.out.println("Selecione o produto de sua preferência:\n");
        System.out.println(" 1 - Cachorro Quente ---------- R$4.00\n 2 - X-Salada ----------------- R$4.50\n" +
                " 3 - X-Bacon ------------------ R$5.00\n 4 - Torrada Simples ---------- R$2.00\n" +
                " 5 - Refrigerante ------------- R$1.50");
        System.out.print("\nCódigo:");
         int codigoProduto = sc.nextInt();
        System.out.print("Insira a quantidade desejada: ");
        int quantidadeDoProdutoEscolhido = sc.nextInt();

        if (codigoProduto == 1) {
            itemSelecionado = "Cachorro Quente";
            precoDoProdutoEscolhido = 4.00;
        } else if (codigoProduto == 2) {
            itemSelecionado = "X-Salada";
            precoDoProdutoEscolhido = 4.50;
        } else if (codigoProduto == 3) {
            itemSelecionado = "X-Bacon";
            precoDoProdutoEscolhido = 5.00;
        } else if (codigoProduto == 4) {
            itemSelecionado = "Torrada Simples";
            precoDoProdutoEscolhido = 2.00;
        } else if (codigoProduto == 5) {
            itemSelecionado = "Refrigerante";
            precoDoProdutoEscolhido = 1.50;
        }

        totalAPagar = precoDoProdutoEscolhido * quantidadeDoProdutoEscolhido;
        System.out.println();
        System.out.println("----- Resumo do Pedido ------ ");
        System.out.println();
        System.out.printf("Item: " + itemSelecionado + " ------- " + "R$%.2f\n",precoDoProdutoEscolhido);
        System.out.println("Quantidade: " + quantidadeDoProdutoEscolhido);
        System.out.printf("Total a pagar: R$%.2f",totalAPagar);

        sc.close();
    }
}
