/*
Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
possui a maior área.

A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a
seguinte (fórmula de Heron):

           _________________
 area = ´\/ p(p-a)(p-b)(p-c)    onde   p = (a + b + c) / 2

*/

import java.util.Scanner;
import java.util.Locale;

public class Exercicio002_TrianguloComMaiorArea {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira as medidas do triângulo X");
        System.out.println("Lado A:");
        double ladoATrianguloX = sc.nextDouble();
        System.out.println("Lado B:");
        double ladoBTrianguloX = sc.nextDouble();
        System.out.println("Lado C:");
        double ladoCTrianguloX = sc.nextDouble();

        double p = ValueOfP(ladoATrianguloX, ladoBTrianguloX, ladoCTrianguloX);
        double areaTrianguloX = AreaDoTriangulo(p, ladoATrianguloX, ladoBTrianguloX, ladoCTrianguloX);

        System.out.println("Insira as medidas do triângulo Y");
        System.out.println("Lado A:");
        double ladoATrianguloY = sc.nextDouble();
        System.out.println("Lado B:");
        double ladoBTrianguloY = sc.nextDouble();
        System.out.println("Lado C:");
        double ladoCTrianguloY = sc.nextDouble();

        p = ValueOfP(ladoATrianguloY, ladoBTrianguloY, ladoCTrianguloY);
        double areaTrianguloY = AreaDoTriangulo(p, ladoATrianguloY, ladoBTrianguloY, ladoCTrianguloY);

        System.out.printf("Area do Triângulo X: %.4f\n", areaTrianguloX);
        System.out.printf("Area do Triângulo Y: %.4f\n", areaTrianguloY);

        double imprimirTrianguloComMaiorArea = CalculaMaiorAreaDosTriangulos(areaTrianguloX, areaTrianguloY);

        if (imprimirTrianguloComMaiorArea == areaTrianguloX) {
            System.out.println("O triângulo com a maior área é o Triângulo X");
        } else {
            System.out.println("O triângulo com a maior área é o Triângulo Y");
        }

        sc.close();
    }

    public static double ValueOfP(double ladoATriangulo, double ladoBTriangulo, double ladoCTriangulo) {
        return (ladoATriangulo + ladoBTriangulo + ladoCTriangulo) / 2;
    }

    public static double AreaDoTriangulo(double p, double ladoATriangulo, double ladoBTriangulo, double ladoCTriangulo) {
        return Math.sqrt(p * (p - ladoATriangulo) * (p - ladoBTriangulo) * (p - ladoCTriangulo));
    }

    public static double CalculaMaiorAreaDosTriangulos(double areaTriangulo1, double areaTriangulo2) {
        return Math.max(areaTriangulo1, areaTriangulo2);
    }
}
