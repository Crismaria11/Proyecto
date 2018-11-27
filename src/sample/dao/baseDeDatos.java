package sample.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;

public class baseDeDatos {


    String jdbcUrl = "jdbc:postgresql://localhost:5432/Peliculas";
    String username = "postgres";
    String password = "27200";


    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;


    public baseDeDatos() {
    }

    /**
     * Connect to a database
     */
    public void connect() {
        try {

            conn = DriverManager.getConnection(jdbcUrl, username, password);


            System.out.println("Estado: Connexion establecida");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Desconectar
     */
    public void disconne() {
        try {


            if (stmt != null) {
                stmt.close();
            }
            if (rs != null) {
                rs.close();
            }
            if (conn != null) {
                conn.close();
            }

            System.out.println("DbAdapter: Connection to database closed");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}