package lacos_repeticao;

import java.util.Scanner;

public class SomaPositivos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Iniciando programa...");
        System.out.println("Para finalizá-lo, digite o número 0.");

        int numero;
        int soma = 0;

        do {
            System.out.println("Digite um número: ");
            numero = sc.nextInt();

            if (numero > 0) {
                soma += numero;
            }

        } while (numero != 0);

        System.out.println("A soma dos números positivos é: " + soma);

        sc.close();
    }
}
