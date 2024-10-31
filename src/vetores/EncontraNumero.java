package vetores;

import java.util.Scanner;

public class EncontraNumero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num[] = {2,5,1,3,4,9,7,8,10,6};

        System.out.println("Digite um número:");
        int digiteNumero = sc.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < num.length; i++) {
            if (num[i] == digiteNumero) {
                System.out.println("O número " + digiteNumero + " está localizado na posição: " + i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
                System.out.println("Número " + digiteNumero + " não foi encontrado!");
        }
    }
}
