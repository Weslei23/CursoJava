package Fundamentos.Outros_Topicos;

import java.util.Scanner;

public class SintaxeMetodos
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 3 numeros");
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();

        int higher = maior(a, b, c);

        mostrarResultado(higher);
    }

    public static int maior(int a, int b, int c)
    {
        int aux;

        if(a > b && a > c)
        {
            aux = a;
        }
        else if(b > c)
        {
            aux = b;
        }
        else
        {
            aux = c;
        }

        return aux;
    }

    public static void mostrarResultado( int valor)
    {
        System.out.println("Valor maior: " + valor);
    }
}
