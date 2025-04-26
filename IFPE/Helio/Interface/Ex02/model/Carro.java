package IFPE.Helio.Interface.Ex02.model;

public class Carro implements VeiculoMotorizado {

    private boolean motorLigado = false;

    @Override
    public void ligarMotor() {
        motorLigado = true;
        System.out.println("Motor do carro ligado.");
    }

    @Override
    public void desligarMotor() {
        motorLigado = false;
        System.out.println("Motor do carro desligado.");
    }

    @Override
    public void acelerar() {
        if (motorLigado) {
            System.out.println("Acelerando o carro!");
        } else {
            System.out.println("Não é possível acelerar. O motor está desligado.");
        }
    }

    @Override
    public void frear() {
        System.out.println("Freando o carro!");
    }

    @Override
    public void virar(String direcao) {
        System.out.println("Virando o carro para " + direcao);
    }
}
