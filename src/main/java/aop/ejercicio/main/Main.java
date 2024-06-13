package aop.ejercicio.main;

import aop.ejercicio.model.ConcursoManager;
import aop.ejercicio.persistent.ConcursoJdbcDAO;
import aop.ejercicio.persistent.ConcursoTxtDAO;
import aop.ejercicio.persistent.InscripcionJdbcDAO;
import aop.ejercicio.persistent.InscripcionTxtDAO;
import aop.ejercicio.ui.RadioCompetition;

import javax.swing.*;

public class Main {

    public static final String URL_LOCALHOST = "jdbc:mysql://localhost:3306/tp-4";
    public static final String USER_HOST = "root";
    public static final String USER_PWD = "";
    public static final String PATH_FILE_CONCURSOS_TXT = "src/main/resources/concursos.txt";
    public static final String PATH_FILE_INSCRIPTOS_TXT = "src/main/resources/inscriptos.txt";

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new Main().start();
                } catch (Exception e) {
                    // log exception...
                    throw new RuntimeException(e);
                }
            }
        });
    }
    private void start() {
        new RadioCompetition(
                new ConcursoManager(
                        new ConcursoTxtDAO(PATH_FILE_CONCURSOS_TXT),
                        new InscripcionTxtDAO(PATH_FILE_INSCRIPTOS_TXT)));
//        new RadioCompetition(
//                new ConcursoManager(
//                        new ConcursoJdbcDAO(URL_LOCALHOST, USER_HOST, USER_PWD),
//                        new InscripcionJdbcDAO(URL_LOCALHOST, USER_HOST, USER_PWD)));
    }
}