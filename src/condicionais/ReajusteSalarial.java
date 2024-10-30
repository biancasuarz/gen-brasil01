package condicionais;

import java.util.Scanner;

public class ReajusteSalarial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do colaborador: ");
        String nome = sc.nextLine();

        System.out.println("Cargo: ");
        int numCargo = sc.nextInt();

        System.out.println("Salario: R$");
        double salarioAtual = sc.nextDouble();

        String cargo = "";
        double percentualReajuste;

        switch (numCargo) {
            case 1:
                cargo = "Gerente";
                percentualReajuste = 0.10;
                break;
            case 2:
                cargo = "Vendedor";
                percentualReajuste = 0.07;
                break;
            case 3:
                cargo = "Supervisor";
                percentualReajuste = 0.09;
                break;
            case 4:
                cargo = "Motorista";
                percentualReajuste = 0.06;
                break;
            case 5:
                cargo = "Estoquista";
                percentualReajuste = 0.05;
                break;
            case 6:
                cargo = "Técnico de TI";
                percentualReajuste = 0.08;
                break;
            default:
                System.out.println("Código do cargo inválido!");
                return;
        }

        double novoSalario = salarioAtual + (percentualReajuste * salarioAtual);

        System.out.println("Nome do colaborador: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.printf("Salário: R$ %.2f%n", novoSalario);

        sc.close();
    }
}
