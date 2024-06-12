package adapter.ejercicio2.model;

import java.awt.*;

public class PanelAdapter implements Panel{
    private Graphics2D graphics2D;

    public PanelAdapter(Graphics2D graphics2D) {
        this.graphics2D = graphics2D;
    }


    @Override
    public void dibujarCirculo(int x, int y, int ancho, int largo) {
        graphics2D.drawOval(x, y, ancho, largo);
    }

    @Override
    public void dibujarLinea(int x, int y, int x2, int y2) {
        graphics2D.drawLine(x, y, x2, y2);
    }

    @Override
    public void dibujarTexto(String texto, int x, int y) {
        graphics2D.drawString(texto, x, y);
    }
}
