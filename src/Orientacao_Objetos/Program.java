package Orientacao_Objetos;

import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Digite o valor X do triangulo: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite o valor Y do triangulo: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Area: %.2f", areaX);
        System.out.printf("Area: %.2f", areaY);
    }
}
