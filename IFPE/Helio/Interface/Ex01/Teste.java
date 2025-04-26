import model.Circulo;
import model.Retangulo;

public class Teste {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5.0, 3.0);
        Circulo circulo = new Circulo(4.0);

        System.out.println("Retângulo:");
        System.out.println("Área: " + retangulo.calculaArea());
        System.out.println("Perímetro: " + retangulo.calculaPerimetro());

        System.out.println("\nCírculo:");
        System.out.println("Área: " + circulo.calculaArea());
        System.out.println("Perímetro: " + circulo.calculaPerimetro());
    }
}
