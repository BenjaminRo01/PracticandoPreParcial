package templatemethod.ejercicio.main;

import templatemethod.ejercicio.model.Alimento;
import templatemethod.ejercicio.model.Libro;
import templatemethod.ejercicio.model.Medicina;
import templatemethod.ejercicio.model.Otro;

public class Main {
    public static void main(String[] args) {
        var p1 = new Libro(30);
        var p2 = new Medicina(330);
        var p3 = new Alimento(130);
        var p4 = new Otro(130);
        System.out.println(p1.precioFinal());
        System.out.println(p2.precioFinal());
        System.out.println(p3.precioFinal());
        System.out.println(p4.precioFinal());
    }
}
