package entities;

public class Lst2_ex1Alunos {

    public int matricula;
    public String nome;
    public Double nt_1;
    public Double nt_2;
    public Double nt_trabalho;
    public Double peso1 = 2.5;
    public  Double peso2 = 2.0;

    public double media(){
        double m =(nt_1 * peso1) + (nt_2 * peso1) + (nt_trabalho * peso2) / (peso1 + peso2);
        return m;
    }
}
