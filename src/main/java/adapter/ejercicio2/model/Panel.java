package adapter.ejercicio2.model;

public interface Panel {
    void dibujarCirculo(int x, int y, int ancho, int largo);
    void dibujarLinea(int x, int y, int x2, int y2);
    void dibujarTexto(String texto, int x, int y);
}
