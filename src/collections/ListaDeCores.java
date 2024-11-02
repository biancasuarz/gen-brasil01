package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListaDeCores {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> cores = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite uma cor: ");
            String cor = scanner.nextLine();
            cores.add(cor);
        }

        System.out.println("\n----------------------------");
        System.out.println("Lista das cores digitadas:\n");
        for (String cor : cores) {
            System.out.println(cor);
        }

        Collections.sort(cores);

        System.out.println("\n----------------------------");
        System.out.println("Ordenar as cores:\n");
        for (String cor : cores) {
            System.out.println(cor);
        }

        scanner.close();
    }
}

