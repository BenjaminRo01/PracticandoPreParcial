package decorator.ejercicio.model;

public class ComboEspecial implements Combo{
    private double precio;
    public ComboEspecial(double precio) {
        this.precio = precio;
    }
    @Override
    public String descripcion() {
        return "\n- Combo Especial contiene -> Papas medianas (x1), Hamburguesa doble (x1) y Coca-cola (x1)";
    }
    @Override
    public double precio() {
        return this.precio;
    }
}
