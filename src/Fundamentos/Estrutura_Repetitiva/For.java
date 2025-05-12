package Fundamentos.Estrutura_Repetitiva;

import java.util.Scanner;

public class For
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        double valor = 0;

        for(int i = 0; i < 3; i++)
        {
            System.out.println("Digite um valor: ");
            double n1 = entrada.nextDouble();

            valor = valor + n1;
        }
        System.out.println( "A soma dos valores é igual a: " + valor);

        for(int i = 4; i > 0; i--)
        {
            System.out.println( "Valor de i: " + i);
        }
    }
}
