package composite.ejercicio1.model;

import java.util.List;

public class EmpleadoJefe implements Empleado{
    private List<Empleado> empleadosSubordinados;
    private int sueldo;

    public EmpleadoJefe(List<Empleado> empleadosSubordinados, int sueldo) {
        this.empleadosSubordinados = empleadosSubordinados;
        this.sueldo = sueldo;
    }
    @Override
    public int calcularMontoSalarial() {
        return this.sueldo + this.empleadosSubordinados.stream().mapToInt(e -> e.calcularMontoSalarial()).sum();
    }
}
