package aop.ejercicio.persistent;

import aop.ejercicio.model.Concurso;
import aop.ejercicio.model.Inscripcion;
import aop.ejercicio.model.InscripcionDAO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class InscripcionTxtDAO implements InscripcionDAO {
    private final String path;
    public InscripcionTxtDAO(String path){
        this.path = path;
    }
    @Override
    public void agregarInscripcion(Inscripcion inscripcion, Concurso concurso) {
        try{
            String registroInscripcion = "\n" + inscripcion.apellido() + "," + inscripcion.nombre() + "," +
                    inscripcion.telefono() + "," + inscripcion.email() + "," + concurso.id();
            Files.write(Paths.get(this.path),
                    registroInscripcion.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
