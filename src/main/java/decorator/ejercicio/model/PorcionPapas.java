package decorator.ejercicio.model;

public class PorcionPapas extends PorcionAdicional{
    private Combo combo;
    private double precio;

    public PorcionPapas(Combo combo, double precio) {
        this.combo = combo;
        this.precio = precio;
    }

    @Override
    public String descripcion() {
        return combo.descripcion() + " - Porcion Adicional -> Papas";
    }

    @Override
    public double precio() {
        return this.precio + this.combo.precio();
    }
}
