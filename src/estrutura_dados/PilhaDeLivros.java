package estrutura_dados;

import java.util.Scanner;
import java.util.Stack;

public class PilhaDeLivros {

    public static void main(String[] args) {

        Stack<String> pilhaLivro = new Stack<>();
        Scanner sc = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {

            System.out.println("**************************************");
            System.out.println("     1 - Adicionar Livro na pilha");
            System.out.println("     2 - Listar todos os Livros");
            System.out.println("     3 - Retirar Livro da pilha");
            System.out.println("     0 - Sair");
            System.out.println("**************************************");
            System.out.print("Entre com a opção desejada: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){

            case 1:
                System.out.println("Digite o nome do Livro a ser adicionado: ");
                String nome = sc.nextLine();
                pilhaLivro.push(nome);
                System.out.println("\nPilha:");
                for (String pilha: pilhaLivro) {
                    System.out.println(pilha);
                }
                System.out.println("\nLivro adicionado!\n");
                break;

            case 2:
                if (pilhaLivro.isEmpty()) {
                    System.out.println("\nA pilha está vazia.\n");
                } else {
                    System.out.println("\nItens na pilha:");
                    for (String i : pilhaLivro) {
                        System.out.println(i);
                    }
                }
                break;

            case 3:
                if (pilhaLivro.isEmpty()) {
                    System.out.println("\nA pilha está vazia.\n");
                } else {
                    String removeLivro = pilhaLivro.pop();
                    System.out.println(pilhaLivro);
                    System.out.println("\nUm livro foi retirado da pilha.\n");
                }
                break;

            case 0:
                System.out.println("\nPrograma finalizado!");
                 sair = true;
                break;
            }
        }
    }
}
