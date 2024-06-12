package decorator.ejercicio.model;

public class ComboBasico implements Combo{
    private double precio;
    public ComboBasico(double precio) {
        this.precio = precio;
    }
    @Override
    public String descripcion() {
        return "\n- Combo Básico contiene -> Papas chicas (x1), Hamburguesa simple (x1) y Coca-cola (x1)";
    }
    @Override
    public double precio() {
        return this.precio;
    }
}
