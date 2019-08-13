package lista_1;

import java.util.Locale;
import java.util.Scanner;

public class Ex_11 {

    public static void main(String[]Args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o numero de funcionarios atual: ");
        int num_funcionarios = sc.nextInt();

        double[] salarys = new double[num_funcionarios];

        for(int i = 0; i < num_funcionarios; i++){
            System.out.println("Insira o salario do funcionario: ");
            salarys[i] = sc.nextDouble();
        }

        double sum = 0.0;

        for (int i=0; i<num_funcionarios; i++){
            sum += salarys[i];
        }

        double media = sum / num_funcionarios;

        System.out.println("A media salarial é: " + media);

        sc.close();
    }
}
