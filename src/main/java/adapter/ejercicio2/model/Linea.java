package adapter.ejercicio2.model;

import java.awt.*;

class Linea implements Figura {
    private final Coordenada coordenada;
    private int longitud;

    public Linea(Coordenada coordenada, int longitud) {
        this.longitud = longitud;
        this.coordenada = coordenada;
    }

    @Override
    public void dibujar(Panel panel) {
        panel.dibujarLinea(coordenada.x(), coordenada.y(), coordenada.x() + longitud, coordenada.y());
    }
}
