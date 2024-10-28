package variaveis_operadores;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite suas 4 notas para obter sua média final: ");
        float nota1 = sc.nextFloat();
        float nota2 = sc.nextFloat();
        float nota3 = sc.nextFloat();
        float nota4 = sc.nextFloat();

        float mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.printf("Sua média final é: %.1f%n", mediaFinal);

        sc.close();
    }
}
