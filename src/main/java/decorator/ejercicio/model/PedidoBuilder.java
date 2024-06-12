package decorator.ejercicio.model;

public class PedidoBuilder {
    private Combo comboFinal;
    public PedidoBuilder(Combo combo) {
        this.comboFinal = combo;
    }

    public PedidoBuilder conPorcionTomate(double precio){
        this.comboFinal = new PorcionTomate(this.comboFinal, precio);
        return this;
    }
    public PedidoBuilder conPorcionQueso(double precio){
        this.comboFinal = new PorcionQueso(this.comboFinal, precio);
        return this;
    }
    public PedidoBuilder conPorcionPapas(double precio){
        this.comboFinal = new PorcionPapas(this.comboFinal, precio);
        return this;
    }
    public PedidoBuilder conPorcionCarne(double precio){
        this.comboFinal = new PorcionCarne(this.comboFinal, precio);
        return this;
    }
    public Combo build(){
        return this.comboFinal;
    }
}
