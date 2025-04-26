package model;

public class Retangulo implements AreaCalculavel, PerimetroCalculavel {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return largura * altura;
    }

    @Override
    public double calculaPerimetro() {
        return 2 * (largura + altura);
    }
}

