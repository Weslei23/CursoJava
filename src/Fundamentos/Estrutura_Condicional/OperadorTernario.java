package Fundamentos.Estrutura_Condicional;

public class OperadorTernario
{
    public static void main(String[] args)
    {
        //(expressão booleana) ? código 1 : código 2;

        int num = 20;

        System.out.println( (num % 2) == 0? "É Par" : "É Ímpar");

        int numeroDias =  15;//valor entre 1 e 30
        System.out.println((numeroDias <= 15) ? "Primeira quinzena" : "Segunda quinzena");
    }
}
