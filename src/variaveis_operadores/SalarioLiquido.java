package variaveis_operadores;

import java.util.Scanner;

public class SalarioLiquido {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as informações solicitadas para obter o valor do salário liquído: ");

        System.out.println("Digite seu salário bruto: ");
        float salarioBruto = sc.nextFloat();

        System.out.println("Digite o adicional noturno: ");
        float adicionalNoturno = sc.nextFloat();

        System.out.println("Digite o valor das horas extras feitas no mês: ");
        float horasExtras = sc.nextFloat();

        System.out.println("Digite o valor dos descontos: ");
        float descontos = sc.nextFloat();

        float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
        System.out.println("Seu salário liquido é de: " + salarioLiquido);

        sc.close();
    }
}
