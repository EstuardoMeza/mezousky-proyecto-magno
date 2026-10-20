/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.kinal.reclutamiento.config;

import main.java.com.kinal.reclutamiento.exception.PersistenciaException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class ConnectionDb {
   public static Connection connection;
    /*
    el singleton debe de ser privado, esto para evitar 
    que se creen instancias de esta clase
    */
    
    private ConnectionDb(){}
        //metodos
        
        public static Connection getConnectionDataBase() throws SQLException{
            if(connection == null || connection.isClosed()){
                connection = DriverManager.getConnection(Credentials.URL_DB, Credentials.USER_MYSQL_DB, Credentials.PASS_DB);
            }
            return connection;
        }

}