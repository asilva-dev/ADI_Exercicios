package lista_1;

import java.util.Scanner;

public class Ex_04 {

    public static void main(String[]Args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        int num = sc.nextInt();

        boolean faz_parte = true;
        int numFibonacci = 1, numAnterior = 0, aux;

        if(num == 1){ //se o num inserido fizer parte, é do Fibonacci
            faz_parte = true;
        }else { //se nao
            while (num > numFibonacci){ //enquanto o num for maior que numFibonacci

                faz_parte = ((numFibonacci+numAnterior) == num);

                aux = numFibonacci;
                numFibonacci+=numAnterior;
                numAnterior = aux;
            }
        }

        System.out.println("O número "+num+(faz_parte?"":" não")+" faz parte da sequência de Fibonacci.");
    }
}
