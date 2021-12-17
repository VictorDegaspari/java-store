/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.*;

public class BD {

    public Connection connection;
    private final String DRIVER = "org.postgresql.Driver";
    private final String DBNAME = "JavaStore";
    private final String URL = "jdbc:postgresql://localhost:5432/" + DBNAME;
    private final String LOGIN = "postgres";
    private final String PASSWORD = "secret";

    public boolean getConnection() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            System.out.println("Conectou");
            return true;

        } catch (ClassNotFoundException erro) {
            System.out.println("Driver nao encontrado " + erro.toString());
            return false;
        } catch (SQLException erro) {
            System.out.println("Problemas na conexao com a fonte de dados!\n" + erro.toString());
            return false;
        }
    }

    public void close() {
        try {
            connection.close();
            System.out.println("Desconectou");
        } catch (SQLException erro) {
        }
    }
}