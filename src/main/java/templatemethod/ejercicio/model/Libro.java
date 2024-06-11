package templatemethod.ejercicio.model;

public class Libro extends Producto{

    private static final int MIN_PRECIO_PARA_ENVIO_GRATIS = 100;
    private static final double IMPUESTO_PRODUCTO = 0.1;
    public static final double DESCUENTO_PRODUCTO = 0.1;

    public Libro(double precio) {
        super(precio);
    }

    @Override
    double impuestoProducto() {
        return IMPUESTO_PRODUCTO;
    }

    @Override
    double descuentoProducto() {
        return DESCUENTO_PRODUCTO;
    }

    @Override
    boolean esEnvioGratis() {
        return precio > MIN_PRECIO_PARA_ENVIO_GRATIS;
    }
}
