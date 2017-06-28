/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.crescer.aula3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author william.goncalves
 */
public class ExemploDDL {
    
    private static final String DML = "CREATE TABLE TESTE ( \n"
            + "  ID NUMBER(8) NOT NULL,\n"
            + "  NOME VARCHAR2(60) DEFAULT NULL, \n"
            + "  SIGLA VARCHAR2(10) DEFAULT NULL, \n"
            + "  CONSTRAINT TESTE_PK PRIMARY KEY (ID)  ENABLE \n"
            + ")";
    
    public static void main(String[] args) {

        final String url = "jdbc:oracle:thin:@localhost:1521:xe";
        final String user = "JAVA_AULAS";
        final String pass = "JAVA";

        try (final Connection connection = DriverManager.getConnection(url, user, pass)) {

            //final String query = "SELECT * FROM PAIS";
            
            final Statement statement = connection.createStatement();
            statement.executeQuery(DML);

            //while (resultSet.next()) {
            //    System.out.println(resultSet.getString("Nome"));
            //}
        } catch (SQLException e) {
            System.err.format("SQLException: %s", e);
        }
    }
}
