/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroep;

import java.sql.*;
import java.sql.Connection;

/**
 *
 * @author Familiar
 */
public class Conexion {

    private Connection cnn;

    public Conexion() {

        try {

            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            System.out.println("Error al realizar conexion... " + e.getMessage());
        }

        try {

            cnn = DriverManager.getConnection("jdbc:mysql://localhost/adsi", "root", "");
        } catch (SQLException e) {
            System.out.println("Error al conectarse con el servidor... " + e.getMessage());
        }
    }

    public void Desconectar() {
        cnn = null;
    }

    public Connection getCnn() {
        return cnn;
    }

    public void setCnn(Connection cnn) {
        this.cnn = cnn;
    }

}
