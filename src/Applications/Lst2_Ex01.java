package Applications;

import entities.Lst2_ex1Alunos;

import java.util.Locale;
import java.util.Scanner;
    public class Lst2_Ex01 {
        public static void main(String[]Args){
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            Lst2_ex1Alunos aluno;
            aluno = new Lst2_ex1Alunos();

            System.out.println("Insira a matricula do aluno");
            aluno.matricula = sc.nextInt();
            System.out.println("Insira o nome do aluno");
            aluno.nome = sc.next();
            System.out.println("Insira a nota 01 do aluno");
            aluno.nt_1 = sc.nextDouble();
            System.out.println("Insira a nota 02 do aluno");
            aluno.nt_2 = sc.nextDouble();
            System.out.println("Insira a nota do trabalho do aluno");
            aluno.nt_trabalho = sc.nextDouble();

            double aluno_media = aluno.media();
            System.out.println("A média do aluno " + aluno.nome + " é " + aluno_media);
    }
}

