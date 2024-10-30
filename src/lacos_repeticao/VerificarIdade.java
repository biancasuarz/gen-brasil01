package lacos_repeticao;

import java.util.Scanner;

public class VerificarIdade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Iniciando programa...");
        System.out.println("Para finalizá-lo, digite qualquer número negativo.");

        int menor21 = 0;
        int maior50 = 0;
        int idade = 0;

        while (true) {
            System.out.println("Digite uma idade: ");
            idade = sc.nextInt();

            if (idade < 0) {
                break;
            }

            if (idade < 21) {
                menor21++;
            } else if (idade > 50) {
                maior50++;
            }
        }

        System.out.println("Total de pessoas menores de 21 anos: " + menor21);
        System.out.println("Total de pessoas maiores de 50 anos: " + maior50);

        sc.close();
    }
}
