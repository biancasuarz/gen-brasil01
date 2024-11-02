package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class EncontrarNumeroDigitado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(2);
        numeros.add(5);
        numeros.add(1);
        numeros.add(3);
        numeros.add(4);
        numeros.add(9);
        numeros.add(7);
        numeros.add(8);
        numeros.add(10);
        numeros.add(6);

        System.out.println("-------------------------------------------------");
        System.out.print("Digite o número que você deseja encontrar: ");
        int busca = scanner.nextInt();

        if (numeros.contains(busca)) {
            int posicao = numeros.indexOf(busca);
            System.out.println("O número " + busca + " está localizado na posição: " + posicao);
            System.out.println("-------------------------------------------------");
        } else {
            System.out.println("O número " + busca + " não foi encontrado!");
            System.out.println("-------------------------------------------------");
        }
        scanner.close();
    }
}

