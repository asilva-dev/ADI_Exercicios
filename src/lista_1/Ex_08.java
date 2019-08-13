package lista_1;

import java.util.Scanner;


public class Ex_08 {

    public static void main(String[]Args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int num = sc.nextInt();

        System.out.println("O número "+num+(numPrimo(num)?"":" não")+" é primo.");

//Imprimir os N primeiros números primos:
        System.out.println("Quantos números primos quer?");
        num = sc.nextInt();

        int encontrados = 0, i = 1;
        while(encontrados<num){
            if(numPrimo(++i)){
                System.out.print(i+" ");
                encontrados++;
            }
        }
    }

    public static boolean numPrimo(int num){
        if(num==2) {
            return true;
        }else if(num%2==0) {
            return false;
        }

        for(int i=3; i*i<=num ;i+=2)
            if(num%i==0)
                return false;
        return true;
    }
}
