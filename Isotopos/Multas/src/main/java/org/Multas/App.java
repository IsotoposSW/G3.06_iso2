package org.Multas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;





/**
 * Hello world!
 *
 */
public class App 
{
   public boolean conectar(String username, String password){
       boolean conectado=false;
        String url = "jdbc:mysql://localhost:3306/multas?serverTimezone=UTC";
        System.out.println("Connecting database...");

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Database connected!");
            conectado=true;
            
        } catch (SQLException e) {
            System.out.println("Cannot connect the database!");
            conectado=false;
        }
        return conectado;
    }
}
