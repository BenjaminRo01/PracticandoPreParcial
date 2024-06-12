package adapter.ejercicio1.model;

public class MotorEconomico implements Motor{

    @Override
    public void arrancar() {
        System.out.println("Arranco - Motor Economico.");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelero - Motor Economico.");
    }

    @Override
    public void apagar() {
        System.out.println("Apago - Motor Economico.");
    }
}
