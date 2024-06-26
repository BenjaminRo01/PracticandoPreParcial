package observer.ejercicio.main;

import observer.ejercicio.database.JdbcDatabaseParticipantes;
import observer.ejercicio.mail.EmailNotificacion;
import observer.ejercicio.model.AgregarParticipante;
import observer.ejercicio.ui.VentanaAgregarParticipante;

import java.awt.*;
import java.util.List;

public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/tp-4";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                String from = "from@example.com";
                String username = "c276e21b0ab06a";
                String password = "3416ef01d5a717";
                String host = "sandbox.smtp.mailtrap.io";
                String port = "2525";
                var agregarParticipante = new AgregarParticipante(
                        new JdbcDatabaseParticipantes(URL, USER, PASSWORD),
                        List.of(new EmailNotificacion(host,port,username,password,from)));
                new VentanaAgregarParticipante(agregarParticipante).setupUIComponents();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }
}