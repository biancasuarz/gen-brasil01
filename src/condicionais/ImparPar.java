package condicionais;

import java.util.Scanner;

public class ImparPar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num1 = sc.nextInt();

        System.out.println("Digite um numero: ");
        int num2 = sc.nextInt();

        System.out.println("Digite um numero: ");
        int num3 = sc.nextInt();

        System.out.println("Digite um numero: ");
        int num4 = sc.nextInt();

        verificarNumero(num1);
        verificarNumero(num2);
        verificarNumero(num3);
        verificarNumero(num4);

        sc.close();
    }
    public static void verificarNumero(int num) {
        if (num % 2 == 0) {
            System.out.print("O número " + num + " é par");
        } else {
            System.out.print("O número " + num + " é ímpar");
        }

        if (num >= 0) {
            System.out.println(" e positivo.");
        } else {
            System.out.println(" e negativo.");
        }
    }
}
