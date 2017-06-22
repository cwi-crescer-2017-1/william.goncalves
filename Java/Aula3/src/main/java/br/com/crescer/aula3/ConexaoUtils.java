package br.com.crescer.aula3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public final class ConexaoUtils{

    final static String url = "jdbc:oracle:thin:@localhost:1521:xe";
    final static String user = "JAVA_AULAS";
    final static String pass = "JAVA";

    public static Connection getConection(){
        try (final Connection connection = DriverManager.getConnection(url, user, pass)) {
            System.out.println("Logado!");
            return connection;
        } catch (final SQLException e) {
            System.err.format("SQLException: %s", e);
            return null;
        }
    }
}
