package adapter.ejercicio1.model;

public class MotorComun implements Motor{
    @Override
    public void arrancar() {
        System.out.println("Arranco - Motor Comun.");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelero - Motor Comun.");
    }

    @Override
    public void apagar() {
        System.out.println("Apago - Motor Comun.");
    }
}
