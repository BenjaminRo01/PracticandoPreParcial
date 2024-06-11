package composite.ejercicio1.model;

public class EmpleadoRegular implements Empleado{
    private int sueldo;
    public EmpleadoRegular(int sueldo){
        this.sueldo = sueldo;
    }
    @Override
    public int calcularMontoSalarial() {
        return this.sueldo;
    }
}
