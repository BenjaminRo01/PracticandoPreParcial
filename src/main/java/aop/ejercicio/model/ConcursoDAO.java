package aop.ejercicio.model;
import java.util.List;
import java.util.Optional;

public interface ConcursoDAO {
    List<Concurso> obtenerListaConcursos();
    Optional<Concurso> obtenerConcurso(String nombre);
}
