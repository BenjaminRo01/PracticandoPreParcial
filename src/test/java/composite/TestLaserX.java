package composite;
import composite.ejercicio1.model.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestLaserX {
    @Test
    public void test(){
        EmpleadoRegular empleadoRegular1 = new EmpleadoRegular(300);
        EmpleadoRegular empleadoRegular2 = new EmpleadoRegular(400);
        var liderProyecto = new EmpleadoJefe(List.of(empleadoRegular1, empleadoRegular2),
                600);
        var mandoMedio = new EmpleadoJefe(List.of(liderProyecto), 700);
        var gerente = new EmpleadoJefe(List.of(mandoMedio), 800);
        var director = new EmpleadoJefe(List.of(gerente), 900);

        var resultado = director.calcularMontoSalarial();

        Assert.assertEquals(resultado, 3700);
    }
}
