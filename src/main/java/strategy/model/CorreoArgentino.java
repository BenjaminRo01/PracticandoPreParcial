package strategy.model;

public class CorreoArgentino implements StrategyEnvio{
    private static final int COEFICIENTE_POR_DISTANCIA = 5;
    public static final double MONTO_FIJO_CAPITAL_FEDERAL = 500.0;
    public static final int MONTO_FIJO_OTRO_DESTINO = 800;

    public double calcularEnvio(double peso, Destino destino, int distancia) {
        double montoFijo = 0.0;
        if(destino.equals(Destino.CAPITAL_FEDERAL)){
            montoFijo = MONTO_FIJO_CAPITAL_FEDERAL;
        }
        else{
            montoFijo = MONTO_FIJO_OTRO_DESTINO;
        }
        return montoFijo + this.costoPorDistancia(distancia);
    }
    private double costoPorDistancia(int distancia){
        return distancia * COEFICIENTE_POR_DISTANCIA;
    }
}
