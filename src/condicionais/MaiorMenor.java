package condicionais;

import java.util.Scanner;

public class MaiorMenor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número A: ");
        int a = sc.nextInt();

        System.out.println("Digite o numero B: ");
        int b = sc.nextInt();

        System.out.println("Digite o numero C: ");
        int c = sc.nextInt();

            if ( a + b > c){
                System.out.println("A soma de A + B é maior do que C");
            }else if (a + b == c){
                System.out.println("A soma de A + B é igual do que C");
            }else{
                System.out.println("A soma de A + B é menor do que C");
            }

        sc.close();
    }
}
