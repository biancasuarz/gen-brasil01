package condicionais;

import java.util.Scanner;

public class DoadorSangue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do doador: ");
        String nome = sc.nextLine();

        System.out.println("Digite a idade do doador: ");
        int idade = sc.nextInt();

        System.out.println("Primeira doação de sangue? true para sim e false para não.");
        boolean primeiraDoacao = sc.nextBoolean();

        if (idade >= 18 && idade <= 69) {
            if (idade <= 59 || (idade >= 60 && !primeiraDoacao)) {
                System.out.println(nome + " está apto(a) para doar sangue!");
            } else {
                System.out.println(nome + " não está apto(a) para doar sangue.");
            }
        } else {
            System.out.println(nome + " não está apto(a) para doar sangue.");
        }
        sc.close();
    }
}
