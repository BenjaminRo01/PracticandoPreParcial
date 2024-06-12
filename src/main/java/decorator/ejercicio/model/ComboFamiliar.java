package decorator.ejercicio.model;

public class ComboFamiliar implements Combo{
    private double precio;
    public ComboFamiliar(double precio) {
        this.precio = precio;
    }
    @Override
    public String descripcion() {
        return "\n- Combo Familiar contiene -> Papas medianas (x4), Hamburguesa doble (x4) y Coca-cola (x4)";
    }
    @Override
    public double precio() {
        return this.precio;
    }
}
