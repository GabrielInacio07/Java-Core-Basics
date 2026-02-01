package ConceitosBasicos;

public class OperacaoMatematica {

    public OperacaoMatematica() {}

    public static void gettingNumbers(int number, int number2) {
        System.out.println("Recebendo os números: " + number + " e " + number2);
        System.out.println("A soma é: " + (number + number2));
        System.out.println("A subtração é: " + (number - number2));
    }

    public static void doubleNumbers(double number, double number2) {
        System.out.println("Soma de doubles: " + (number + number2));
    }

    public static String gradeAverage(double nota1, double nota2, double nota3) {
        double resultado = (nota1 + nota2 + nota3) / 3;
        return resultado >= 5 ? "APROVADO" : "REPROVADO";
    }

    public static void main(String[] args) {
        System.out.println("=== Teste de OperacaoMatematica ===");
        gettingNumbers(10, 5);
        doubleNumbers(5.5, 2.7);
        System.out.println("Resultado média: " + gradeAverage(6, 3.25, 8));
    }
}
