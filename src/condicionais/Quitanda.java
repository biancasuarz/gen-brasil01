package condicionais;

import java.util.Scanner;

public class Quitanda {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Código do Produto: ");
        int codigoProduto = scanner.nextInt();

        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();

        String produto = "";
        double preco = 0.0;

        switch (codigoProduto) {
            case 1:
                produto = "Cachorro Quente";
                preco = 10.00;
                break;
            case 2:
                produto = "X-Salada";
                preco = 15.00;
                break;
            case 3:
                produto = "X-Bacon";
                preco = 18.00;
                break;
            case 4:
                produto = "Bauru";
                preco = 12.00;
                break;
            case 5:
                produto = "Refrigerante";
                preco = 8.00;
                break;
            case 6:
                produto = "Suco de laranja";
                preco = 13.00;
                break;
            default:
                System.out.println("Código do produto inválido!");
                scanner.close();
                return;
        }

        double valorTotal = quantidade * preco;

        System.out.println("Produto: " + produto);
        System.out.printf("Valor total: R$ %.2f%n", valorTotal);

        scanner.close();
    }
}



