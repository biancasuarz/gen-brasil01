package lacos_repeticao;

import java.util.Scanner;

public class Multiplo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número do intervalo: ");
        int primeiroNumero = sc.nextInt();

        System.out.println("Digite o último número do intervalo: ");
        int ultimoNumero = sc.nextInt();

        if (primeiroNumero >= ultimoNumero) {
            System.out.println("Intervalo inválido!");
            return;
        }

        System.out.println("\nNo Intervalo entre " + primeiroNumero + " e " + ultimoNumero + ":");

        for (int i = primeiroNumero; i <= ultimoNumero; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " é múltiplo de 3 e 5");
            }
        }
        sc.close();
    }
}
