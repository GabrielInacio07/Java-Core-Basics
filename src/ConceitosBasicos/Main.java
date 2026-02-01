package ConceitosBasicos;

public class Main {
    public static void main(String[] args) {


        double forceCasting = 25.5;
        System.out.println("Primeiro número é DOUBLE: " + forceCasting);

        int forceCasting2 = (int) forceCasting;
        System.out.println("Fazendo casting e passando para INT: " + forceCasting2);

        double precoProduto = 10.25;
        int quantidade = 5;

        System.out.println("Preço do produto é: " + precoProduto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Total: " + (precoProduto * quantidade));
    }
}
