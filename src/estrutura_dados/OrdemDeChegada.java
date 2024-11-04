package estrutura_dados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

    public class OrdemDeChegada {

        public static void main(String[] args) {

            Queue<String> filaClientes = new LinkedList<>();
            Scanner sc = new Scanner(System.in);
            int opcao = -1;

            while (opcao != 0) {
                System.out.println("**************************************************");
                System.out.println("    1 - Adicionar Cliente na fila");
                System.out.println("    2 - Listar todos os Clientes");
                System.out.println("    3 - Retirar Cliente da fila");
                System.out.println("    0 - Sair");
                System.out.println("**************************************************");
                System.out.print("Entre com a opção desejada: ");
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o nome do Cliente: ");
                        String nome = sc.nextLine();
                        filaClientes.add(nome);
                        System.out.println("\nFila:");
                        for (String cliente : filaClientes) {
                            System.out.println(cliente);
                        }
                        System.out.println("\nCliente Adicionado!\n");
                        break;

                    case 2:
                        System.out.println("Lista de Clientes na Fila:");
                        if (filaClientes.isEmpty()) {
                            System.out.println("A fila está vazia.");
                        } else {
                            for (String cliente : filaClientes) {
                                System.out.println(cliente);
                            }
                        }
                        break;

                    case 3:
                        if (filaClientes.isEmpty()) {
                            System.out.println("A Fila está vazia!");
                        } else {
                            String clienteChamado = filaClientes.poll();
                            System.out.println(filaClientes);
                        }
                        break;

                    case 0:
                        System.out.println("Programa Finalizado!");
                        break;
                }
            }

            sc.close();
        }
    }
