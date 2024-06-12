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
        this.precioCarrito = producto.precio();
        this.pesoCarrito = producto.peso();
    }
    public double calcularCostoTotal(Destino destino, int distancia){
        return this.precioCarrito + envio.calcularEnvio(this.pesoCarrito, destino, distancia);
    }
}
