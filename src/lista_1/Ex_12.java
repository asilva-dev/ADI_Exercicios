package lista_1;

import java.util.Locale;
import java.util.Scanner;

public class Ex_12 {

    public static void main(String[]Args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[] peso = new double[10];

        for(int i = 0; i < 10; i++){
            System.out.println("Insira o peso do individuo: ");
            peso[i] = sc.nextDouble();
        }

    }
}
