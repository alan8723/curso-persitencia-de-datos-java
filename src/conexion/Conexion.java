/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Alhann
 */
public class Conexion {
    
    
    public Connection get_connection(){
         Connection con = null;
         
             try {
                //Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app", "root","");
                if( con != null){
                   System.out.println("conexion exitosa!!"); 
                }
                
            } catch (Exception e){
                System.err.println("Error: " +e);
                }
             return con;     
    }
         
}    

    

