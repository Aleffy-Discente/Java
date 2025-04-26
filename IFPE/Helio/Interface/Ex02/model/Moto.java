package IFPE.Helio.Interface.Ex02.model;

public class Moto implements VeiculoMotorizado {

    private boolean motorLigado = false;

    @Override
    public void ligarMotor() {
        motorLigado = true;
        System.out.println("Motor da moto ligado.");
    }

    @Override
    public void desligarMotor() {
        motorLigado = false;
        System.out.println("Motor da moto desligado.");
    }

    @Override
    public void acelerar() {
        if (motorLigado) {
            System.out.println("Acelerando a moto!");
        } else {
            System.out.println("Não é possível acelerar. O motor está desligado.");
        }
    }

    @Override
    public void frear() {
        System.out.println("Freando a moto!");
    }

    @Override
    public void virar(String direcao) {
        System.out.println("Virando a moto para " + direcao);
    }
}