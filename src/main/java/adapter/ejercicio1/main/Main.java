package adapter.ejercicio1.main;

import adapter.ejercicio1.model.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var motorComun = new MotorComun();
        var motorEco = new MotorEconomico();
        var motorElectrico = new MotorElectricoAdapter(new MotorElectrico());

        List<Motor> motores = List.of(motorComun,motorEco,motorElectrico);

        for (var m : motores){
            m.arrancar();
            System.out.println();
            m.acelerar();
            System.out.println();
            m.apagar();
            System.out.println();
        }
    }
}
