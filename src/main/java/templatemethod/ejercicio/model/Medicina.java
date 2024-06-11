package templatemethod.ejercicio.model;

public class Medicina extends Producto{
    private static final int MIN_PRECIO_PARA_ENVIO_GRATIS = 100;
    private static final double IMPUESTO_PRODUCTO = 0;
    private static final double DESCUENTO_PRODUCTO = 0.1;
    private static final int MIN_PRECIO_POR_DESCUENTO = 50;
    public Medicina(double precio) {
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
