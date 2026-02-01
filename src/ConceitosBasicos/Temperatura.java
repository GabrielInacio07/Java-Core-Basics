package ConceitosBasicos;

public class Temperatura {

    public Temperatura() {}

    public static void convertTemp(double celsius) {
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println(
                String.format("Os graus %.2f Celsius em Fahrenheit são: %.2f", celsius, fahrenheit)
        );
    }

    public static void main(String[] args) {
        System.out.println("=== Conversor de Temperatura ===");
        convertTemp(35.0);
        convertTemp(20.0);
        convertTemp(0.0);
    }
}
