package composite;

import org.junit.Assert;
import org.junit.Test;
import strategy.model.*;

public class TestEnvios {
    @Test
    public void testEnvioCorreoArgentino(){
        var carrito = new CarritoCompras(new CorreoArgentino());
        carrito.agregarProducto(new Producto("Samsung S24", 1500000, 0.64));
        carrito.agregarProducto(new Producto("RAM 8GB DDR4 3600MHz", 30000, 0.04));
        carrito.agregarProducto(new Producto("Monitor LG 27'", 500000, 4.5));
        var resultado = carrito.calcularCostoTotal(Destino.CAPITAL_FEDERAL, 10);
        Assert.assertEquals(resultado, 2030550, 2030550);
    }
    @Test
    public void testEnvioColectivosSur(){
        var carrito = new CarritoCompras(new ColectivosSur());
        carrito.agregarProducto(new Producto("Samsung S24", 1500000, 0.64));
        carrito.agregarProducto(new Producto("RAM 8GB DDR4 3600MHz", 30000, 0.04));
        carrito.agregarProducto(new Producto("Monitor LG 27'", 500000, 4.5));
        var resultado = carrito.calcularCostoTotal(Destino.CAPITAL_FEDERAL, 10);
        Assert.assertEquals(resultado, 2031550, 2031550);
    }
}
