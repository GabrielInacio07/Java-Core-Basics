package ConceitosBasicos;

public class Condicionais {

    public static void main(String[] args) {
        int anoDeLancamento = 2025;
        boolean planoAssinado = true;
        double notaDoFilme = 8.5;
        String tipoDoPlano =  "Premium";

        if(anoDeLancamento > 2024){
            System.out.println("Esse Filme está em catálogo ");
        }else{
            System.out.println("Esse Filme está fora de catálogo");
        }

        if(planoAssinado && tipoDoPlano.equals("Premium")){
            System.out.println("Filme liberado");
        }else{
            System.out.println("Deve fazer assinatura para assistir!");
        }
    }
}
