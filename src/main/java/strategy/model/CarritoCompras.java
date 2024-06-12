package strategy.model;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompras {
    private List<Producto> productos;
    private StrategyEnvio envio;
    private double pesoCarrito;
    private double precioCarrito;

    public CarritoCompras(StrategyEnvio envio) {
        this.productos = new ArrayList<>();
        this.envio = envio;
    }
    public void agregarProducto(Producto producto){
        this.productos.add(producto);
        this.actualizarPrecioCarrito(producto);
        this.actualizarPesoCarrito(producto);
    }
    private void actualizarPesoCarrito(Producto producto) {
        this.pesoCarrito = producto.peso();
    }
    private void actualizarPrecioCarrito(Producto producto) {
        this.precioCarrito = producto.precio();
    }

    public double calcularCostoTotal(Destino destino, int distancia){
        return this.precioCarrito + envio.calcularEnvio(this.pesoCarrito, destino, distancia);
    }
}
