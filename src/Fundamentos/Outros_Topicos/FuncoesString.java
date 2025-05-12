package Fundamentos.Outros_Topicos;

import java.util.Scanner;

public class FuncoesString
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        /*
            Formatar: toLowerCase(), toUpperCase(), trim()
            Recortar: substring(inicio), substring(inicio, fim)
            Substituir: Replace(char, char), Replace(string, string)
            Buscar: IndexOf, LastIndexOf
            str.Split("")
         */

        String original = "abcdef FGHIJK ABC abc DEFG";

        String s01 = original.toUpperCase();
        String s02 = original.toLowerCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.println("Original: " + original);
        System.out.println("toUpperCase: " + s01);
        System.out.println("toLowerCase: " + s02);
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring: -" + s04 + "-");
        System.out.println("substring: -" + s05 + "-");
        System.out.println("replace: -" + s06 + "-");
        System.out.println("indexOf: " + i);
        System.out.println("lastIndexOf: " + j);
        System.out.println();
        System.out.println("Split");
        String names = "Weslei Delane Fernando";

        String[] vector = names.split(" ");

        System.out.println("Vector: " + vector[0]);
        System.out.println("Vector: " + vector[1]);
        System.out.println("Vector: " + vector[2]);



    }
}
