package decorator.ejercicio.main;

import decorator.ejercicio.model.*;

public class Main {
    public static void main(String[] args) {
        //USANDO DECORATOR
//        var pedido = new Pedido();
//        pedido.agregarCombo(new PorcionPapas(new PorcionCarne(new ComboEspecial(8000),1000),800));
//        pedido.agregarCombo(new PorcionQueso(new PorcionTomate(new ComboBasico(6000),500),600));
//        System.out.println(pedido.descripcionPedido());
//        System.out.println(pedido.precioTotalPedido());

        //USANDO BUILDER
        var pedido1 = new Pedido();

        var comboBuilder1 = new PedidoBuilder(new ComboEspecial(8000));
        comboBuilder1.conPorcionPapas(1000).conPorcionCarne(800);

        var comboBuilder2 = new PedidoBuilder(new ComboBasico(6000));
        comboBuilder2.conPorcionTomate(500).conPorcionQueso(600);

        pedido1.agregarCombo(comboBuilder1.build());
        pedido1.agregarCombo(comboBuilder2.build());

        System.out.println("Pedido usando Builder:");
        System.out.println(pedido1.descripcionPedido());
        System.out.println(pedido1.precioTotalPedido());
        System.out.println();
    }
}
