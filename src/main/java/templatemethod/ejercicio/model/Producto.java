package templatemethod.ejercicio.model;

abstract class Producto {
    private static final int DESCUENTO_POR_ENVIO_GRATIS = 10;
    protected double precio;

    public Producto(double precio) {
        this.precio = precio;
    }

    public double precioFinal() {
        double total = precio * (1 + this.impuestoProducto()) * (1 - this.descuentoProducto());
        if (this.esEnvioGratis()) {
            total -= DESCUENTO_POR_ENVIO_GRATIS;
        }
        return total;
    }

    abstract double impuestoProducto();
    abstract double descuentoProducto();
    abstract boolean esEnvioGratis();

}
