package IFPE.Helio.Interface.Ex02.model;

public class Bicicleta implements Veiculo {

    @Override
    public void acelerar() {
        System.out.println("Pedalando mais rápido!");
    }

    @Override
    public void frear() {
        System.out.println("Freando a bicicleta!");
    }

    @Override
    public void virar(String direcao) {
        System.out.println("Virando a bicicleta para " + direcao);
    }
}
