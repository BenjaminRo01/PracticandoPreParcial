package decorator.ejercicio.model;

public class PorcionTomate extends PorcionAdicional{
    private Combo combo;
    private double precio;

    public PorcionTomate(Combo combo, double precio) {
        this.combo = combo;
        this.precio = precio;
    }

    @Override
    public String descripcion() {
        return combo.descripcion() + " - Porcion Adicional -> Tomate";
    }

    @Override
    public double precio() {
        return this.precio + this.combo.precio();
    }
}
