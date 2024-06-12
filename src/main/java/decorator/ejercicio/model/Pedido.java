package decorator.ejercicio.model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Combo> combo;

    public Pedido() {
        this.combo = new ArrayList<Combo>();
    }
    public void agregarCombo(Combo combo){
        this.combo.add(combo);
    }
    public String descripcionPedido(){
        String descripcion = "";
        for(var c : this.combo){
            descripcion += c.descripcion();
        }
        return descripcion;
    }
    public String precioTotalPedido(){
        return "Precio total pedido: $" + this.combo.stream().mapToDouble(c -> c.precio()).sum();
    }
}
