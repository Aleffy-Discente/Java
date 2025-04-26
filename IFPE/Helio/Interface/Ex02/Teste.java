package IFPE.Helio.Interface.Ex02;

import IFPE.Helio.Interface.Ex02.model.Bicicleta;
import IFPE.Helio.Interface.Ex02.model.Carro;
import IFPE.Helio.Interface.Ex02.model.Moto;

public class Teste {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta();
        Carro carro = new Carro();
        Moto moto = new Moto();

        System.out.println("Testando Bicicleta:");
        bicicleta.acelerar();
        bicicleta.virar("direita");
        bicicleta.frear();

        System.out.println("\nTestando Carro:");
        carro.ligarMotor();
        carro.acelerar();
        carro.virar("esquerda");
        carro.frear();
        carro.desligarMotor();

        System.out.println("\nTestando Moto:");
        moto.ligarMotor();
        moto.acelerar();
        moto.virar("direita");
        moto.frear();
        moto.desligarMotor();
    }
}
