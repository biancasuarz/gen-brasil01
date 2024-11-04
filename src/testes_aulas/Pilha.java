package testes_aulas;

import java.util.Iterator;
import java.util.Stack;

public class Pilha {

    public static void main(String[] args) {

        Stack<String> pilha = new Stack<String>();

        pilha.push("Homem-Aranha");
        pilha.push("Tororo");
        pilha.push("A viagem de Chihiro");
        pilha.push("Nintendo é melhor!");
        pilha.push("Coca é bom mas dá pedra nos rins.");

        System.out.println("\nElementos da Pilha: " + pilha);

        System.out.println("\nRetirar elemento: " + pilha.pop());

        System.out.println("\nElementos da Pilha: " + pilha);

        System.out.println("\nRetirar elemento: " + pilha.pop());

        System.out.println("\nElementos da Pilha: " + pilha);

        System.out.println("\nElemento no topo da Pilha: " + pilha.peek());

        System.out.println("\nAdicionar Elemento Megadrive é melhor que Nintendo: " + pilha.push("Megadrive é melhor que Nintendo"));

        System.out.println("\nExibir a Pilha Atualizada: " + pilha);

        System.out.println("\nTamanho da Pilha: " + pilha.size());

        System.out.println("\nO Elemento Prato Verde existe na Pilha? " + pilha.contains("Homem-Aranha"));

        System.out.println("\nExibir todos os Elementos da Pilha por Iteração");

        Iterator<String> iterator = pilha.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        pilha.clear();

        System.out.println("\nA Pilha está vazia? " + pilha.isEmpty());

    }

}

