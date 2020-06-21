/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Jhon
 */
public class conexion {
    private String USERNAME = "root";
    private String PASSWORD = "";
    private String HOST = "localhost";
    private String PORT = "3306";
    private String DATABASE = "internet_db";
    private String CLASSNAME = "com.mysql.jdbc.Driver";
    private String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE;
    private Connection conn;

    public conexion() {
        try {
            Class.forName(CLASSNAME);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.err.println("Error:" + e);
        } catch (SQLException ex) {
            System.err.println("Error:" + ex);
        }
    }

    public Connection getconexion() {
        return conn;
    }
}
