package ConceitosBasicos;

import java.util.Scanner;

public class Leitura {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu Filme Favorito:");
        String filme = input.nextLine();


        System.out.println("Qual ano de lançamento?:");
        int anoDeLancamento = input.nextInt();

        System.out.println("Avalie de 0 a 10");
        double avalia = input.nextDouble();

        System.out.println("==============================");
        System.out.println("Filme: " + filme);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Avaliação: " + avalia);

        input.close();
    }
}
