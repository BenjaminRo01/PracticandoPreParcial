package decorator.ejercicio.model;

public class PorcionQueso extends PorcionAdicional{
    private Combo combo;
    private double precio;

    public PorcionQueso(Combo combo, double precio) {
        this.combo = combo;
        this.precio = precio;
    }

    @Override
    public String descripcion() {
        return combo.descripcion() + " - Porcion Adicional -> Queso";
    }

    @Override
    public double precio() {
        return this.precio + this.combo.precio();
    }
}
