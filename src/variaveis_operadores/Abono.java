package variaveis_operadores;

import java.util.Scanner;

public class Abono {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Salário: ");
        int salario = sc.nextInt();

        System.out.println("Digite o Abono: ");
        int abono = sc.nextInt();

        int novoSalario = salario + abono;
        System.out.println("Seu salário atual é: " + salario + "\nCom valor do abono é de: " + novoSalario);

        sc.close();
    }
}
