package testes_aulas;

import java.util.ArrayList;
import java.util.Collections;

public class TestaArray {

    public static void main(String[] args) {

        ArrayList<Double> notas = new ArrayList<>();

        notas.add(7.0);
        notas.add(8.0);
        notas.add(9.0);
        notas.add(10.0);

        System.out.println(notas.toString());
        System.out.println(Collections.max(notas));
        System.out.println(Collections.min(notas));
        System.out.println(Collections.max(notas, Collections.reverseOrder()));
        System.out.println(Collections.min(notas, Collections.reverseOrder()));
        System.out.println("Possui nota 7? " + notas.contains(7.0)); //true or false
        System.out.println("Possui nota 11? " + notas.contains(11.0));
    }
}
