package decorator.ejercicio.main;

import decorator.ejercicio.model.*;

public class Main {
    public static void main(String[] args) {
        var pedido = new Pedido();
        pedido.agregarCombo(new PorcionPapas(new PorcionCarne(new ComboEspecial(8000),1000),800));
        pedido.agregarCombo(new PorcionTomate(new ComboBasico(6000),500));
        System.out.println(pedido.descripcionPedido());
        System.out.println(pedido.precioTotalPedido());
    }
}
