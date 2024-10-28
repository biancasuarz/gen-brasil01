package variaveis_operadores;

import java.util.Scanner;

public class CalculoResto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 4 números e obtenha a diferença deles: ");

        System.out.println("Digite o primeiro número: ");
        float n1 = sc.nextFloat();

        System.out.println("Digite o segundo número: ");
        float n2 = sc.nextFloat();

        System.out.println("Digite o terceiro número: ");
        float n3 = sc.nextFloat();

        System.out.println("Digite o quarto número: ");
        float n4 = sc.nextFloat();

        float resto = (n1 * n2) - (n3 * n4);

        System.out.println(" A diferença é: " + resto);

        sc.close();
    }
}