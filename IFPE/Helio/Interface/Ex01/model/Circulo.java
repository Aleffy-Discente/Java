package model;

public class Circulo implements AreaCalculavel, PerimetroCalculavel {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calculaPerimetro() {
        return 2 * Math.PI * raio;
    }
}
