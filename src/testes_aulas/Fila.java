package testes_aulas;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<Integer> fila = new LinkedList<Integer>();

        for (int i = 0; i <= 10; i++) {
            fila.add(i);
        }
        System.out.println("Fila: " + fila);
        System.out.println("Removendo elemento da fila: " + fila.remove(2));
        System.out.println(fila);
        System.out.println("Adicionando elemento na fila: " + fila.add(2));
        System.out.println(fila);
        System.out.println("Exibir primeiro elemento da fila: " + fila.peek());
        System.out.println("Exibir tamanho da fila: " + fila.size());
    }
}
