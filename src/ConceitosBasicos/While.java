package ConceitosBasicos;

import java.util.Scanner;

public class While {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double avaliacao = 0;
        int opcao = 0;
        int totalAvaliacao = 0;

        System.out.println("Deseja avaliar?");
        System.out.println("1 - Sim");
        System.out.println("0 - Não");
        opcao = input.nextInt();

        while (opcao != 0) {
            System.out.println("Digite a sua avaliação para o filme:");
            avaliacao = input.nextDouble();

            mediaAvaliacao += avaliacao;
            totalAvaliacao++;

            System.out.println("Deseja avaliar novamente?");
            System.out.println("1 - Sim");
            System.out.println("0 - Não");
            opcao = input.nextInt();
        }

        if (totalAvaliacao > 0) {
            System.out.println("Média final de avaliação: " + (mediaAvaliacao / totalAvaliacao));
        } else {
            System.out.println("Nenhuma avaliação foi registrada.");
        }


        input.close();
    }
}
