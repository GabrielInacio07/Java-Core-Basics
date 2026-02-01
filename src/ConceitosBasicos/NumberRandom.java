package ConceitosBasicos;

import javax.xml.transform.Source;
import java.util.Random;
import java.util.Scanner;

public class NumberRandom {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kickNumber = 0;
        int randomNumber = (int) (Math.random() * 100) + 1;
        int maxTentativas = 5;

        int tentativas = 0;

        System.out.println("Bem-vindo ao jogo [ACERTE O NÚMERO de 1 a 100]");

        while (tentativas < maxTentativas) {
            System.out.println("Restam " + (maxTentativas - tentativas) + " tentativas.");
            System.out.print("Digite um número: ");
            kickNumber = input.nextInt();
            tentativas++;

            if (kickNumber == randomNumber) {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas!");
                break;
            } else if (kickNumber < randomNumber) {
                System.out.println("O número digitado é menor que o número gerado.");
            } else {
                System.out.println("O número digitado é maior que o número gerado.");
            }
        }

        if (tentativas == maxTentativas && randomNumber != 0 && kickNumber != randomNumber) {
            System.out.println("Suas tentativas acabaram! O número correto era: " + randomNumber);
        }

        input.close();
    }
}
