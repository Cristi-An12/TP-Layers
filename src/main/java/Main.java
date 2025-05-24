package Persistencia;

import gui.AgregarParticipante;
import logica.Participantes;
import persistencia.JdbcRegistroParticipante;

import java.awt.EventQueue;
import java.sql.SQLException;
public class Main {
    public static void main(String[] args) throws SQLException {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AgregarParticipante (
                            new Participantes (
                                new JdbcRegistroParticipante (
                                        "jdbc:derby://localhost:1527/ListaParticipantes",
                                        "app",
                                        "app")));
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        });
    }
}