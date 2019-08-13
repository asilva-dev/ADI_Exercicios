package lista_1;

import java.util.Scanner;

public class Ex_06 {

    public static void main(String[] Args) {

        String palavra;
        boolean ehPalindromo = true;

        //Instanciando e criando um objeto Scanner:
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma cadeia de caracteres: ");
        palavra = entrada.next();

        int j = palavra.length();
        for (int i = 0; i < j / 2 && ehPalindromo; i++) {
            ehPalindromo = (palavra.charAt(i) == palavra.charAt(j - i - 1));
        }

        System.out.println("A sequência " + palavra + (ehPalindromo ? "" : " não") + " é palíndromo.");
    }
}
