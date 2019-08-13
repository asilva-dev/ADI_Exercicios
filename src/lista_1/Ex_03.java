package lista_1;

import java.util.Scanner;

public class Ex_03 {

    public static void main(String[]Args) {

        Scanner sc = new Scanner(System.in);

        int num, numero;
        String b="";

        System.out.println("Insira um número inteiro: ");
        num = numero = sc.nextInt();

        while (num > 0 ){ //enquanto num for maior que 0

            if(num%2==0) { //se o resto de num por 2 for = 0
                b = "0" + b;
            }else {
                b = "1" + b;
            }
            num = num/2;
        }

        System.out.println("A conversão de "+numero+" para binário é: "+b);
    }
}
