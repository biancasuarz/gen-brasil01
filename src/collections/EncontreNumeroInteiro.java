package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EncontreNumeroInteiro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Integer> numeros = new HashSet<>();

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

        System.out.print("Digite o número que você deseja encontrar: ");
        int valorProcurado = sc.nextInt();

        if (numeros.contains(valorProcurado)) {
            System.out.println("Número " + valorProcurado + " encontrado!");
        } else {
            System.out.println("O número " + valorProcurado + " não foi encontrado!");
        }

        sc.close();
    }
}

