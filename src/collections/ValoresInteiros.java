package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ValoresInteiros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Integer> numeros = new HashSet<>();

        System.out.println("--------------------------------------------");
        System.out.println("Digite 10 valores inteiros DIFERENTES:");

        while (numeros.size() < 10) {
            int valor = sc.nextInt();
            if (!numeros.add(valor)) {
                System.out.println("Valor já existe, digite outro número diferente.\n");
            }
        }

        System.out.println("--------------------------------------------");
        System.out.println("Lista dos dados Set:");
        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("--------------------------------------------");
        sc.close();
    }
}