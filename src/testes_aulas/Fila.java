package testes_aulas;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<Integer> fila = new LinkedList<Integer>();

        for (int i = 0; i <= 10; i++) {
            fila.add(i);
        }
        System.out.println("\nFila: " + fila);
        System.out.println("\nRemovendo elemento da fila: " + fila.remove(2));System.out.println(fila);
        System.out.println("\nAdicionando elemento na fila: " + fila.add(2));
        System.out.println("\nExibir primeiro elemento da fila: " + fila.peek());
        System.out.println("\nExibir tamanho da fila: " + fila.size());
        System.out.println();

        Iterator<Integer> iterator = fila.iterator();
        while (iterator.hasNext()) {
            System.out.println("Próximo da fila é: " + iterator.next());
        }
        fila.clear();
        System.out.println("\nA fila está vazia: " + fila.isEmpty());
    }
}
