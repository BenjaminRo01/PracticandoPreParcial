package templatemethod.ejercicio.model;

public class Otro extends Producto{
    private static final int MIN_PRECIO_PARA_ENVIO_GRATIS = 200;
    private static final double IMPUESTO_PRODUCTO = 0.15;
    private static final double DESCUENTO_PRODUCTO = 0.05;
    private static final int MIN_PRECIO_POR_DESCUENTO = 50;
    public Otro(double precio) {
        super(precio);
    }

    @Override
    double impuestoProducto() {
        return IMPUESTO_PRODUCTO;
    }

    @Override
    double descuentoProducto() {
        return (precio > MIN_PRECIO_POR_DESCUENTO) ? DESCUENTO_PRODUCTO : 0;
    }

    @Override
    boolean esEnvioGratis() {
        return precio > MIN_PRECIO_PARA_ENVIO_GRATIS;
    }
}
