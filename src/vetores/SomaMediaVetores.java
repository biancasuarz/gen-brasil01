package vetores;

import java.util.Scanner;

public class SomaMediaVetores {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[10];
        int soma = 0;
        int media;

        System.out.println("Digite 10 números inteiros e veja quais são ímpares, pares, a soma e média deles: ");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
            soma += vetor[i];
        }

        media = soma / vetor.length;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        System.out.println("Números pares:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
            }
        }

        System.out.println("\nNúmeros ímpares:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) {
                System.out.print(vetor[i] + " ");
            }
        }

        sc.close();
    }
}
