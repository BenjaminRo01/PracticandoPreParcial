package observer.ejercicio.model;

import java.util.List;

abstract class Observable {
    private List<Observer> observers;

    public Observable(List<Observer> observers) {
        this.observers = observers;
    }
    public void notificar(String nombre, String email){
        this.observers.stream().forEach(o -> o.actualizar(nombre, email));
    }
}
