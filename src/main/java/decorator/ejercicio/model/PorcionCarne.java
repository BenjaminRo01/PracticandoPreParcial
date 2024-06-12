package decorator.ejercicio.model;

public class PorcionCarne extends PorcionAdicional{
    private Combo combo;
    private double precio;

    public PorcionCarne(Combo combo, double precio) {
        this.combo = combo;
        this.precio = precio;
    }

    @Override
    public String descripcion() {
        return combo.descripcion() + " - Porcion Adicional -> Carne";
    }

    @Override
    public double precio() {
        return this.precio + this.combo.precio();
    }
}
