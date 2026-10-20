/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.kinal.reclutamiento.config;

/**
 *
 * @author PC
 */
public class Credentials {

    public static final String URL_DB = System.getenv("URL_MYSQL_DB")+ "/mezitas_proyect_in4bm";
    public static final String USER_MYSQL_DB = System.getenv("USER_MYSQL_DB");
    public static final String PASS_DB = System.getenv("PASS_DB");
}
    

