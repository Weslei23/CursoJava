package Orientacao_Objetos.Encapsulamento;

public class Pessoa
{
    private String nome;
    private String sobrenome;
    private String dataNasc;

    public String getNome()
    {
        return nome;
    }
    public void setNome(String n)
    {
        nome = n;
    }
    public String getSobrenome()
    {
        return sobrenome;
    }
    public void setSobrenome(String s)
    {
        sobrenome = s;
    }
    public String getDataNasc()
    {
        return dataNasc;
    }
    public void setDataNasc(String d)
    {
        dataNasc = d;
    }
}

