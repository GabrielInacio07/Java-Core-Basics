package ConceitosBasicos;

import java.util.Scanner;

public class For {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double avaliacao = 0;

        for (int i = 0; i <3; i++) {
            System.out.println("Digite a %f sua Avaliação para o filme");
            avaliacao = input.nextDouble();
            mediaAvaliacao += avaliacao;
        }

        System.out.println("Média de Avaliação " + mediaAvaliacao/3);

        input.close();
    }
}
