package lista_1;

import java.util.Locale;
import java.util.Scanner;

public class Ex_02 {


    public static void main(String[]Args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name;
        double salary, new_salary = 0f, sum_salary = 0f, sum_newSalary = 0f;

        Scanner entrada = new Scanner(System.in);

        while(true){
            System.out.println("Insira o nome do funcionário:");
            name = entrada.nextLine();

            if(name.equalsIgnoreCase(
                    "FIM"))
                break;

            System.out.println("Digite o salário do funcionário: ");
            salary = entrada.nextDouble();

            sum_salary += salary;

            if (salary <= 150){
                new_salary = salary*1.25;
            }else if(salary<=300){
                new_salary = salary*1.20;
            }else if(salary <= 600){
                new_salary = salary*1.15;
            }else if(salary > 600){
                new_salary = salary*1.10;
            }
            sum_newSalary += new_salary;
            System.out.println(name+", salário atual:  "+salary+", salário ajustado: "+ new_salary);
        }

        System.out.println("Soma dos salários atuais: "+sum_salary+", soma dos salários ajustados: "
                +sum_newSalary+". Diferença: "+(sum_newSalary-sum_salary)+".");
    }
}
