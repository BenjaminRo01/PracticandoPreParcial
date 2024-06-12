package strategy.model;

public class ColectivosSur implements StrategyEnvio{
    public static final double PESO_MAX = 30.0;
    public static final double PESO_MIN = 5.0;
    public static final double COSTO_POR_PESO_MAX = 2000.0;
    public static final double COSTO_POR_PESO_MIN = 500.0;
    public static final double MONTO_FIJO_CAPITAL_FEDERAL = 1000.0;
    public static final double MONTO_FIJO_GRAN_BS_AS = 1500.0;
    public static final double MONTO_FIJO_OTRO_DESTINO = 3000.0;

    @Override
    public double calcularEnvio(double peso, Destino destino, int distancia) {
        double montoFijo = 0.0;
        if(destino.equals(Destino.CAPITAL_FEDERAL)){
            montoFijo = MONTO_FIJO_CAPITAL_FEDERAL;
        } else if (destino.equals(Destino.GRAN_BS_AS)) {
            montoFijo = MONTO_FIJO_GRAN_BS_AS;
        }
        else {
            montoFijo = MONTO_FIJO_OTRO_DESTINO;
        }
        return montoFijo + this.costoPorPeso(peso);
    }
    private double costoPorPeso(double peso){
        double costo = 0.0;
        if (peso > PESO_MAX){
            costo += COSTO_POR_PESO_MAX;
        } else if (peso > PESO_MIN) {
            costo += COSTO_POR_PESO_MIN;
        }
        return costo;
    }
}
