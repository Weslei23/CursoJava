package Fundamentos.Outros_Topicos;

import java.util.Scanner;

public class OperadorBitwise
{
    public static void main(String[] args)
    {
        /*
            & - Operador "E" bit a bit
            | - Operador "OU" bit a bit
         */

        Scanner entrada = new Scanner(System.in);

        int mask = 0b100000;
        int n = entrada.nextInt();

        if ( ( n & mask ) != 0)
        {
            System.out.println("6h bit is true!");
        }
        else
        {
            System.out.println("6h bit is false!");
        }
    }
}
